/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class Token {

    private String lexema;
    private String nombre;
    private int id;

    public static String[] listaToken = new String[]{
        "program",
        "uses", "begin", "end", "and",
        "array", "case", "cons", "const", "div",
        "do", "downto", "else", "file",
        "function", "goto", "label", "in",
        "mod", "nil", "not", "of",
        "or", "paked", "procedure", "program",
        "record", "repeat", "set", "then",
        "to", "type", "until", "var",
        "output",
        "input",
        "for",
        "if",
        "while", "with",
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
        "string",
        "shortstring",
        "ansistring",
        "pchar",
        "bytebool",
        "wordbool",
        "longboll",
        "writeln", "readln", "readkey", "write",
        "punto",
        "suma", "resta", "multiplicacino", "division", "modulo",
        "subsecuencia",
        "menor", "mayor", "igual", "diferente", "mayor_igual", "menor_igual",
        "asignacion",
        "parentesis_a", "parentesis_c", "corchetes_a", "corchetes_c",
        "texto_string",
        "comentario",
        "fin_linea",
        "separador",
        "numero",
        "id"
    };

    public Token(String l, String n) {
        this.nombre = n;
        this.lexema = l;
        if (this.esEsToken(l)) {
            this.id = geValtId(n);

        } else if (this.esEsToken(n)) {
            this.id = geValtId(n);
        } else {
            id = -1;
        }

    }

    public String getLexema() {
        return this.lexema;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean esEsToken(String c) {
        Set<String> VALUES = new HashSet<String>(Arrays.asList(listaToken));
        return VALUES.contains(c);
    }

    public int getId() {
        return this.id;
    }

    public int geValtId(String c) {
        int val = 0;
        for (int i = 0; i < listaToken.length; i++) {
            String listaToken1 = listaToken[i];
            if (listaToken1.equals(c)) {
                val = i;
//                if(c.equals("fin_linea")){
//                    System.out.println("pc");
//                }
                break;
            }

        }
        return val;
    }
}
