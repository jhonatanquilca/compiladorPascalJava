/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.*;

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
//    public void CrearTexto(String nombre) {
//       
//        try {
//
//            archivo = new File(nombre);
//            w = new FileWriter(archivo);
//
//            bw = new BufferedWriter(w);
//            wr = new PrintWriter(bw);
//
//            wr.write("Linea 1");
//            wr.append("\nSegunda linea de codigo");
//            wr.append("\nLinea final");
//
//            wr.close();
//            bw.close();
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Ha sucedido un error" + e);
//
//        }
//
//      
//
//    }

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
