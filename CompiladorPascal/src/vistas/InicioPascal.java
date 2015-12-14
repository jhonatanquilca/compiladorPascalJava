/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rubén
 */
public class InicioPascal extends javax.swing.JFrame {

    /**
     * Creates new form InicioPascal
     */
    public InicioPascal() {
        initComponents();

        InicioPascal.this.getRootPane().setOpaque(false);//Para no ver nada
        InicioPascal.this.getContentPane().setBackground(new Color(0, 0, 0, 0));//Para ver el color de cuatro tonos  
        InicioPascal.this.setBackground(new Color(0, 0, 0, 0));// hace que se haga transparente
        this.setResizable(false);
        this.setLocationRelativeTo(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        progreso = new javax.swing.JProgressBar();
        texto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Pascal es un lenguaje de programación desarrollado por el profesor suizo Niklaus Wirth entre los años 1968 y 1969.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 700, 60));
        getContentPane().add(progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 840, -1));

        texto.setFont(new java.awt.Font("Futura BdCn BT", 1, 10)); // NOI18N
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 840, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

        if (realizado == false) {
            realizado = true;
            progreso.setMaximum(49);
            progreso.setMaximum(0);
            progreso.setStringPainted(true);
            ejecutar.start();

        }

    }//GEN-LAST:event_formWindowActivated

    private int aux = 0;
    hilo ejecutar = new hilo();
    private boolean realizado = false;

    private class hilo extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                    aux++;
                    progreso.setValue(aux);
                    repaint();
                    switch (aux) {
                        case 0:
                            texto.setText("Cargando compilador");
                            break;

                        case 20:
                            texto.setText("Leyendo preferencias");
                            break;

                        case 50:
                            texto.setText("Carga finalizada");

                            Editor objeto = new Editor();
                            objeto.setVisible(true);
                            objeto.setLocationRelativeTo(InicioPascal.this);
                            InicioPascal.this.dispose();

                            break;

                    }
                    Thread.sleep(100);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(InicioPascal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(InicioPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPascal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
