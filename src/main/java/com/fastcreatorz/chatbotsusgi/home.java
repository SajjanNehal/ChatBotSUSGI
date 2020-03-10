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
import java.text.SimpleDateFormat;

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
        
        /* Set Logo on top */
        ImageIcon susLogo = new ImageIcon(new ImageIcon(baseDir + "/img/logo.png").getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
        labelLogo.setIcon(susLogo);
        
        /* Set Icon on Submit button */
        ImageIcon btnIcon = new ImageIcon(new ImageIcon(baseDir + "/img/sendIcon.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        btnSend.setIcon(btnIcon);
        btnSend.setOpaque(false);
        btnSend.setContentAreaFilled(false);
        btnSend.setBorderPainted(false);
        
        /* Send first greeting message to user */
        fieldOutput.setText("Bot: Hi, My name is SUSGI \n\n");
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldOutput = new javax.swing.JTextArea();
        labelMessage = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        fieldMsg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home - Chat Bot By SUSGI");
        setFocusable(false);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(450, 400));
        setResizable(false);

        labelLogo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(220, 33, 76));
        labelLogo.setText("Chat Bot By SUSGI");

        fieldOutput.setEditable(false);
        fieldOutput.setColumns(20);
        fieldOutput.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fieldOutput.setLineWrap(true);
        fieldOutput.setRows(5);
        fieldOutput.setFocusable(false);
        jScrollPane1.setViewportView(fieldOutput);

        labelMessage.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelMessage.setForeground(new java.awt.Color(220, 33, 76));
        labelMessage.setText("Message: ");

        btnSend.setBackground(new java.awt.Color(255, 255, 255));
        btnSend.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSend.setText(" ");
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        fieldMsg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fieldMsg.setToolTipText("Type your message..");
        fieldMsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldMsgKeyPressed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(labelLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMessage)
                    .addComponent(btnSend))
                .addContainerGap(70, Short.MAX_VALUE))
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
    
    public void getBotRes(){
        /* Get User message */
        String userMsg = fieldMsg.getText();
        if (!userMsg.equals(" ") && !userMsg.equals("")){
            try {
                /* Call ChatBot method and pass User Message as a parameter  */
                String response = callChatBot(userMsg);
                
                /* Get only Text Message from Bot JSON Respsone */
                JSONArray jsonResponse = new JSONArray(response);
                String botMsg = jsonResponse.getJSONObject(0).getString("text");
                
                /* Create TimeStamp */
                String timeStamp = new SimpleDateFormat("hh:mm:ss").format(System.currentTimeMillis());
                
                /* Send Response to user */
                fieldOutput.append("\t Time: " + timeStamp + "\n");
                fieldOutput.append("You: " + userMsg + "\n");
                fieldOutput.append("Bot: " + botMsg + "\n\n");
                
                /* Auto scroll bar goto bottom */
                DefaultCaret caret = (DefaultCaret) fieldOutput.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                
                /* System logs */
                System.out.println("Rasa Res: " + response);
                System.out.println("You: " + userMsg);
                System.out.println("Bot: " + botMsg);
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally{
                /* Clear Field Message after submit message */
                fieldMsg.setText("");
            }
        }

    }
    
    public static String callChatBot(String msg) throws Exception {
        URL url = new URL("http://localhost:5005/webhooks/rest/webhook");
        
        /* Set requred params for API call */
        JSONObject jsonParams = new JSONObject();
        jsonParams.put("sender", "You");
        jsonParams.put("message", msg);
        
        /* Params convert into Bytes */
        byte[] postDataBytes = jsonParams.toString().getBytes("UTF-8");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        
        /* Set Header for API call */
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);
        
        /* Call API with data */
        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (int c; (c = in.read()) >= 0;)
            sb.append((char)c);
        String response = sb.toString();
        
        /* Return JSON Array */
        return response;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JTextField fieldMsg;
    private javax.swing.JTextArea fieldOutput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMessage;
    // End of variables declaration//GEN-END:variables
}
