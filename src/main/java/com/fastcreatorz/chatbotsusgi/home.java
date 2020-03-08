/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastcreatorz.chatbotsusgi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import javax.swing.text.DefaultCaret;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author sajjan
 */
public class home extends javax.swing.JFrame {
    
    String baseDir = System.getProperty("user.dir");
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        
        ImageIcon susLogo = new ImageIcon(new ImageIcon(baseDir + "/img/logo.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
        label_logo.setIcon(susLogo);
        
        ImageIcon btnIcon = new ImageIcon(new ImageIcon(baseDir + "/img/sendIcon.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnSend.setIcon(btnIcon);
        btnSend.setOpaque(false);
        btnSend.setContentAreaFilled(false);
        btnSend.setBorderPainted(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        fieldOutput = new javax.swing.JTextArea();
        fieldMsg = new javax.swing.JTextField();
        labelMessage = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        label_heading = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Bot By SUSGI");
        setPreferredSize(new java.awt.Dimension(450, 400));

        fieldOutput.setEditable(false);
        fieldOutput.setColumns(20);
        fieldOutput.setLineWrap(true);
        fieldOutput.setRows(5);
        fieldOutput.setToolTipText("");
        jScrollPane1.setViewportView(fieldOutput);

        fieldMsg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fieldMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMsgActionPerformed(evt);
            }
        });
        fieldMsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldMsgKeyPressed(evt);
            }
        });

        labelMessage.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        labelMessage.setText("Message: ");

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setBorder(null);
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        label_heading.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        label_heading.setForeground(new java.awt.Color(255, 51, 51));
        label_heading.setText("Chat Bot By SUSGI");

        label_logo.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSend)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(label_logo)
                .addGap(18, 18, 18)
                .addComponent(label_heading)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_logo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSend)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMessage)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        getBotRes();
    }//GEN-LAST:event_btnSendActionPerformed

    private void fieldMsgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldMsgKeyPressed
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            getBotRes();
        }
    }//GEN-LAST:event_fieldMsgKeyPressed

    private void fieldMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMsgActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new home().setVisible(true);
        });
    }
    
    public void getBotRes(){
        String userMsg = fieldMsg.getText();
        if (!userMsg.equals(" ") && !userMsg.equals("")){
            try {
                String response = callChatBot(userMsg);
    //            System.out.println(response);
                JSONArray jsonResponse = new JSONArray(response);
                String botMsg = jsonResponse.getJSONObject(0).getString("text");

                fieldOutput.append("You: "+ userMsg +"\n");
                fieldOutput.append("Bot: "+ botMsg +"\n");
                DefaultCaret caret = (DefaultCaret) fieldOutput.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                fieldMsg.setText("");
            }
        }

    }
    
    public static String callChatBot(String msg) throws Exception {
        URL url = new URL("http://localhost:5005/webhooks/rest/webhook");
        JSONObject jsonParams = new JSONObject();
        jsonParams.put("sender", "You");
        jsonParams.put("message", msg);

        byte[] postDataBytes = jsonParams.toString().getBytes("UTF-8");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (int c; (c = in.read()) >= 0;)
            sb.append((char)c);
        String response = sb.toString();
        
        return response;
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JTextField fieldMsg;
    private javax.swing.JTextArea fieldOutput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JLabel label_heading;
    private javax.swing.JLabel label_logo;
    // End of variables declaration//GEN-END:variables
}
