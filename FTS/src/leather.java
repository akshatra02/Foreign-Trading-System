
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adithya Malayalam
 */
public class leather extends javax.swing.JFrame {

    /**
     * Creates new form leather
     */
    public leather() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shoes_40.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 240, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bag_2_50.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/belt_1_60.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Louis Philippe Formal Shoes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 280, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Men Coffee Brown Solid Leather Derbys");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("MUTE BOSTON BAG");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Artist-Made collection by BTS V ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("50");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 80, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("LOUIS VUITTON BELT");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Vintage Monogram A Belt - Brown");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 300, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setText("178");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setText("122");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 100, 100));

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 102, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 150, -1));

        jButton3.setBackground(new java.awt.Color(204, 102, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton3.setText("ADD TO CART");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 140, 30));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 51, 0));
        jLabel15.setText("LEATHER");
        jLabel15.setToolTipText("");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 70, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HAT1_1_35.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 110, 60));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK1.jpg"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 60));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel17.setText("$");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 40, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel18.setText("$");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 20, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel19.setText("$");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 50, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1000, 610));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Connection con = null;
     Statement st = null;
        try{
                Class.forName("java.sql.DriverManager");
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/movies","root","root");
                st = con.createStatement();
                String i2 = jLabel4.getText();
                int pr2 = Integer.parseInt(jLabel12.getText());
                String abc = jTextField1.getText();
                String sql = "insert into products(cname, item , price) values ('"+abc+"' , '"+i2+"','"+pr2+"');";
                        int n1 = st.executeUpdate(sql);
                        if (n1>0){
                            System.out.print("record inserted successfuly");
                            JOptionPane.showMessageDialog(null,"PRODUCT ADDED");
                                    leather l = new leather();
                                    l.setVisible(true);
                                    this.setVisible(false); 
                        }
                        else{
                            System.out.print("error"); }
                        con.close();
                        st.close();
                }
                
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     home h = new home();
     h.setVisible(true);
     this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Connection con = null;
     Statement st = null;
        try{
                Class.forName("java.sql.DriverManager");
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/movies","root","root");
                st = con.createStatement();
                String abc = jTextField1.getText();
                String i1 = jLabel6.getText();
                int pr1 = Integer.parseInt(jLabel11.getText());
                String sql = "insert into products(cname, item , price) values ('"+abc+"','"+i1+"','"+pr1+"');";
                        int n1 = st.executeUpdate(sql);
                        if (n1>0){
                            System.out.print("record inserted successfuly");
                            JOptionPane.showMessageDialog(null,"PRODUCT ADDED");
                                    leather l = new leather();
                                    l.setVisible(true);
                                    this.setVisible(false); 
                        }
                        else{
                            System.out.print("error"); }
                        con.close();
                        st.close();
                }
                
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Connection con = null;
     Statement st = null;
        try{
                Class.forName("java.sql.DriverManager");
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/movies","root","root");
                st = con.createStatement();
                String i3 = jLabel9.getText();
                int pr3 = Integer.parseInt(jLabel8.getText());
                String abc = jTextField1.getText();
                String sql = "insert into products(cname, item , price) values ('"+abc+"','"+i3+"','"+pr3+"');";
                        int n1 = st.executeUpdate(sql);
                        if (n1>0){
                            System.out.print("record inserted successfuly");
                            JOptionPane.showMessageDialog(null,"PRODUCT ADDED");
                                    leather l = new leather();
                                    l.setVisible(true);
                                    this.setVisible(false); 
                        }
                        else{
                            System.out.print("error"); }
                        con.close();
                        st.close();
                }
                
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cart c = new cart();
        c.jTextField1.setText(jTextField1.getText());
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(leather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leather.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leather().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
