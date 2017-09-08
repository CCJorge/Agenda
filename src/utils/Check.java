/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * <h1>Classe Check</h1>
 * Esta classe é utilizada para fornecer métodos de checagem de parâmetros de
 * entrada
 *
 * @author JORGE
 * @version 1.0
 */
public class Check {

    /**
     * Esse método verifica se uma string segue um padrão de caractéres [\\w\\s]
     * (sem caracteres especiais e com espaço) e retorna um booleano indicando
     * se é verdadeiro ou falso
     *
     * @param string Uma string a ser verificada
     * @return Um booleano indicando se a verificação deu certo ou não
     */
    public static boolean string(String string) {
        String regex = "[\\w\\s]*";
        boolean ret = string.matches(regex);

        return ret;
    }

    /**
     * Esse método verifica se uma string segue um padrão de caractéres \\d*
     * (apenas caracteres regulares e números) e retorna um booleano indicando
     * se é verdadeiro ou falso se o tamanho da string for 9 ou 11
     *
     * @param string Uma string a ser verificada
     * @return Um booleano indicando se a verificação deu certo ou não
     */
    public static boolean telefone(String telefone) {
        String regex = "\\d*";
        boolean ret = true
                ? telefone.matches(regex) && telefone.length() == 8 || telefone.matches(regex) && telefone.length() == 10
                : false;

        return ret;
    }

    /**
     * Esse método verifica se uma string segue um padrão de caractéres \\d*
     * (apenas caracteres regulares e números) e retorna um booleano indicando
     * se é verdadeiro ou falso se o tamanho da string for 9 ou 11
     *
     * @param string Uma string a ser verificada
     * @return Um booleano indicando se a verificação deu certo ou não
     */
    public static boolean celular(String celular) {
        String regex = "\\d*";
        boolean ret = true
                ? celular.matches(regex) && celular.length() == 9 || celular.matches(regex) && celular.length() == 11
                : false;

        return ret;
    }

    /**
     * Esse método verifica se uma string segue um padrão de caractéres
     * \\w*@\\w*\\.\\w{2,3}\\.{0,1}\\w{0,2} ou seja, verifica se a String é
     * compatível com os caracteres regulares de um e-mail e retorna um booleano
     * indicando se é verdadeiro ou falso se o tamanho da string for 9 ou 11
     *
     * @param string Uma string a ser verificada
     * @return Um booleano indicando se a verificação deu certo ou não
     */
    public static boolean email(String email) {
        String regex = "\\w*@\\w*\\.\\w{2,3}\\.{0,1}\\w{0,2}";
        boolean ret = true
                ? email.length() > 15 && email.matches(regex)
                : false;

        return ret;
    }
}
