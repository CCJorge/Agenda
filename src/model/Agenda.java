/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import utils.Check;
import utils.Format;

/**
 * <h1>Classe Agenda</h1>
 * Classe para objetos do tipo agenda onde serão contidos atributos e métodos
 * pertinentes para o mesmo
 *
 * @author JORGE
 */
public class Agenda {

    private String nome = "";
    private String email = "";
    private String celular = "";
    private String telefone = "";
    private static ArrayList<Agenda> contatos = new ArrayList<Agenda>();

    /**
     * Constrói um objeto do tipo agenda
     *
     * @param nome
     * @param celular
     * @param email
     * @param telefone
     */
    public Agenda(String nome, String celular, String email, String telefone) {
        this(nome, celular);
        this.setEmail(email);
        this.setTelefone(telefone);

    }

    /**
     * Constrói um objeto do tipo Agenda,
     *
     * @param nome
     * @param celular
     */
    public Agenda(String nome, String celular) {
        this.setCelular(celular);
        this.setNome(nome);
        contatos.add(this);

    }

    /**
     * Lista todos os contatos da ArrayList no terminal
     */
    /*public static void lista() {
        for (Agenda contato : contatos) {
            System.out.println(contato.getNome() + " - "
                    + contato.getEmail() + " - "
                    + contato.getCelular() + " - "
                    + contato.getTelefone());
        }
    }*/

    /**
     * Retorna o nome de um objeto do tipo Agenda
     *
     * @return O nome do objeto em uma String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para setar o nome de um objeto do tipo Agenda
     *
     * @param nome
     */
    public void setNome(String nome) {
        if (!Check.string(nome)) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    /**
     * Método para retorno do email de um objeto do tipo Agenda
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para setar o email de um objeto do tipo Agenda
     *
     * @param email
     */
    public void setEmail(String email) {
        if (!Check.email(email)) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        this.email = email;

    }

    /**
     * Método para retorno do celualar de um objeto do tipo Agenda
     *
     * @return o número do celular
     */
    public String getCelular() {
        return Format.celular(this.celular);
    }

    /**
     * Retorna o celular do contato
     *
     * @param formatado true - formata o numero de celular false - retorna sem
     * formatação
     * @return o número de celular
     */
    public String getCelular(boolean formatado) {
        if (formatado) {
            return getCelular();
        } else {
            return this.celular;
        }
    }

    /**
     * Método para setar o celular de um objeto do tipo Agenda
     *
     * @param celular
     */
    public void setCelular(String celular) {
        if (!Check.celular(celular)) {
            throw new IllegalArgumentException("Numero de celular inválido");
        }
        this.celular = celular;
    }

    /**
     * Método para retorno do telefone de um objeto do tipo Agenda
     *
     * @return o telefone formatado
     */
    public String getTelefone() {
        return Format.telefone(telefone);
    }

    /**
     * Método para retorno do telefone de um objeto do tipo Agenda
     *
     * @param formatado true - retorna o telefone formatado false - retorna o
     * telefone sem formatacao
     * @return
     */
    public String getTelefone(boolean formatado) {
        //return Format.telefone(telefone);
        if (formatado) {
            return getTelefone();
        } else {
            return this.telefone;
        }
    }

    /**
     * Método para setar o telefone de um objeto do tipo Agenda
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        if (!Check.telefone(telefone)) {
            throw new IllegalArgumentException("Numero de telefone inválido");
        }
        this.telefone = telefone;
    }

    /**
     * Metodo para retorno do ArrayLista contatos
     *
     * @deprecated Não eh mais usado
     * @return retorna o ArrayList contatos
     */
    public static ArrayList<String[]> getContatosArray() {
        ArrayList<String[]> row = new ArrayList<String[]>();

        for (Agenda contato : Agenda.contatos) {
            row.add(new String[]{
                contato.getNome(),
                contato.getCelular(),
                contato.getEmail(),
                contato.getTelefone()
            });
        }
        return row;
    }

    public static ArrayList<Agenda> getContatos() {
        return contatos;
    }

}
