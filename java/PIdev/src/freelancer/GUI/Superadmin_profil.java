/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freelancer.GUI;

/**
 *
 * @author ASUS
 */
public class Superadmin_profil extends javax.swing.JFrame {
String pseudo;
    /**
     * Creates new form Superadmin_profil
     */
    public Superadmin_profil(String pseudo) {
        initComponents();
           this.pseudo=pseudo;
        tf_pseudo.setText(pseudo);
        setTitle("Menu SuperAdmin");
    setSize(800,600);
    setResizable(false);this.setLocationRelativeTo(null);
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
        tf_pseudo = new javax.swing.JTextField();
        bt_logout = new javax.swing.JButton();
        bt_Ajoutadmin = new javax.swing.JButton();
        bt_gereradministrateur = new javax.swing.JButton();
        bt_modifier = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Interface Superadmin ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 90, 107, 14);

        tf_pseudo.setEditable(false);
        tf_pseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pseudoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_pseudo);
        tf_pseudo.setBounds(90, 110, 123, 20);

        bt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(bt_logout);
        bt_logout.setBounds(603, 0, 190, 50);

        bt_Ajoutadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AjoutadminActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Ajoutadmin);
        bt_Ajoutadmin.setBounds(20, 330, 240, 51);

        bt_gereradministrateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gereradministrateurActionPerformed(evt);
            }
        });
        getContentPane().add(bt_gereradministrateur);
        bt_gereradministrateur.setBounds(270, 330, 240, 60);

        bt_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modifierActionPerformed(evt);
            }
        });
        getContentPane().add(bt_modifier);
        bt_modifier.setBounds(530, 330, 240, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freelancer/Images/super_adminProfil.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_pseudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pseudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pseudoActionPerformed

    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed
        Jhome a = new Jhome();
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_bt_logoutActionPerformed

    private void bt_AjoutadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AjoutadminActionPerformed
       Superadmin_ajoutadministrateur superadmin = new Superadmin_ajoutadministrateur(pseudo);
        setVisible(false);
        superadmin.setVisible(true);
    }//GEN-LAST:event_bt_AjoutadminActionPerformed

    private void bt_gereradministrateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gereradministrateurActionPerformed
    Superadmin_gereradministrateur superadmin = new Superadmin_gereradministrateur(pseudo);
        setVisible(false);
        superadmin.setVisible(true);
    }//GEN-LAST:event_bt_gereradministrateurActionPerformed

    private void bt_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modifierActionPerformed
        Superadmin_gererauhtentification supadmin= new Superadmin_gererauhtentification(pseudo);
        setVisible(false);
        supadmin.setVisible(true);
    }//GEN-LAST:event_bt_modifierActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     bt_logout.setBorderPainted(false); 
bt_logout.setContentAreaFilled(false); 
bt_logout.setFocusPainted(false); 
bt_logout.setOpaque(false);

bt_Ajoutadmin.setBorderPainted(false); 
bt_Ajoutadmin.setContentAreaFilled(false); 
bt_Ajoutadmin.setFocusPainted(false); 
bt_Ajoutadmin.setOpaque(false);

bt_gereradministrateur.setBorderPainted(false); 
bt_gereradministrateur.setContentAreaFilled(false); 
bt_gereradministrateur.setFocusPainted(false); 
bt_gereradministrateur.setOpaque(false);

bt_modifier.setBorderPainted(false); 
bt_modifier.setContentAreaFilled(false); 
bt_modifier.setFocusPainted(false); 
bt_modifier.setOpaque(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Superadmin_profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Superadmin_profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Superadmin_profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Superadmin_profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Ajoutadmin;
    private javax.swing.JButton bt_gereradministrateur;
    private javax.swing.JButton bt_logout;
    private javax.swing.JButton bt_modifier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf_pseudo;
    // End of variables declaration//GEN-END:variables
}