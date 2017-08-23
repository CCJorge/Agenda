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
 *
 * @author JORGE
 */
public class Agenda {

    private String nome;
    private String email;
    private String celular;
    private String telefone;
    private static ArrayList<Agenda> contatos = new ArrayList<Agenda>();

    public Agenda(String nome, String celular, String email, String telefone) {
        this.setCelular(celular);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        contatos.add(this);
    }

    public static void lista() {
        for (Agenda contato : contatos) {
            System.out.println(contato.getNome() + " - "
                    + contato.getEmail() + " - "
                    + contato.getCelular() + " - "
                    + contato.getTelefone());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (Check.string(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Check.email(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("E-mail inválido");
        }
    }

    public String getCelular() {
        return Format.celular(celular);
    }

    public void setCelular(String celular) {
        if (Check.celular(celular)) {
            this.celular = celular;
        } else {
            throw new IllegalArgumentException("Numero inválido");
        }
    }

    public String getTelefone() {
        return Format.telefone(telefone);
    }

    public void setTelefone(String telefone) {
        if (Check.telefone(telefone)) {
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("Numero inválido");
        }
    }
}
