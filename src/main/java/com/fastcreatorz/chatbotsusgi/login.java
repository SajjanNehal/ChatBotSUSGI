/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastcreatorz.chatbotsusgi;

import java.awt.Image;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  
import javax.swing.JOptionPane;

/**
 *
 * @author sajjan
 */
public class login extends javax.swing.JFrame {
    
    String baseDir = System.getProperty("user.dir");

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
        /* Set Logo on top */
        ImageIcon susLogo = new ImageIcon(new ImageIcon(baseDir + "/img/logo.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
        labelLogo.setIcon(susLogo);
        
        /* Set Icon on Username */
        ImageIcon usernameIcon = new ImageIcon(new ImageIcon(baseDir + "/img/username.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        labelUserName.setIcon(usernameIcon);
        
        /* Set Icon on Username */
        ImageIcon passwordIcon = new ImageIcon(new ImageIcon(baseDir + "/img/password.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        labelPassword.setIcon(passwordIcon);
        
        /* Set Icon on Username */
        ImageIcon loginIcon = new ImageIcon(new ImageIcon(baseDir + "/img/login.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        btnLogin.setIcon(loginIcon);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        fieldUserName = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Chat Bot By SUSGI");

        labelLogo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(220, 33, 76));
        labelLogo.setText("Login - Chat Bot By SUSGI");

        labelUserName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(220, 33, 76));
        labelUserName.setText(" ");

        fieldUserName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fieldUserName.setToolTipText("Enter Your Username.");

        labelPassword.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(220, 33, 76));
        labelPassword.setText(" ");

        fieldPassword.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fieldPassword.setToolTipText("Enter Your Password.");

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(220, 33, 76));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(fieldUserName))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(labelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnLogin)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelLogo)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUserName))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String userName = fieldUserName.getText();
        String password = fieldPassword.getText();
        String encPassword = passwdEnc(password);
        
        System.out.println("Username: " + userName);
        System.out.println("Password: " + encPassword);
        
        if (!userName.equals(" ") && !encPassword.equals("")){
            matchCerds(userName, encPassword);
        }else{
            JOptionPane.showMessageDialog(null, "Something wrong! Please try again");
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    public String passwdEnc(String password){
        /* Password Encryption  Method*/
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();
        } 
        catch (NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    public Connection dbConnection(){
        /* Create Connection with SQLLite Database */
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + baseDir + "/db/db_login.db");
            System.out.println("Connection to SQLite has been established.");
            return conn;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public void matchCerds(String userName, String encPassword){
        /* Execute Query in Database */
        try {
            Connection conn = dbConnection();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM users WHERE username ='"+ userName + "' AND password='"+ encPassword+"'");
            if(res.next()) {
                fieldUserName.setText("");
                fieldPassword.setText("");
                
                System.out.println("Login: "+ res.getString("name"));
//                JOptionPane.showMessageDialog(null, "Login done");
                home HomePage = new home();
                HomePage.setVisible(true);
                this.setVisible(false);
            }else{
                System.out.println("Something wrong! Please try again");
                JOptionPane.showMessageDialog(null, "Something wrong! Please try again");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserName;
    // End of variables declaration//GEN-END:variables
}
