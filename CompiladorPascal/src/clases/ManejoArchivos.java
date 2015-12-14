/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import vistas.Editor;

/**
 *
 * @author Rubén
 */
public class ManejoArchivos {

    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
//    FileWriter w;
//    BufferedWriter bw;
//    PrintWriter wr;

    public ManejoArchivos() {

    }

    //Crear
    
    
   

    
        

    //Abrir 
    public String AbrirTexto(File archivo) {
        String contenido = "";

        try {
            entrada = new FileInputStream(archivo);

            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                contenido += caracter;

            }

        } catch (Exception e) {
        }

        return contenido;
    }

    //Guardar
    public String GuardarTexto(File archivo, String contenido) {
        String respuesta = null;

        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);

            respuesta = "Archivo Guardado";

        } catch (Exception e) {
        }

        return respuesta;
    }

}
