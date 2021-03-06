package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelos.classes.Editora;
import modelos.utilidades.CreateServer;
import modelos.utilidades.GeradorID;
import modelos.interfaces.ICRUDEditora;

public class EditoraPersistencia implements ICRUDEditora {

    private String nomeDoArquivoNoDisco;

    public EditoraPersistencia(String nomeDoArquivo) {
        this.nomeDoArquivoNoDisco = nomeDoArquivo;
    }

    @Override
    public void incluir(Editora editoraObjeto) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            editoraObjeto.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);
            try {
                CreateServer comunicacao = new CreateServer();
                comunicacao.getComunicacao().enviarMensagem("post", editoraObjeto.getClass().getSimpleName(), editoraObjeto.toString() + "\n");
                comunicacao.getComunicacao().fecharConexao();
            } catch (Exception e) {
                bw.write(editoraObjeto.toString() + "\n");
            } finally {
                bw.close();
            }
        } catch (IOException errorEditora) {
            throw errorEditora;
        }
    }

    @Override
    public void alterar(Editora antigoEditora, Editora atualEditora) throws Exception {
        try {

            ArrayList<Editora> listaDeAutores = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Editora editora : listaDeAutores) {
                if (!editora.getNome().equalsIgnoreCase(antigoEditora.getNome())) {
                    bw.write(editora.toString() + "\n");
                } else {
                    bw.write(atualEditora.toString() + "\n");
                }
            }
            bw.close();
        } catch (Exception erroEditoraAlterar) {
            throw erroEditoraAlterar;
        }
    }

    @Override
    public ArrayList<Editora> listagem() throws Exception {
        try {
            Editora editoraLis = null;
            ArrayList<Editora> listaDeEditoras = new ArrayList<>();

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                String nome = vetor[1];
                String descricao = vetor[2];
                editoraLis = new Editora(id, nome, descricao);
                listaDeEditoras.add(editoraLis);
            }

            return listaDeEditoras;
        } catch (Exception erroConsultaAutor) {
            throw erroConsultaAutor;
        }
    }

    @Override
    public void excluir(String nome) throws Exception {
        try {
            ArrayList<Editora> listaDeEditoras = listagem();
            FileWriter fr = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter br = new BufferedWriter(fr);

            for (int pos = 0; pos < listaDeEditoras.size(); pos++) {
                Editora aux = listaDeEditoras.get(pos);

                if (!nome.equalsIgnoreCase(aux.getNome())) {
                    br.write(aux.toString() + "\n");
                }
            }
            br.close();
        } catch (FileNotFoundException editoraError) {
            throw editoraError;
        }
    }

    @Override
    public Editora getEditoraNome(String nomeEditora) throws Exception {
        ArrayList<Editora> editoras = listagem();
        for (Editora editoraNaLista : editoras) {
            if (editoraNaLista.getNome().equalsIgnoreCase(nomeEditora)) {
                return editoraNaLista;
            }
        }
        return null;
    }

    @Override
    public Editora getEditoraId(int idEditora) throws Exception {
        ArrayList<Editora> editoras = listagem();
        for (Editora editoraNaLista : editoras) {
            if (editoraNaLista.getId() == idEditora) {
                return editoraNaLista;
            }
        }
        return null;
    }
}
