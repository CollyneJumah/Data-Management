/*
 * Copyright (c) 2017, info@mimidots.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package catholic_action;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class MainUI extends javax.swing.JFrame {

    /** Creates new form MainUI */
    public MainUI() {
        initComponents();
        /*set the initial view as send sms panel*/
        Component add = this.rootPanel.add(new SendSMS());
        
        
        eventHandler();
    }

    private void eventHandler(){
//         cboFaculty.addActionListener (new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent ae) {
        jBtnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                changeView(new SendSMS());
            } 
        });
        
        jBtnMessages.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                changeView(new SMSLogs());
            }
        });
            
    }
    
    private void changeView(JPanel p){
        this.rootPanel.removeAll();
        this.rootPanel.add(p);
        this.rootPanel.revalidate();
        this.rootPanel.repaint();
    }
         
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnHome = new javax.swing.JButton();
        jBtnMembers = new javax.swing.JButton();
        jBtnMessages = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rootPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jBtnHome.setBackground(new java.awt.Color(255, 255, 255));
        jBtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/Home_38px_2.png"))); // NOI18N
        jBtnHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));
        jBtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBtnMembers.setBackground(new java.awt.Color(255, 255, 255));
        jBtnMembers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/Add User Group Man Man_38px_1.png"))); // NOI18N
        jBtnMembers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));
        jBtnMembers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBtnMessages.setBackground(new java.awt.Color(255, 255, 255));
        jBtnMessages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/SMS_38px_1.png"))); // NOI18N
        jBtnMessages.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));
        jBtnMessages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMessagesActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/Settings_38px_1.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/About_38px.png"))); // NOI18N
        jButton1.setText("Back to main Menu");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 153), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMessages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jBtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jBtnMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jBtnMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        rootPanel.setBackground(new java.awt.Color(255, 255, 255));
        rootPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        rootPanel.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(838, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMessagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnMessagesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainMenu mm= new MainMenu();
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnHome;
    private javax.swing.JButton jBtnMembers;
    private javax.swing.JButton jBtnMessages;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel rootPanel;
    // End of variables declaration//GEN-END:variables

}
