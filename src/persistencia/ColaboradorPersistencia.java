/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelos.classes.Colaborador;
import modelos.interfaces.ICRUDColaborador;
import modelos.utilidades.CreateServer;
import modelos.utilidades.GeradorID;
import modelos.utilidades.enums.TipoDeColadoradores;
import modelos.utilidades.enums.TipoDeStatus;

/**
 *
 * @author marcos
 */
public class ColaboradorPersistencia implements ICRUDColaborador {

    /**
     * #Atributos
     */
    private String nomeDoArquivoNoDisco = "";

    /**
     * #Métodos
     *
     * @param nomeDoArquivoNoDisco
     */
    public ColaboradorPersistencia(String nomeDoArquivoNoDisco) {
        this.nomeDoArquivoNoDisco = nomeDoArquivoNoDisco;
    }

    /**
     *
     * @param objeto
     * @throws Exception
     */
    @Override
    public void incluir(Colaborador objeto) throws Exception {
        try {
            GeradorID gId = new GeradorID();
            objeto.setId(gId.getID());
            gId.finalize();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            BufferedWriter bw = new BufferedWriter(fw);

            try {
                CreateServer comunicacao = new CreateServer();
                comunicacao.getComunicacao().enviarMensagem("post", objeto.getClass().getSimpleName(), objeto.toString() + "\n");
                comunicacao.getComunicacao().fecharConexao();
                bw.write(objeto.toString() + "\n");
                bw.close();
            } catch (Exception e) {
                bw.write(objeto.toString() + "\n");
                bw.close();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /**
     *
     * @param velhoColaborador
     * @param novoColaborador
     * @throws Exception
     */
    @Override
    public void alterar(Colaborador velhoColaborador, Colaborador novoColaborador) throws Exception {
        try {

            ArrayList<Colaborador> listaDeColaborador = listagem();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            novoColaborador.setId(velhoColaborador.getId());
            for (Colaborador colaborador : listaDeColaborador) {
                if (colaborador.getId() != velhoColaborador.getId()) {
                    bw.write(colaborador.toString() + "\n");
                } else {
                    bw.write(novoColaborador.toString() + "\n");
                }
            }

            bw.close();

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param colaborador
     * @throws Exception
     */
    @Override
    public void deletar(Colaborador colaborador) throws Exception {
        try {
            ArrayList<Colaborador> lista = listagem();

            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Colaborador colaborador1 : lista) {
                if (colaborador.getId() != colaborador1.getId()) {
                    bw.write(colaborador1.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception e) {
        }
    }

    /**
     *
     * @return @throws Exception
     */
    @Override
    public ArrayList<Colaborador> listagem() throws Exception {
        try {
            ArrayList<Colaborador> listaDeColaboradores = new ArrayList<>();

            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);

            String linha = "";
            while ((linha = br.readLine()) != null) {
                String[] vetor = linha.split(";");
                int id = Integer.parseInt(vetor[0]);
                int matricula = Integer.parseInt(vetor[1]);
                String nome = vetor[2];
                int OAB = Integer.parseInt(vetor[3]);
                String email = vetor[4];
                int ddd = Integer.parseInt(vetor[5]);
                int telefone = Integer.parseInt(vetor[6]);
                TipoDeColadoradores tipoDeColaborador = TipoDeColadoradores.valueOf(vetor[7]);
                TipoDeStatus tipoDeStatus = TipoDeStatus.valueOf(vetor[8]);
                String uf = vetor[9];
                Colaborador c = new Colaborador(matricula, nome, OAB, email, ddd, telefone, tipoDeColaborador, tipoDeStatus,uf);
                
                c.setId(id);
                listaDeColaboradores.add(c);
            }
            return listaDeColaboradores;

        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param nome
     * @return
     * @throws Exception
     */
    @Override
    public Colaborador getColaborador(String nome) throws Exception {
        try {
            ArrayList<Colaborador> listaDeColaboradores = listagem();
            for (Colaborador colaborador : listaDeColaboradores) {
                if (colaborador.getNome().equals(nome)) {
                    return colaborador;
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

    @Override
    public Colaborador getColaborador(int id) throws Exception {
        try {
            ArrayList<Colaborador> listaDeColaboradores = listagem();
            for (Colaborador colaborador : listaDeColaboradores) {
                if (colaborador.getId() == (id)) {
                    return colaborador;
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

}
