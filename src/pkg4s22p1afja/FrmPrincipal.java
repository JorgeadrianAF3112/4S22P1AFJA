/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4s22p1afja;

/**
 *
 * @author Adrian
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSaludo = new javax.swing.JLabel();
        btnSaluda = new javax.swing.JButton();
        txtNumero1 = new javax.swing.JTextField();
        txtNumero2 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Estamos empezando a programar en NetBenas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 62, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ingresa tu nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 132, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 132, 369, -1));

        lblSaludo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lblSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 580, 31));

        btnSaluda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSaluda.setText("Saludo");
        btnSaluda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaludaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaluda, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 274, -1, -1));

        txtNumero1.setToolTipText("Ingresa un numero");
        getContentPane().add(txtNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 354, 103, 30));

        txtNumero2.setToolTipText("Ingresa un segundo numero");
        getContentPane().add(txtNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 437, 103, 30));

        btnSuma.setText("Sumar");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 391, 101, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Resultado de la operación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 397, -1, -1));

        txtResultado.setEditable(false);
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 140, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaludaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaludaActionPerformed
        lblSaludo.setText("Bienvenido" + " " + txtNombre.getText().toString() + " " + "estamos empezando a programar");
    }//GEN-LAST:event_btnSaludaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        int num1;
        int num2;
        num1 = Integer.parseInt(txtNumero1.getText().toString());
        num2 = Integer.parseInt( txtNumero2.getText().toString());
        txtResultado.setText(String.valueOf(num1+num2));
    }//GEN-LAST:event_btnSumaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaluda;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
