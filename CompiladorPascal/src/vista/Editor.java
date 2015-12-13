package vista;

import clases.ManejoArchivos;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Editor extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
//    byte[] bytes;
    ManejoArchivos manejo = new ManejoArchivos();

    public Editor() {
        initComponents();
        setLocationRelativeTo(null);

//        Imagen Jframe
//        setIconImage(new ImageIcon(getClass().getResource("/img/pascal.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        archivonuevo = new javax.swing.JButton();
        proyectonuevo = new javax.swing.JButton();
        abrirproyecto = new javax.swing.JButton();
        guardartodo = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        cortar = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        pegar = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        deshacer = new javax.swing.JButton();
        rehacer = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        compilar = new javax.swing.JButton();
        panelarbol = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        paneleditar = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        editar = new javax.swing.JEditorPane();
        panelsalidas = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablalexico = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        areasintactico = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(991, 774));

        jToolBar1.setRollover(true);

        archivonuevo.setText("archivonuevo");
        archivonuevo.setToolTipText("Archivo Nuevo");
        archivonuevo.setFocusable(false);
        archivonuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        archivonuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        archivonuevo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                archivonuevoComponentRemoved(evt);
            }
        });
        jToolBar1.add(archivonuevo);

        proyectonuevo.setText("proyectonuevo");
        proyectonuevo.setToolTipText("Proyecto Nuevo");
        proyectonuevo.setFocusable(false);
        proyectonuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proyectonuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(proyectonuevo);

        abrirproyecto.setText("abrirproyecto");
        abrirproyecto.setToolTipText("Abrir Proyecto");
        abrirproyecto.setFocusable(false);
        abrirproyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrirproyecto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        abrirproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirproyectoActionPerformed(evt);
            }
        });
        jToolBar1.add(abrirproyecto);

        guardartodo.setText("guardartodo");
        guardartodo.setToolTipText("Guardar Todo");
        guardartodo.setFocusable(false);
        guardartodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardartodo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        guardartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardartodoActionPerformed(evt);
            }
        });
        jToolBar1.add(guardartodo);

        jToolBar2.setRollover(true);

        cortar.setText("cortar");
        cortar.setToolTipText("Cortar");
        cortar.setFocusable(false);
        cortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(cortar);

        copiar.setText("copiar");
        copiar.setToolTipText("Copiar");
        copiar.setFocusable(false);
        copiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(copiar);

        pegar.setText("pegar");
        pegar.setToolTipText("Pegar");
        pegar.setFocusable(false);
        pegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(pegar);

        jToolBar3.setRollover(true);

        deshacer.setText("deshacer");
        deshacer.setToolTipText("Deshacer");
        deshacer.setFocusable(false);
        deshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(deshacer);

        rehacer.setText("rehacer");
        rehacer.setToolTipText("Rehacer");
        jToolBar3.add(rehacer);

        jToolBar4.setRollover(true);

        compilar.setText("compilar");
        compilar.setToolTipText("Compilar");
        compilar.setFocusable(false);
        compilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(compilar);

        jTree1.setModel(new FileSystemModel(new File("C:\\Users\\Rubén\\Documents\\NetBeansProjects")));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTree1);

        panelarbol.addTab("Proyectos", jScrollPane6);

        jScrollPane2.setViewportView(editar);

        paneleditar.addTab("Fuente", jScrollPane2);

        tablalexico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Token", "Lexema"
            }
        ));
        jScrollPane3.setViewportView(tablalexico);

        panelsalidas.addTab("Lexico", jScrollPane3);

        areasintactico.setColumns(20);
        areasintactico.setRows(5);
        jScrollPane4.setViewportView(areasintactico);

        panelsalidas.addTab("Sintactico", jScrollPane4);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        panelsalidas.addTab("Matriz de Transición ", jScrollPane5);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 603, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelarbol)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneleditar, javax.swing.GroupLayout.DEFAULT_SIZE, 1152, Short.MAX_VALUE)
                    .addComponent(panelsalidas))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelarbol)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneleditar, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelsalidas, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Pascal");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String Jtreevar;
    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        // TODO add your handling code here:
        Jtreevar = jTree1.getSelectionPath().toString().replaceAll("[\\[\\]]", "").replace(", ", "\\");


    }//GEN-LAST:event_jTree1MouseClicked

    private void abrirproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirproyectoActionPerformed
        // TODO add your handling code here:

        if (seleccionado.showDialog(this, "Abrir Archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();

            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")||archivo.getName().endsWith("java")) {
                    String contenido = manejo.AbrirTexto(archivo);
                    editar.setText(contenido);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor seleccione Un archivo");
            }
        }

//        try {
//
//            File seleccion = new File(Jtreevar);
//            if (seleccion.exists()) {
//
//                if (Desktop.isDesktopSupported()) {
//                    Desktop.getDesktop().open(seleccion);
//                } else {
//                    JOptionPane.showMessageDialog(this, "No soportado", "Error", JOptionPane.INFORMATION_MESSAGE);
//                }
//
//            } else {
//
//                JOptionPane.showMessageDialog(this, "Archivo No existe", "Error", JOptionPane.INFORMATION_MESSAGE);
//            }
//
//        } catch (Exception e) {
//        }

    }//GEN-LAST:event_abrirproyectoActionPerformed

    private void guardartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardartodoActionPerformed
        // TODO add your handling code here:
        if (seleccionado.showDialog(this, "Guardar Archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.getName().endsWith("txt")||archivo.getName().endsWith("java")) {                
                String contenido=editar.getText();                
                String respuesta = manejo.GuardarTexto(archivo, contenido);                
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }

            }else {
                 JOptionPane.showMessageDialog(null, "El texto se debe guardar en un formato de texto");
            
            }
            

        }
    }//GEN-LAST:event_guardartodoActionPerformed

    private void archivonuevoComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_archivonuevoComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_archivonuevoComponentRemoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirproyecto;
    private javax.swing.JButton archivonuevo;
    private javax.swing.JTextArea areasintactico;
    private javax.swing.JButton compilar;
    private javax.swing.JButton copiar;
    private javax.swing.JButton cortar;
    private javax.swing.JButton deshacer;
    private javax.swing.JEditorPane editar;
    private javax.swing.JButton guardartodo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JTree jTree1;
    private javax.swing.JTabbedPane panelarbol;
    private javax.swing.JTabbedPane paneleditar;
    private javax.swing.JTabbedPane panelsalidas;
    private javax.swing.JButton pegar;
    private javax.swing.JButton proyectonuevo;
    private javax.swing.JButton rehacer;
    private javax.swing.JTable tablalexico;
    // End of variables declaration//GEN-END:variables
}
