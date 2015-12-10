/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorpascal;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;


/**
 *
 * @author Administrador
 */
public class TokenLex {

    public static final int INVALID = 0;
    public static final int RESERVED = 1;
    public static final int ID = 2;
    public static final int STRING = 3;
    public static final int NUMBERS = 4;
    public static final int INT = 4;
    public static final int REAL = 5;
    public static final int SCIENTIFIC = 6;
    public static final int MATH = 7;
    public static final int SUM = 0;
    public static final int SUB = 1;
    public static final int MUL = 2;
    public static final int DIV = 3;
    public static final int ATTRIB = 8;
    public static final int DECLARATION = 9;
    public static final int RELATIONAL = 10;
    public static final int EQ = 0;
    public static final int NE = 1;
    public static final int LE = 2;
    public static final int LT = 3;
    public static final int GE = 4;
    public static final int GT = 5;
    public static final int PARENTHESES = 11;
    public static final int SQUARE_BRACKETS = 12;
    public static final int CURLY_BRACKETS = 13;
    public static final int DOT = 14;
    public static final int SEMICOLON = 15;
    public static final int COMMA = 16;
    public static final int POINTER = 17;
    public static final int COMMENT = 18;

    public static Hashtable<String, Integer> reserved;

    public static ArrayList<String>[] tables = new ArrayList[20];

    public static String[] typenames = {"Invalid", "Reserved", "Identifier", "String", "Integer", "Real", "SciNotation", "Arithmetic", "Attribution", "Declaration", "Relational", "Parentheses", "SquareBrackets", "CurlyBrackets", "Dot", "SemiColon", "Comma", "Pointer", "Comment"};

    public static String[] arithmetic = {"sum", "sub", "mul", "div"};
    //ORIGINAL LINE: unsigned int lines = 1;
    public static int lines = 1;

//    public static void init() {
//
//        Hashtable<String, Integer> it;
//
//        reserved.put("absolute", 0);
//        reserved.put("and", 1);
//        reserved.put("array", 2);
//        reserved.put("asm", 3);
//        reserved.put("begin", 4);
//        reserved.put("case", 5);
//        reserved.put("const", 6);
//        reserved.put("constructor", 7);
//        reserved.put("destructor", 8);
//        reserved.put("div", 9);
//        reserved.put("do", 10);
//        reserved.put("downto", 11);
//        reserved.put("else", 12);
//        reserved.put("end", 13);
//        reserved.put("file", 14);
//        reserved.put("for", 15);
//        reserved.put("function", 16);
//        reserved.put("goto", 17);
//        reserved.put("if", 18);
//        reserved.put("implementation", 19);
//        reserved.put("in", 20);
//        reserved.put("inherited", 21);
//        reserved.put("inline", 22);
//        reserved.put("interface", 23);
//        reserved.put("label", 24);
//        reserved.put("mod", 25);
//        reserved.put("nil", 26);
//        reserved.put("not", 27);
//        reserved.put("object", 28);
//        reserved.put("of", 29);
//        reserved.put("on", 30);
//        reserved.put("operator", 31);
//        reserved.put("or", 32);
//        reserved.put("packed", 33);
//        reserved.put("procedure", 34);
//        reserved.put("program", 35);
//        reserved.put("record", 36);
//        reserved.put("reintroduce", 37);
//        reserved.put("repeat", 38);
//        reserved.put("self", 39);
//        reserved.put("set", 40);
//        reserved.put("shl", 41);
//        reserved.put("shr", 42);
//        reserved.put("string", 43);
//        reserved.put("then", 44);
//        reserved.put("to", 45);
//        reserved.put("type", 46);
//        reserved.put("unit", 47);
//        reserved.put("until", 48);
//        reserved.put("uses", 49);
//        reserved.put("var", 50);
//        reserved.put("while", 51);
//        reserved.put("with", 52);
//        reserved.put("xor", 53);
//
//        //INIT MATH TABLE
//        tables[MATH].add("sum");
//        tables[MATH].add("sub");
//        tables[MATH].add("mul");
//        tables[MATH].add("div");
//
//        //INIT RELATIONAL TABLE
//        tables[RELATIONAL].add("=");
//        tables[RELATIONAL].add("<>");
//        tables[RELATIONAL].add("<=");
//        tables[RELATIONAL].add("<");
//        tables[RELATIONAL].add(">=");
//        tables[RELATIONAL].add(">");
//
//        //INIT ATTRIB
//        tables[ATTRIB].add(":=");
//
//        //INIT DECLARATION
//        tables[DECLARATION].add(":");
//
//        //INIT PARENTHESES
//        tables[PARENTHESES].add("(");
//        tables[PARENTHESES].add(")");
//
//        //INIT SQUARE_BRACKETS
//        tables[SQUARE_BRACKETS].add("[");
//        tables[SQUARE_BRACKETS].add("]");
//
//        //INIT CURLY_BRACKETS
//        tables[CURLY_BRACKETS].add("{");
//        tables[CURLY_BRACKETS].add("}");
//
//        //INIT POINTER
//        tables[POINTER].add("^");
//
//        //INIT DOT
//        tables[DOT].add(".");
//
//        //INIT SEMICOLON
//        tables[SEMICOLON].add(";");
//
//        //INIT COMMA
//        tables[COMMA].add(",");
//
//        //INIT COMMENT
//        tables[COMMENT].add("COMMENT");
//
//        //INIT INVALID
//        //tables[INVALID].push_back("Invalid Id");
//        //INIT RESERVED TABLE
//        for (it = reserved.iterator(); it.hasNext();) {
//            tables[RESERVED].add(it.next().getKey());
//        }
//
//    }

//    public static void compile(String source) {
//        File fpin;
//        Pair<Integer, Integer> token = new Pair();
//        //C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//        //ORIGINAL LINE: unsigned int oldline = lines;
//        int oldline = lines;
//
//        fpin = fopen(source, "r");
//        if (fpin) {
//            System.out.print("Linha 1\n");
//            while (!feof(fpin)) {
//                token = get_token(fpin);
//
//                if (token.first != -1) {
//
//                    if (oldline != lines) {
//                        System.out.print("\n");
//                        oldline = lines;
//                        System.out.printf("Linha: %d\n", lines);
//                    }
//
//                    System.out.printf("  (%s , %s)\n", typenames[token.first], tables[token.first].get(token.second));
//                }
//            }
//
//        } else {
//            fprintf(stderr, "cannot open %s! - exiting\n", source);
//        }
//
//    }

