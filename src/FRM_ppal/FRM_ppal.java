/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRM_ppal;
import FRM_ppal.FRM_hipotenusa;
import FRM_ppal.FRM_resispara;
import FRM_ppal.FRM_resis_serie;
import javax.swing.JOptionPane;


/**
 *
 * @author 3
 */
public class FRM_ppal extends javax.swing.JFrame {

    /**
     * Creates new form FRM_ppal
     */
    public FRM_ppal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btn_resistenpara = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btn_info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("prototipos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pitures/back004.png"))); // NOI18N
        getContentPane().add(contenedor);
        contenedor.setBounds(0, 0, 1400, 788);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 30, 630, 350);

        jMenu1.setText("Archivo");

        btn_salir.setText("salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jMenu1.add(btn_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modulos");

        btn_resistenpara.setText("Resistencias en paralelo");
        btn_resistenpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resistenparaActionPerformed(evt);
            }
        });
        jMenu2.add(btn_resistenpara);

        jMenuItem3.setText("Resistencias en serie");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("hipotenusa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca de ");

        btn_info.setText("Informacion");
        btn_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_infoActionPerformed(evt);
            }
        });
        jMenu3.add(btn_info);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        /////salgo del sistema
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        /////instaciacion del formulario
        FRM_hipotenusa hipo = new FRM_hipotenusa();
        /////añado el formulario al contenedor 
        this.contenedor.add(hipo);
        //////////////muestro el formulario
        hipo.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btn_resistenparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resistenparaActionPerformed
        // TODO add your handling code here:
        
        
        ///////instacia del formulario
        FRM_resispara resp= new FRM_resispara();
        //////añado el formulario
        this.contenedor.add(resp);
        /////////muestro el formulario
        resp.setVisible(true);
        
    }//GEN-LAST:event_btn_resistenparaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        ///////instacia del formulario
        FRM_resis_serie resp= new FRM_resis_serie();
        //////añado el formulario
        this.contenedor.add(resp);
        /////////muestro el formulario
        resp.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_infoActionPerformed
       
        ////informacion
        JOptionPane.showMessageDialog(null,"Gracias por utilizar software colombiano de "
                + "calidad, realizado por MATEO ORTIZ BEDOYA");
    }//GEN-LAST:event_btn_infoActionPerformed

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
            java.util.logging.Logger.getLogger(FRM_ppal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ppal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ppal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ppal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ppal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_info;
    private javax.swing.JMenuItem btn_resistenpara;
    private javax.swing.JMenuItem btn_salir;
    private javax.swing.JLabel contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
