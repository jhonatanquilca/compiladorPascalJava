/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class CaracteresBase {

    String[] identificadores = new String[]{"a", "b", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "\"",
        "A", "B", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "_"};
    String[] numeros = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "."};
    String[] operadores = new String[]{"+", "-", "*", "/"};
    String[] comparadores = new String[]{"=", "!", "<", ">", "==", "!=", ">=", "<="};
    String[] separador = new String[]{","};
    String[] espacio = new String[]{" "};
    String[] senteciaFinal = new String[]{";"};
    String[] agrupadores = new String[]{"(", ")", "[", "]", "{", "}", "\""};

    String ALFA_NUERICO = "ALFA_NUERICO";
    String NUMERO = "NUMERO";
    String OPERADOR = "OPERADOR";
    String COMPARADOR = "COMPARADOR";
    String SEPARADOR = "SEPARADOR";
    String ESPACIO = "ESPACIO";
    String FINAL = "SFINAL";
    String AGRUPADOR = "AGRUPADOR";

    public boolean compare(String c1, String c2) {
        return c1.equals(c2);
    }

    public boolean esAlfaNumerico(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(identificadores));
        return VALUES.contains(c);
    }

    public boolean esNumero(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(numeros));
        return VALUES.contains(c);
    }

    public boolean esOperador(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(operadores));
        return VALUES.contains(c);
    }

    public boolean esComparador(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(comparadores));
        return VALUES.contains(c);
    }

    public boolean esSeparador(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(separador));
        return VALUES.contains(c);
    }

    public boolean esEspacio(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(espacio));
        return VALUES.contains(c);
    }

    public boolean esFinal(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(senteciaFinal));
        return VALUES.contains(c);
    }

    public boolean esAgrupador(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(agrupadores));
        return VALUES.contains(c);
    }

    public String getTipo(String c) {
        if (esAlfaNumerico(c)) {
            return ALFA_NUERICO;
        } else if (esNumero(c)) {
            return NUMERO;
        } else if (esOperador(c)) {
            return OPERADOR;
        } else if (esComparador(c)) {
            return COMPARADOR;
        } else if (esSeparador(c)) {
            return SEPARADOR;
        } else if (esEspacio(c)) {
            return ESPACIO;
        } else if (esFinal(c)) {
            return FINAL;
        } else if (esAgrupador(c)) {
            return AGRUPADOR;
        } else {
            return "NO_ES_PARTE_DEL_LENGUAJE";
        }
    }

    public boolean esLenguaje(String c) {
        if (esAlfaNumerico(c)) {
            return true;

        } else if (esNumero(c)) {
            return true;

        } else if (esOperador(c)) {
            return true;

        } else if (esComparador(c)) {
            return true;

        } else if (esSeparador(c)) {
            return true;

        } else if (esEspacio(c)) {
            return true;

        } else if (esFinal(c)) {
            return true;
        } else if (esAgrupador(c)) {
            return true;

        } else {
            return false;
        }
    }

}
