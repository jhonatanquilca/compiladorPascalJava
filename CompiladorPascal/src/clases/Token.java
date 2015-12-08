/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.regex.Pattern;

/**
 *
 * @author Administrador
 */
public class Token {

    String sentencia = "";

    public Token(String ba) {
        sentencia = ba;
    }

    public String[][] getToken() {
        String[] tokens = separateTocken();
        String[][] resp = new String[tokens.length][2];
        for (int i = 0; i < tokens.length; i++) {
            resp[i][0] = getTipoToken(tokens[i]);
            resp[i][1] = tokens[i];

        }

        return resp;
    }

    public String[][] getTokenList() {
        String[] tokens = separateTocken();
        String[][] resp = new String[tokens.length][2];
        for (int i = 0; i < tokens.length; i++) {
            resp[i][0] = getTipoToken(sentencia);
            resp[i][1] = tokens[i];

        }

        return resp;
    }

    public String[] separateTocken() {
        CaracteresBase leng = new CaracteresBase();
        String aux = "";
        boolean foco = true;
//        sentencia = sentencia.replace("\n", "~");
        sentencia = sentencia.replace("\n", " ");
        for (int i = 0; i < sentencia.length(); i++) {
            String caracterActual = sentencia.charAt(i) + "";
            String tipoAct = leng.getTipo(caracterActual);
            String tipoAnt = (i == 0) ? "" : leng.getTipo(sentencia.charAt(i - 1) + "");
//            String tipoPost = (i == 0) ? "" : leng.getTipo(sentencia.charAt(i + 1) + "");

            if (i == 0) {
                aux += caracterActual;
            } else if (tipoAct.equals(leng.ESPACIO)) {//identifica caracteres de un mismo tipos
//                System.out.println(sentencia.charAt(i - 1));
            } else if (tipoAct.equals(leng.SEPARADOR)) {//identifica caracteres de un mismo tipos
                aux += "§" + caracterActual;
            } else if (tipoAct.equals(tipoAnt)) {//identifica caracteres de un mismo tipos
                aux += caracterActual;
            } else if (tipoAct.equals(leng.ASIGNACION) && tipoAnt.equals(leng.ASIGNACION)) {//paranumeros decimales
                aux += caracterActual;
            } else if (tipoAct.equals(leng.NUMERO) && tipoAnt.equals(leng.ALFABETO) || tipoAct.equals(leng.ALFABETO) && tipoAnt.equals(leng.NUMERO)) {//paranumeros identificadores
                aux += caracterActual;
            } else if (tipoAct.equals(leng.NUMERO) && tipoAnt.equals(leng.FIN_PROGRAMA) || (tipoAct.equals(leng.FIN_PROGRAMA) && tipoAnt.equals(leng.NUMERO))) {//paranumeros decimales
                aux += caracterActual;

            } else if (tipoAct.equals(leng.TEXTO)) {//paranumeros decimales
                aux += "§" + caracterActual;
                int j = i + 1;
                boolean x = true;
                while (x) {
                    String tmpx = sentencia.charAt(j) + "";
//                    System.out.println(tmpx.equals("}")+" "+tmpx);
                    if (tmpx.equals("'")) {

                        aux += tmpx;
                        x = false;
                        break;
                    } else {
                        aux += tmpx;
//break;
                    }
                    j++;
                }
                i = j;
            } else if (tipoAct.equals(leng.COMENTARIO)) {//paranumeros decimales
                aux += "§" + caracterActual;
                int j = i + 1;
                boolean x = true;
                while (x) {
                    String tmpx = sentencia.charAt(j) + "";
//                    System.out.println(tmpx.equals("}")+" "+tmpx);
                    if (tmpx.equals("}")) {

                        aux += tmpx;
                        x = false;
                        break;
                    } else {
                        aux += tmpx;
//break;
                    }
                    j++;
                }
                i = j;

            } else {
                aux = aux + "§" + caracterActual;

            }

        }

        return aux.split("§");
    }
    //Quita codigo inutil

    public String quitarbasura(String texto) {
//        texto = texto.replace("\n", "\\");
        texto = texto.replace("     ", " ");
        texto = texto.replace("    ", " ");
        texto = texto.replace("   ", " ");
        texto = texto.replace("  ", " ");
        texto = texto.replace(" ", " ");
//        texto = texto.replace("\\ ", "\\");

        return texto;
    }

    private String getTipoToken(String token) {
        CaracteresBase cb = new CaracteresBase();
        if (cb.esPalabraReservada(token)) {
            return "RESERVADO";
        } else if (cb.esTipoDato(token)) {
            return "TIPO_DATO";
        } else if (cb.esLecturaEscritura(token)) {
            //write y read
            return "LECTURA_ESCRITURA";
        } else if (cb.esFinPrograma(token)) {
            //write y read
            return "END";
        } else if (cb.esOperadorArt(token)) {
            return "OPERADOR_ARITMETICO";
        } else if (Pattern.matches("[0-9]*( ||)...( ||)[0-9]*", token)) {
            return "SUBSECUENCIA";
        } else if (cb.esOperadorBoleano(token)) {
            return "OPERADOR_BOLEANO";
        } else if (cb.esAsignacion(token)) {
            //: asigancion de tipo dato
            //:= asigancion de valor a variable
            //= asigancion de valor a constante o 
            return "ASIGNACION";
        } else if (cb.esAgrupador(token)) {
            return "AGRUPADOR";
        } else if (token.contains("'")) {
            return "TEXTO_STRING";
        } else if (token.contains("{")) {
            return "COMENTARIO";
        } else if (cb.esInstruccionFinal(token)) {
            return "INSTRUCCION_FINAL";
        } else if (cb.esSeparador(token)) {
            return "SEPARADOR";
        } else if (Pattern.matches("[0-9]*", token)) {
            return "NUMERO";
        } else if (Pattern.matches("[a-z]([a-z]+||[A-Z]+||[0-9]+)*", token)) {
            return "ID";

        } else {
            return "No identificado";
        }
    }

}
