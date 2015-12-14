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
                //                new TokenLex("program ex2343dimarray;\n"
                //                        + "var \n"
                //                        + "   a: array [0..3, 0..3] of integer;\n"
                //                        + "   i,j : integer;  \n"
                //                        + "\n"
                //                        + "begin  \n"
                //                        + "   for i:=0 to 3 do\n"
                //                        + "      for j:=0 to 3 do\n"
                //                        + "         a[i,j]:= i * j;  \n"
                //                        + "   \n"
                //                        + "   for i:=0 to 3 do\n"
                //                        + "   begin  \n"
                //                        + "      for j:=0 to 3 do  \n"
                //                        + "         write(a[i,j]:2,' ');  \n"
                //                        + "      writeln;  \n"
                //                        + "   end;  \n"
                //                        + "end.");
                //                new TokenLex("program ifChecking;\n"
                //                        + "\n"
                //                        + "var\n"
                //                        + "{ local variable declaration }\n"
                //                        + "   a:integer;\n"
                //                        + "\n"
                //                        + "begin\n"
                //                        + "   a:= 10;\n"
                //                        + "   { check the boolean condition using if statement }\n"
                //                        + "   \n"
                //                        + "   if( a < 20 ) then\n"
                //                        + "      { if condition is true then print the following } \n"
                //                        + "      writeln('a is less than 20 ' );\n"
                //                        + "   writeln('value of a is : ', a);\n"
                //                        + "end.");
                //                new TokenLex("program forLoop;\n"
                //                        + "var\n"
                //                        + "   a: integer;\n"
                //                        + "\n"
                //                        + "begin\n"
                //                        + "   for a := 10  to 20 do\n"
                //                        + "   \n"
                //                        + "   begin\n"
                //                        + "      writeln('value of a: ', a);\n"
                //                        + "   end;\n"
                //                        + "end.");
                //                                new TokenLex("program Greetings;\n"
                //                                        + "const\n"
                //                                        + "message = ' Welcome to the world of Pascal ';\n"
                //                                        + "\n"
                //                                        + "type\n"
                //                                        + "name = string;\n"
                //                                        + "var\n"
                //                                        + "firstname, surname: name;\n"
                //                                        + "\n"
                //                                        + "begin\n"
                //                                        + "   writeln('Please enter your first name: ');\n"
                //                                        + "   readln(firstname);\n"
                //                                        + "   \n"
                //                                        + "   writeln('Please enter your surname: ');\n"
                //                                        + "   readln(surname);\n"
                //                                        + "   \n"
                //                                        + "   writeln;\n"
                //                                        + "   writeln(message, ' ', firstname, ' ', surname);\n"
                //                                        + "end."
                //                                        + " \n"
                //                                        + " ");
                //                new TokenLex("program const_circle (input,output);\n"
                //                        + "const\n"
                //                        + "PI = 3.141592654;\n"
                //                        + "\n"
                //                        + "var\n"
                //                        + "r, d, c : real;   {variable declaration: radius, dia, circumference}\n"
                //                        + "\n"
                //                        + "begin\n"
                //                        + "   writeln('Enter the radius of the circle');\n"
                //                        + "   readln(r);\n"
                //                        + "   \n"
                //                        + "   d := 2 * r;\n"
                //                        + "   c :=  PI * d;\n"
                //                        + "   writeln('The circumference of the circle is ',c:7:2);\n"
                //                        + "end.");
                new TokenLex(" program \n"
                        + "        uses  begin  end  and \n"
                        + "        array  case  cons  const  \n"
                        + "        do  downto  else  file \n"
                        + "        function  goto  label  in \n"
                        + "        nil  not  of \n"
                        + "        or  paked  procedure  program \n"
                        + "        record  repeat  set  then \n"
                        + "        to  type  until  var \n"
                        + "        output \n"
                        + "        input \n"
                        + "        for \n"
                        + "        if \n"
                        + "        while  with \n"
                        + "        integer \n"
                        + "        real \n"
                        + "        character \n"
                        + "        bolean \n"
                        + "        enumerated \n"
                        + "        subrange \n"
                        + "        fail \n"
                        + "        byte \n"
                        + "        shorint \n"
                        + "        word \n"
                        + "        longint \n"
                        + "        cardinal \n"
                        + "        int64 \n"
                        + "        single \n"
                        + "        real \n"
                        + "        double \n"
                        + "        extended \n"
                        + "        char \n"
                        + "        string \n"
                        + "        shortstring \n"
                        + "        ansistring \n"
                        + "        pchar \n"
                        + "        bytebool \n"
                        + "        wordbool \n"
                        + "        longboll \n"
                        + "        writeln  readln  readkey  write \n"
                        //                        -----------------------
                        + "        . \n"
                        + "        + - * div mod / \n"
                        + "        <  >  ==  !=  >=  <= \n"
                        + "        asignacion \n"
                        + "        (  )  [  ] \n"
                        + "        texto_string \n"
                        + "        comentario \n"
                        + "        ; \n"
                        + "        ,\n"
                        + "        numero \n"
                        + "        id");
//        System.out.println(Token.listaToken[82]);
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
