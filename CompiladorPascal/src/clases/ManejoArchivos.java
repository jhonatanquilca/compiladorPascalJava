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

    public ManejoArchivos() {

    }

    //Crear 
    public String CrearTexto(File archivo) {
        String contenido = null;

        try {
            archivo = new File("C:\\Users\\Rubén\\Documents\\NetBeansProjects\\nuevito.txt");
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
                                  
        } catch (IOException e) {
            System.err.println("No se ha podido crear el archivo");
        }

        return contenido;

    }

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
