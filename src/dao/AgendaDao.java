/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Agenda;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * <h1>Classe AgendaDao</h1>
 * Cria e manipula objetos do tipo JSON e grava em um arquivo
 *
 * @author aluno
 */
public class AgendaDao {

    private static final String JSON_END = "dados\\AgendaJSON.txt";

    /**
     * Recebe um ArrayList de objetos Agenda e grava em formato JSON
     *
     * @param lista Lista de contatos a ser gravada
     */
    public static void gravar(ArrayList<Agenda> lista) {
        JSONArray jLista = new JSONArray();
        for (Agenda contato : lista) {
            JSONObject obj = new JSONObject();

            obj.put("nome", contato.getNome());
            obj.put("celular", contato.getCelular(false));
            obj.put("email", contato.getEmail());
            obj.put("telefone", contato.getTelefone(false));

            jLista.add(obj);
        }
        try {
            FileWriter arq;
            arq = new FileWriter(
                    JSON_END,
                    false);

            arq.write(jLista.toJSONString());
            arq.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro na gravação do arquivo");
        }
    }

    /**
     * Carrega os contatos do arquivo JSON na ArrayList de contatos
     */
    public static void carregar() {
        File arq = new File(JSON_END);
        boolean leArquivo = (arq.exists() && arq.canRead());
        if (leArquivo) {
            JSONParser parser = new JSONParser();
            try {
                JSONArray list = (JSONArray) (parser.parse(new FileReader(JSON_END)));
                for (int i = 0; i < list.size(); i++) {
                    JSONObject obj = (JSONObject) list.get(i);
                    String nome = obj.get("nome").toString();
                    String celular = obj.get("celular").toString();
                    String email = obj.get("email").toString();
                    String telefone = obj.get("telefone").toString();
                    new Agenda(nome, celular, email, telefone);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
