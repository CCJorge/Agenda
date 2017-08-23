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
public class Format {

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
