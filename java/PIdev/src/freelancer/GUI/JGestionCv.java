/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freelancer.GUI;

/**
 *
 * @author hp
 */
public class JGestionCv extends javax.swing.JFrame {
String pseudo;
    /**
     * Creates new form freelancer_cv_acceuil
     */
    public JGestionCv() {
        initComponents();
    }
    public JGestionCv(String pseudo) {
        initComponents();
        this.pseudo=pseudo;
        tf_pseudo.setText(pseudo);
        setTitle("Menu CV");
setSize(800,600);
setResizable(false);
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

        bt_ajoutercv = new javax.swing.JButton();
        bt_moncv = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_pseudo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        bt_ajoutercv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ajoutercvActionPerformed(evt);
            }
        });
        getContentPane().add(bt_ajoutercv);
        bt_ajoutercv.setBounds(20, 330, 210, 50);

        bt_moncv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_moncvMousePressed(evt);
            }
        });
        bt_moncv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_moncvActionPerformed(evt);
            }
        });
        getContentPane().add(bt_moncv);
        bt_moncv.setBounds(530, 330, 210, 50);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 320, 220, 50);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(660, 0, 120, 50);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(600, 0, 50, 50);

        jLabel1.setText("Interface freelancer");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 100, 100, 20);
        getContentPane().add(tf_pseudo);
        tf_pseudo.setBounds(140, 100, 80, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freelancer/Images/Freelancer_GestionCVt.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ajoutercvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ajoutercvActionPerformed

        // TODO add your handling code here:
             freelancer_ajoutercv cv = new freelancer_ajoutercv(pseudo);
        
        setVisible(false);//Masquer la JFrame actuelle
        cv.setVisible(true);//Afficher la JFrame Résultat r1
    }//GEN-LAST:event_bt_ajoutercvActionPerformed

    private void bt_moncvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_moncvActionPerformed
        // TODO add your handling code here:
    // freelancer_moncv cv_fl = new freelancer_moncv();
      freelancer_cv_modifier cv = new  freelancer_cv_modifier(pseudo);
        System.out.println(pseudo);
      tf_pseudo.setText(tf_pseudo.getText());
     //  tf_pseudo.setText(this.tf_pseudo.getText());
        setVisible(false);//Masquer la JFrame actuelle
        cv.setVisible(true);//Afficher la JFrame Résultat r1
        
    }//GEN-LAST:event_bt_moncvActionPerformed

    private void bt_moncvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_moncvMousePressed
        // TODO add your handling code here:
//         freelancer_moncv cv_fl = new freelancer_moncv();
        
       //cv_fl.jL_pseudo.setText(jL_pseudo.getText());
      // cv_fl.jL_pseudo.setText(this.jL_pseudo.getText());
    }//GEN-LAST:event_bt_moncvMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
  bt_ajoutercv.setBorderPainted(false); 
bt_ajoutercv.setContentAreaFilled(false); 
bt_ajoutercv.setFocusPainted(false); 
bt_ajoutercv.setOpaque(false);
       
bt_moncv.setBorderPainted(false); 
bt_moncv.setContentAreaFilled(false); 
bt_moncv.setFocusPainted(false); 
bt_moncv.setOpaque(false);

jButton1.setBorderPainted(false); 
jButton1.setContentAreaFilled(false); 
jButton1.setFocusPainted(false); 
jButton1.setOpaque(false);

jButton2.setBorderPainted(false); 
jButton2.setContentAreaFilled(false); 
jButton2.setFocusPainted(false); 
jButton2.setOpaque(false);

jButton3.setBorderPainted(false); 
jButton3.setContentAreaFilled(false); 
jButton3.setFocusPainted(false); 
jButton3.setOpaque(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        freelancer_mon_cv j = new freelancer_mon_cv(pseudo);
        setVisible(false);
        j.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Jhome j = new Jhome();
        setVisible(false);
        j.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         JFreelancerProfile j = new JFreelancerProfile(pseudo);
        setVisible(false);
        j.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JGestionCv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JGestionCv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JGestionCv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JGestionCv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_ajoutercv;
    private javax.swing.JButton bt_moncv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf_pseudo;
    // End of variables declaration//GEN-END:variables
}
