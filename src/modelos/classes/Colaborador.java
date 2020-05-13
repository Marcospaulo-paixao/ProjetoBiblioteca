/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.classes;

/**
 *
 * @author marcos
 */
public class Colaborador {

    /**
     * #Atributos
     */
    private int id = 0;
    private int matricula = 0;
    private String nome = "";
    private int OAB = 0;
    private String email = "";
    private int telefone = 0;
    private String tipoDeColaborador = "";
    private boolean tipoDeStatus = false;

    /**
     * #Métedos
     */
    /**
     * @default
     */
    public Colaborador() {
        id = 0;
        matricula = 0;
        nome = "";
        OAB = 0;
        email = "";
        telefone = 0;
        tipoDeColaborador = "";
        tipoDeStatus = false;
    }

    /**
     *
     * @param matricula
     * @param nome
     * @param OAB
     * @param email
     * @param telefone
     * @param tipoDeColaborador
     * @param tipoDeStatus
     */
    public Colaborador(int id,int matricula, String nome, int OAB, String email,
            int telefone, String tipoDeColaborador, boolean tipoDeStatus) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.OAB = OAB;
        this.email = email;
        this.telefone = telefone;
        this.tipoDeColaborador = tipoDeColaborador;
        this.tipoDeStatus = tipoDeStatus;
    }

    /**
     *
     * @param objeto
     */
    public Colaborador(Colaborador objeto) {
        this.id = objeto.id;
        this.matricula = objeto.matricula;
        this.nome = objeto.nome;
        this.OAB = objeto.OAB;
        this.email = objeto.email;
        this.telefone = objeto.telefone;
        this.tipoDeColaborador = objeto.tipoDeColaborador;
        this.tipoDeStatus = objeto.tipoDeStatus;

    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the OAB
     */
    public int getOAB() {
        return OAB;
    }

    /**
     * @param OAB the OAB to set
     */
    public void setOAB(int OAB) {
        this.OAB = OAB;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the tipoDeColaborador
     */
    public String getTipoDeColaborador() {
        return tipoDeColaborador;
    }

    /**
     * @param tipoDeColaborador the tipoDeColaborador to set
     */
    public void setTipoDeColaborador(String tipoDeColaborador) {
        this.tipoDeColaborador = tipoDeColaborador;
    }

    /**
     * @return the tipoDeStatus
     */
    public boolean isTipoDeStatus() {
        return tipoDeStatus;
    }

    /**
     * @param tipoDeStatus the tipoDeStatus to set
     */
    public void setTipoDeStatus(boolean tipoDeStatus) {
        this.tipoDeStatus = tipoDeStatus;
    }

    @Override
    public String toString() {
        String saida = id + ";";
        saida += matricula + ";";
        saida += nome + ";";
        saida += OAB + ";";
        saida += email + ";";
        saida += telefone + ";";
        saida += tipoDeColaborador + ";";
        saida += tipoDeStatus + ";";

        return saida;
    }

}