    public static Pair<Integer, Integer> get_token(File in) {
        boolean done = false;
        int type = -1;
        int position = -1;
        //C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
        //ORIGINAL LINE: unsigned char state = 0;
        byte state = 0;
        //C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
        //ORIGINAL LINE: unsigned char last,sym;
        byte last;
        byte sym;
        String straux;
//        Iterator<String, Integer> it;
                Hashtable<String, Integer> it;

        Pair<Integer, Integer> token = new Pair();

        while (!done) {
            switch (state) {
                case 0:
                    sym = getc(in);
                    straux += sym;
                    if (Character.isDigit(sym)) {
                        state = 1;
                    } else if (Character.isLetter(sym)) {
                        state = 10;
                    } else if (sym == '\'') {
                        state = 11;
                    } else if (sym == '+' || sym == '-' || sym == '/' || sym == '*') {
                        state = 12;
                    } else if (sym == ':') {
                        state = 13;
                    } else if (sym == '>' || sym == '<') {
                        state = 14;
                    } else if (sym == '=') {
                        state = 15;
                    } else if (sym == '(' || sym == ')') {
                        state = 16;
                    } else if (sym == '[' || sym == ']') {
                        state = 17;
                    } else if (sym == '{') {
                        //else if (sym == '{' || sym == '}')
                        state = 18;
                    } else if (sym == ';') {
                        state = 19;
                    } else if (sym == '^') {
                        state = 20;
                    } else if (sym == '.') {
                        state = 21;
                    } else if (sym == ',') {
                        state = 22;
                    } else {
                        straux = straux.substring(0, straux.length() - 1);
                        if (sym == '\n') {
                            lines++;
                        }

                        if (feof(in)) {
                            done = true;
                        } else {
                            if (sym != ' ' && sym != '\r' && sym != '\t' && sym != '\n') {
                                straux += sym;
                                type = INVALID;
                                tables[type].add(straux);
                                position = tables[type].size() - 1;
                                done = true;
                            }
                        }
                    }
                    break;

                case 1:
                    sym = getc(in);
                    straux += sym;
                    if (Character.isDigit(sym)) {
                        state = 1;
                    } else if (sym == '.') {
                        state = 2;
                    } else if (sym == 'e' || sym == 'E') {
                        state = 4;
                    } else {
                        state = 7;
                    }
                    break;

                case 2:
                    sym = Character.toLowerCase(getc(in));
                    straux += sym;
                    if (Character.isDigit(sym)) {
                        state = 3;
                    } else {
                        type = INVALID;
                        tables[type].add(straux);
                        position = tables[type].size() - 1;
                        done = true;

                    }

                    break;

                case 3:
                    sym = getc(in);
                    straux += sym;
                    if (Character.isDigit(sym)) {
                        state = 3;
                    } else if (sym == 'e' || sym == 'E') {
                        state = 4;
                    } else {
                        state = 8;
                    }
                    break;

                case 4:
                    sym = getc(in);
                    straux += sym;
                    if (Character.isDigit(sym)) {
                        state = 6;
                    } else if (sym == '+' || sym == '-') {
                        state = 5;
                    } else {
                        straux = straux.substring(0, straux.length() - 1);
                        fseek(in, -1, SEEK_CUR);
                        type = INVALID;
                        tables[type].add(straux);
                        position = tables[type].size() - 1;
                        done = true;

                    }
                    break;

                case 5:
                    sym = getc(in);
                    straux += sym;
                    if (Character.isDigit(sym)) {
                        state = 6;
                    } else {
                        type = INVALID;
                        tables[type].add(straux);
                        position = tables[type].size() - 1;
                        done = true;

                    }

                    break;

                case 6:
                    sym = getc(in);
                    straux += sym;
                    if (!Character.isDigit(sym)) {
                        state = 9;
                    }
                    break;

                case 7: // RECON INT
                    fseek(in, -1, SEEK_CUR);
                    straux = straux.substring(0, straux.length() - 1);
                    type = INT;
                    tables[type].add(straux);
                    position = tables[type].size() - 1;
                    done = true;
                    break;

                case 8: // RECON REAL
                    fseek(in, -1, SEEK_CUR);
                    straux = straux.substring(0, straux.length() - 1);
                    type = REAL;
                    tables[type].add(straux);
                    position = tables[type].size() - 1;
                    done = true;
                    break;

                case 9: // RECON SCIENTIFIC
                    fseek(in, -1, SEEK_CUR);
                    straux = straux.substring(0, straux.length() - 1);
                    type = SCIENTIFIC;
                    tables[type].add(straux);
                    position = tables[type].size() - 1;
                    done = true;
                    break;

                case 10:
                    sym = getc(in);
                    straux += sym;
                    if (!Character.isLetterOrDigit(sym)) {
                        fseek(in, -1, SEEK_CUR);
                        straux = straux.substring(0, straux.length() - 1);
                        String strauxup = straux;
                        transform(strauxup.iterator(), strauxup.end(), strauxup.iterator(), tolower);
//C++ TO JAVA CONVERTER WARNING: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created if it does not yet exist:
//ORIGINAL LINE: it = reserved.find(strauxup);
                        it.copyFrom(reserved.find(strauxup)); // RESERVED
//C++ TO JAVA CONVERTER TODO TASK: Iterators are only converted within the context of 'while' and 'for' loops:
                        if (it != reserved.end()) {
                            type = RESERVED;
//C++ TO JAVA CONVERTER TODO TASK: Iterators are only converted within the context of 'while' and 'for' loops:
                            position = it.second;
                        } else // ID
                        {
                            type = ID;
                            tables[type].add(straux);
                            position = tables[type].size() - 1;
                        }
                        done = true;
                    }

                    break;

                case 11:
                    sym = getc(in);
                    straux += sym;
                    if (sym == '\'') // RECON STRING
                    {
                        type = STRING;
                        tables[type].add(straux);
                        position = tables[type].size() - 1;
                        done = true;
                    }
                    break;

                case 12: // RECON OPERATORS MATH
                    type = MATH;
                    if (sym == '+') {
                        position = SUM;
                    } else if (sym == '-') {
                        position = SUB;
                    } else if (sym == '*') {
                        position = MUL;
                    } else {
                        position = DIV;
                    }
                    done = true;
                    break;

                case 13:
                    sym = getc(in);
                    if (sym == '=') // RECON ATTRIB
                    {
                        type = ATTRIB;
                        position = 0;
                    } else {
                        fseek(in, -1, SEEK_CUR);
                        type = DECLARATION;
                        position = 0;
                    }
                    done = true;
                    break;

                case 14:
                    last = sym; // RECON OPERATORS REL
                    sym = getc(in);
                    type = RELATIONAL;
                    if (last == '<') {
                        if (sym == '=') {
                            position = LE;
                        } else if (sym == '>') {
                            position = NE;
                        } else {
                            position = LT;
                            fseek(in, -1, SEEK_CUR);
                        }
                    }
                    if (last == '>') {
                        if (sym == '=') {
                            position = GE;
                        } else {
                            position = GT;
                            fseek(in, -1, SEEK_CUR);
                        }
                    }

                    done = true;
                    break;

                case 15: // RECON OPERATOR REL '='
                    type = RELATIONAL;
                    position = EQ;
                    done = true;
                    break;

                case 16: // RECON PARENTHESES
                    if (sym == '(') {
                        position = 0;
                    } else {
                        position = 1;
                    }

                    type = PARENTHESES;
                    done = true;
                    break;

                case 17: // RECON SQUARE_BRACKETS
                    if (sym == '[') {
                        position = 0;
                    } else {
                        position = 1;
                    }

                    type = SQUARE_BRACKETS;
                    done = true;
                    break;

                case 18:
                    sym = getc(in);
                    if (sym == '}') {
                        type = COMMENT;
                        position = 0;
                        done = true;
                    }
                    break;

                /*case 18: // RECON CURLY_BRACKETS
                 if (sym == '{')
                 position = 0;
                 else
                 position = 1;
                 type = CURLY_BRACKETS;
                 done = true;
                 break;*/
                case 19: // SEMICOLON
                    type = SEMICOLON;
                    position = 0;
                    done = true;
                    break;

                case 20: // POINTER
                    type = POINTER;
                    position = 0;
                    done = true;
                    break;

                case 21: // DOT
                    type = DOT;
                    position = 0;
                    done = true;
                    break;

                case 22: // COMMA
                    type = COMMA;
                    position = 0;
                    done = true;
                    break;
            }

        }

        return new tangible.Pair<Integer, Integer>(type, position);
    }

}
