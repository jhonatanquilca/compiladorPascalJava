/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Administrador
 */
public class Token {

    //nombres de tipos de datos
    String nombreTipo[] = new String[]{"Invalid", "Reserved", "Identifier", "String", "Integer", "Real", "SciNotation", "Arithmetic",
        "Attribution", "Declaration", "Relational", "Parentheses", "SquareBrackets",
        "CurlyBrackets", "Dot", "SemiColon", "Comma", "Pointer", "Comment"};

    String operaciones[] = new String[]{"sum", "sub", "mul", "div"};
//    Array de palabras Reservadas
    String palabrasResrvadas[] = new String[]{"absolute", "and", "array", "asm", "begin", "case", "const",
        "constructor", "destructor", "div", "do", "downto", "else", "end", "file", "for", "function", "goto", "if",
        "implementation", "in", "inherited", "inline", "interface", "label", "mod", "nil", "not", "object", "of", "on",
        "operator", "or", "packed", "procedure", "program", "record", "reintroduce", "repeat", "self",
        "set", "shl", "shr", "string", "then", "to", "type", "unit", "until", "uses", "var", "while", "with", "xor"};

}
