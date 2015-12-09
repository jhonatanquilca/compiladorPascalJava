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
public class TokenLex {

    String sentencia = "";

    public TokenLex(String ba) {
        sentencia = ba;
    }

    public Token[] getToken() {
        String[] tokens = separateTocken();
        Token[] resp = new Token[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            Token t = new Token(tokens[i], getTipoToken(tokens[i]));
            resp[i] = t;
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
//            "program",
//        "uses", "begin", "end", "and",
//        "array", "case", "cons", "div",
//        "do", "downto", "else", "file",
//        "function", "goto", "label", "in",
//        "mod", "nil", "not", "of",
//        "or", "paked", "procedure", "program",
//        "record", "repeat", "set", "then",
//        "to", "type", "until", "var",
//        "for",
//        "while", "with"
            return token;
        } else if (cb.esTipoDato(token)) {
            return token;
//            return "TIPO_DATO";
        } else if (cb.esLecturaEscritura(token)) {
            //write y read
            return token;
//            return "LECTURA_ESCRITURA";
        } else if (cb.esFinPrograma(token)) {
            //write y read
            return "punto";
        } else if (cb.esOperadorArt(token)) {
//            "+", "-", "*", "div", "mod", "/"
            String resp = "";
            if (token.equals("+")) {
                resp = "suma";
            } else if (token.equals("-")) {
                resp = "resta";
            } else if (token.equals("*")) {
                resp = "multiplicacino";
            } else if (token.equals("div") || token.equals("/")) {
                resp = "division";
            } else if (token.equals("mod")) {
                resp = "modulo";
            }
//            return "OPERADOR_ARITMETICO";
            return resp;
        } else if (Pattern.matches("[0-9]*( ||)...( ||)[0-9]*", token)) {
            return "subsecuencia";
        } else if (cb.esOperadorBoleano(token)) {
            String resp = "";
//            "<", ">", "==", "!=", ">=", "<="
//            "menor", "mayor", "igual", "diferente", "mayor_igual", "menor_igual"
            if (token.equals("<")) {
                resp = "menor";
            } else if (token.equals(">")) {
                resp = "mayor";
            } else if (token.equals("==")) {
                resp = "igual";
            } else if (token.equals("!=")) {
                resp = "diferente";
            } else if (token.equals(">=")) {
                resp = "mayor_igual";
            } else if (token.equals("<=")) {
                resp = "menor_igual";
            }
            return resp;
//            return "OPERADOR_BOLEANO";
        } else if (cb.esAsignacion(token)) {
            //: asigancion de tipo dato
            //:= asigancion de valor a variable
            //= asigancion de valor a constante o 
            return "asignacion";
        } else if (cb.esAgrupador(token)) {
//            "(", ")", "[", "]",
//            "parentesis_a", "parentesis_c", "corchetes_a", "corchetes_c",
            String resp = "";
            if (token.equals("(")) {
                resp = "parentesis_a";
            } else if (token.equals(")")) {
                resp = "parentesis_c";
            } else if (token.equals("[")) {
                resp = "corchetes_a";
            } else if (token.equals("]")) {
                resp = "corchetes_c";
            }
            return resp;
//            return "AGRUPADOR";
        } else if (token.contains("'")) {
            return "texto_string";
        } else if (token.contains("{")) {
            return "comentario";
        } else if (cb.esInstruccionFinal(token)) {
            return "fin_linea";
        } else if (cb.esSeparador(token)) {
            return "separador";
        } else if (Pattern.matches("[0-9]*||([0-9]+.[0-9]+)", token)) {
            return "numero";
        } else if (Pattern.matches("[a-z]([a-z]+||[A-Z]+||[0-9]+)*", token)) {
            return "id";
        } else {
            return "No identificado";
        }
    }

}
