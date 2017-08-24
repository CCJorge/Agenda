/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author JORGE
 */
public class Check {

    public static boolean string(String string) {
        String regex = "[\\w\\s]*";
        boolean ret = string.matches(regex);

        return ret;
    }

    public static boolean telefone(String telefone) {
        String regex = "\\d*";
        boolean ret = true
                ? telefone.matches(regex) && telefone.length() == 8 || telefone.matches(regex) && telefone.length() == 10
                : false;

        return ret;
    }

    public static boolean celular(String celular) {
        String regex = "\\d*";
        boolean ret = true
                ? celular.matches(regex) && celular.length() == 9 || celular.matches(regex) && celular.length() == 11
                : false;

        return ret;
    }

    public static boolean email(String email) {
        String regex = "\\w*@\\w*\\.\\w{2,3}\\.{0,1}\\w{0,2}";
        boolean ret = true
                ? email.length() > 15 && email.matches(regex)
                : false;

        return ret;
    }
}
