package vista;
import clases.Comandos;
import clases.Token;
import clases.TokenLex;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
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

        Comandos cmd = new Comandos();
        System.out.println(cmd.getDirectorioActual());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Pascal IDE 1.0");
        setMinimumSize(new java.awt.Dimension(991, 774));
        setName("IDE"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    }

     
            
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}}
