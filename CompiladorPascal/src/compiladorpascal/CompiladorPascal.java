/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorpascal;

import clases.Token;
import clases.TokenLex;
import java.util.Hashtable;

/**
 *
 * @author Administrador
 */
public class CompiladorPascal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        https://github.com/silasgtcs/Compilador/blob/master/lexico.cpp

        TokenLex tk
                = //                new TokenLex("program HelloWorld;\n"
                //                        + "uses crt;\n"
                //                        + "var\n"
                //                        + "a:string;\n"
                //                        + "{ Here the main program block starts }\n"
                //                        + "begin\n"
                //                        + "a:='Hola';\n"                        
                //                        + "{aqui}a:='mande ud.';\n"                        
                //                        + "   writeln('Hello World'); \n"
                //                        + "   readkey;\n"
                //                        + "end. ");
                new TokenLex("program ex2343dimarray;\n"
                        + "var \n"
                        + "   a: array [0..3, 0..3] of integer;\n"
                        + "   i,j : integer;  \n"
                        + "\n"
                        + "begin  \n"
                        + "   for i:=0 to 3 do\n"
                        + "      for j:=0 to 3 do\n"
                        + "         a[i,j]:= i * j;  \n"
                        + "   \n"
                        + "   for i:=0 to 3 do\n"
                        + "   begin  \n"
                        + "      for j:=0 to 3 do  \n"
                        + "         write(a[i,j]:2,' ');  \n"
                        + "      writeln;  \n"
                        + "   end;  \n"
                        + "end.");
//                new TokenLex(";");
        Token[] tokens = tk.getToken();
        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[i].getNombre());
            System.out.print("--");
            System.out.print(tokens[i].getLexema());
            System.out.print("--");
            System.out.print(tokens[i].geValtId(tokens[i].getNombre()));
            System.out.println("");

        }

    }

}
