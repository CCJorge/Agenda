/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 * <h1>Classe Format</h1>
 * Essa class é responsável pela formatação de strings
 *
 * @author JORGE
 */
public class Format {

    /**
     * Esse método formata um celular em String para 99-99999-9999 caso tenha 11
     * digitos ou para 99999-9999 caso tenha 9 digitos
     *
     * @param celular O número de celular em uma String
     * @return O número de celular formatado em uma String
     */
    public static String celular(String celular) {
        String ret = "";
        switch (celular.length()) {
            case 9:
                ret = celular.substring(0, 5) + "-"
                        + celular.substring(5);
                break;
            case 11:
                ret = "(" + celular.substring(0, 2) + ")"
                        + celular.substring(2, 6) + "-"
                        + celular.substring(6);
                break;
        }
        return ret;
    }

    /**
     * Esse método formata um telefone em String para 99-9999-9999 caso tenha 10
     * digitos ou para 9999-9999 caso tenha 8 digitos
     *
     * @param telefone O número de celular em uma String
     * @return O número de telefone formatado em uma String
     */
    public static String telefone(String telefone) {
        String ret = "";
        switch (telefone.length()) {

            case 8:
                ret = telefone.substring(0, 4) + "-"
                        + telefone.substring(4);
                break;
            case 10:
                ret = "(" + telefone.substring(0, 2) + ")"
                        + telefone.substring(2, 6) + "-"
                        + telefone.substring(6);
                break;
        }
        return ret;
    }
}
