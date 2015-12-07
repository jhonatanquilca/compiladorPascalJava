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

    String[] alfabeto = new String[]{
        "a", "b", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
        "A", "B", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "_"};
    String[] numero = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] operadorArt = new String[]{"+", "-", "*", "div", "mod", "/"};
    String[] operadorBoleano = new String[]{"=", "!", "<", ">", "==", "!=", ">=", "<="};
    String[] separador = new String[]{","};
    String[] espacio = new String[]{" "};
    String[] instruccionFinal = new String[]{";"};
    String[] agrupador = new String[]{"(", ")", "[", "]", "'"};
    String[] texto = new String[]{"'"};
    String[] comentario = new String[]{"{"};
    String[] finPrograma = new String[]{"."};
    String[] asignacion = new String[]{":", "=", ":="};

    public String ALFABETO = "ALFABETO";
    public String NUMERO = "NUMERO";
    public String OPERADOR_ART = "OPERADOR_ART";
    public String OPERADORES_BOLEANOS = "OPERADOR_BOLEANO";
    public String SEPARADOR = "SEPARADOR";
    public String ESPACIO = "ESPACIO";
    public String INSTRUCCION_FINAL = "INSTRUCCION_FINAL";
    public String AGRUPADOR = "AGRUPADOR";
    public String LECTUR_ESCRITURA = "LECTUR_ESCRITURA";
    public String PALABRA_RESERVADA = "PALABRA_RESERVADA";
    public String TIPO_DATO = "TIPO_DATO";
    public String FIN_PROGRAMA = "FIN_PROGRAMA";
    public String ASIGNACION = "ASIGNACION";
    public String COMENTARIO = "COMENTARIO";
    public String TEXTO = "TEXTO";

    //reservados del compilador
    String[] lecturaEscritura = new String[]{"writeln", "readln","readkey","write"};

    String[] palabraReservada = new String[]{"program",
        "uses", "begin", "end", "and",
        "array", "case", "cons", "div",
        "do", "downto", "else", "file",
        "function", "goto", "label", "in",
        "mod", "nil", "not", "of",
        "or", "paked", "procedure", "program",
        "record", "repeat", "set", "then",
        "to", "type", "until", "var",
        "for",
        "while", "with",};
    String[] tipoDato = new String[]{
        "integer",
        "real",
        "character",
        "bolean",
        "enumerated",
        "subrange",
        "array",
        "record",
        "fail",
        "set",
        "byte",
        "shorint",
        "word",
        "longint",
        "longint",
        "cardinal",
        "int64",
        "single",
        "real",
        "double",
        "extended",
        "char",
        "shortstring",
        "ansistring",
        "pchar",
        "bytebool",
        "wordbool",
        "longboll"
    };

    public boolean compare(String c1, String c2) {
        return c1.equals(c2);
    }

    public boolean esFinPrograma(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(finPrograma));
        return VALUES.contains(c);
    }

    public boolean esTexto(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(texto));
        return VALUES.contains(c);
    }

    public boolean esLecturaEscritura(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(lecturaEscritura));
        return VALUES.contains(c);
    }

    public boolean esAsignacion(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(asignacion));
        return VALUES.contains(c);
    }

    public boolean esPalabraReservada(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(palabraReservada));
        return VALUES.contains(c);
    }

    public boolean esTipoDato(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(tipoDato));
        return VALUES.contains(c);
    }

    public boolean esAlfabeto(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(alfabeto));
        return VALUES.contains(c);
    }

    public boolean esNumero(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(numero));
        return VALUES.contains(c);
    }

    public boolean esComentario(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(comentario));
        return VALUES.contains(c);
    }

    public boolean esOperadorArt(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(operadorArt));
        return VALUES.contains(c);
    }

    public boolean esOperadorBoleano(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(operadorBoleano));
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

    public boolean esInstruccionFinal(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(instruccionFinal));
        return VALUES.contains(c);
    }

    public boolean esAgrupador(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(agrupador));
        return VALUES.contains(c);
    }

    public String getTipo(String c) {
        if (esAlfabeto(c)) {
            return ALFABETO;
        } else if (esTipoDato(c)) {
            return TIPO_DATO;
        } else if (esTexto(c)) {
            return TEXTO;
        } else if (esComentario(c)) {
            return COMENTARIO;
        } else if (esAsignacion(c)) {
            return ASIGNACION;
        } else if (esFinPrograma(c)) {
            return FIN_PROGRAMA;
        } else if (esLecturaEscritura(c)) {
            return LECTUR_ESCRITURA;
        } else if (esPalabraReservada(c)) {
            return PALABRA_RESERVADA;
        } else if (esNumero(c)) {
            return NUMERO;
        } else if (esOperadorArt(c)) {
            return OPERADOR_ART;
        } else if (esOperadorBoleano(c)) {
            return OPERADORES_BOLEANOS;
        } else if (esSeparador(c)) {
            return SEPARADOR;
        } else if (esEspacio(c)) {
            return ESPACIO;
        } else if (esInstruccionFinal(c)) {
            return INSTRUCCION_FINAL;
        } else if (esAgrupador(c)) {
            return AGRUPADOR;
        } else {
            return "NO_ES_PARTE_DEL_LENGUAJE";
        }
    }

    public boolean esLenguaje(String c) {
        if (esPalabraReservada(c)) {
            return true;
        } else if (esAlfabeto(c)) {
            return true;
        } else if (esTexto(c)) {
            return true;
        } else if (esComentario(c)) {
            return true;
        } else if (esFinPrograma(c)) {
            return true;
        } else if (esTipoDato(c)) {
            return true;
        } else if (esAsignacion(c)) {
            return true;
        } else if (esNumero(c)) {
            return true;
        } else if (esLecturaEscritura(c)) {
            return true;
        } else if (esInstruccionFinal(c)) {
            return true;
        } else if (esOperadorArt(c)) {
            return true;
        } else if (esOperadorBoleano(c)) {
            return true;
        } else if (esSeparador(c)) {
            return true;
        } else if (esEspacio(c)) {
            return true;
        } else if (esFinPrograma(c)) {
            return true;
        } else if (esAgrupador(c)) {
            return true;
        } else {
            return false;
        }
    }

}
