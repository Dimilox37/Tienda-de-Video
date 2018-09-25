/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acuario;

/**
 *
 * @author Camilo D'isidoro
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        Esp = new javax.swing.JMenuItem();
        Tan = new javax.swing.JMenuItem();
        Pez = new javax.swing.JMenuItem();
        Evt = new javax.swing.JMenuItem();
        consulta = new javax.swing.JMenu();
        reportes = new javax.swing.JMenu();
        salir = new javax.swing.JMenu();
        salida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AcquaLand");
        setResizable(false);

        archivo.setText("Archivo");

        Esp.setText("Especie");
        Esp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspActionPerformed(evt);
            }
        });
        archivo.add(Esp);

        Tan.setText("Tanque");
        archivo.add(Tan);

        Pez.setText("Pez");
        archivo.add(Pez);

        Evt.setText("Evento");
        archivo.add(Evt);

        jMenuBar1.add(archivo);

        consulta.setText("Consulta");
        jMenuBar1.add(consulta);

        reportes.setText("Reportes");
        jMenuBar1.add(reportes);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        salida.setText("Salida");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        salir.add(salida);

        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
    }//GEN-LAST:event_salirActionPerformed

    private void EspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspActionPerformed
        dispose();
        new Especie().setVisible(true);
    }//GEN-LAST:event_EspActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salidaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Esp;
    private javax.swing.JMenuItem Evt;
    private javax.swing.JMenuItem Pez;
    private javax.swing.JMenuItem Tan;
    private javax.swing.JMenu archivo;
    private javax.swing.JMenu consulta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu reportes;
    private javax.swing.JMenuItem salida;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
