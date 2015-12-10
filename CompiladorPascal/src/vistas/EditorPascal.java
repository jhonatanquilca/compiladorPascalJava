package vistas;

import clases.Comandos;
import clases.TokenLex;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class EditorPascal extends javax.swing.JFrame {

    String time;
    String Jtreevar;

    /**
     * Creates new form EditorPascal
     */
    public EditorPascal() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/img/pascal.png")).getImage());
        } catch (Exception e) {
        }
        
        jsyntaxpane.DefaultSyntaxKit.initKit();
        editar.setContentType("text/java");
        Comandos cmd = new Comandos();
        System.out.println(cmd.getDirectorioActual());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevoArchivo = new javax.swing.JButton();
        btnNuevoProyecto = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        AbrirProyecto = new javax.swing.JButton();
        btnDeshacer = new javax.swing.JButton();
        btnRehacer = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        editar = new javax.swing.JEditorPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLexico = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtASintactico = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblMatrizT = new javax.swing.JTable();
        menBar = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        MenuEditar = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        MenuVer = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Pascal IDE 1.0");
        setMinimumSize(new java.awt.Dimension(991, 774));
        setName("IDE"); // NOI18N

        btnNuevoArchivo.setText("NUEVO ARCHIVO");
        btnNuevoArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoArchivo.setFocusCycleRoot(true);
        btnNuevoArchivo.setFocusTraversalPolicyProvider(true);
        btnNuevoArchivo.setFocusable(false);
        btnNuevoArchivo.setHideActionText(true);
        btnNuevoArchivo.setName(""); // NOI18N
        btnNuevoArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevoArchivoMouseReleased(evt);
            }
        });
        btnNuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoArchivoActionPerformed(evt);
            }
        });

        btnNuevoProyecto.setText("NUEVO PROYECTO");
        btnNuevoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProyectoActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");

        AbrirProyecto.setText("ABRIR PROYECTO");
        AbrirProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirProyectoActionPerformed(evt);
            }
        });

        btnDeshacer.setText("DESHACER");

        btnRehacer.setText("REHACER");

        btnPlay.setText("PLAY");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnNuevoArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevoProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AbrirProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeshacer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRehacer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNuevoArchivo)
            .addComponent(btnNuevoProyecto)
            .addComponent(btnGuardar)
            .addComponent(AbrirProyecto)
            .addComponent(btnDeshacer)
            .addComponent(btnRehacer, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnPlay, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jTabbedPane4.addTab("Proyectos", jScrollPane2);

        jScrollPane5.setViewportView(editar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tab1", jPanel2);

        tblLexico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblLexico);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Lexico", jPanel3);

        txtASintactico.setColumns(20);
        txtASintactico.setRows(5);
        jScrollPane3.setViewportView(txtASintactico);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Sintactico", jPanel4);

        tblMatrizT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane6.setViewportView(tblMatrizT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Matriz de Transición ", jPanel5);

        menBar.setFont(new java.awt.Font("Futura Bk BT", 0, 15)); // NOI18N

        MenuArchivo.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo Proyecto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Nuevo Archivo");
        MenuArchivo.add(jMenuItem2);
        MenuArchivo.add(jSeparator2);

        jMenuItem3.setText("Abrir Proyecto");
        MenuArchivo.add(jMenuItem3);

        jMenuItem4.setText("Abrir Archivo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItem4);
        MenuArchivo.add(jSeparator3);

        jMenuItem7.setText("Guardar");
        MenuArchivo.add(jMenuItem7);

        jMenuItem8.setText("Gurdar Como...");
        MenuArchivo.add(jMenuItem8);
        MenuArchivo.add(jSeparator4);

        jMenuItem9.setText("Salir");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        MenuArchivo.add(jMenuItem9);

        menBar.add(MenuArchivo);

        MenuEditar.setText("Editar");
        MenuEditar.add(jSeparator1);

        jMenuItem5.setText("Deshacer");
        MenuEditar.add(jMenuItem5);

        jMenuItem6.setText("Rehacer");
        MenuEditar.add(jMenuItem6);
        MenuEditar.add(jSeparator5);

        jMenuItem10.setText("Borrar");
        MenuEditar.add(jMenuItem10);

        menBar.add(MenuEditar);

        MenuVer.setText("Ver");
        menBar.add(MenuVer);

        setJMenuBar(menBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:  h
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnNuevoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProyectoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnNuevoProyectoActionPerformed

    private void btnNuevoArchivoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoArchivoMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_btnNuevoArchivoMouseReleased

    private void btnNuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoArchivoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnNuevoArchivoActionPerformed

    private void AbrirProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirProyectoActionPerformed
        // TODO add your handling code here:

        AbrirProyecto ap = new AbrirProyecto();
        ap.setVisible(true);
        try {

            File Selection = new File(Jtreevar);
            if (Selection.exists()) {
                if (Desktop.isDesktopSupported()) {

                    Desktop.getDesktop().open(Selection);

                } else {
                    JOptionPane.showMessageDialog(this, "Escritorio no soportado", "Error", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "El Archivo no existe", "Error", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_AbrirProyectoActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnPlayActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        Comandos cmd = new Comandos();
        DefaultMutableTreeNode carpetaRaiz = new DefaultMutableTreeNode(cmd.getDirectorioActual());
        JTree arbol = new JTree(carpetaRaiz);
        arbol.getSelectionModel().addTreeSelectionListener(this);


    }//GEN-LAST:event_jTree1MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(EditorPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorPascal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorPascal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirProyecto;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuEditar;
    private javax.swing.JMenu MenuVer;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevoArchivo;
    private javax.swing.JButton btnNuevoProyecto;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JEditorPane editar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuBar menBar;
    private javax.swing.JTable tblLexico;
    private javax.swing.JTable tblMatrizT;
    private javax.swing.JTextArea txtASintactico;
    // End of variables declaration//GEN-END:variables

}
