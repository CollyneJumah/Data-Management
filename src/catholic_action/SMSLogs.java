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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info@mimidots.com
 */
public class SMSLogs extends javax.swing.JPanel {

    private DefaultTableModel model;
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    private static Timer scheduler = new Timer();

    /**
     * Creates new form SMSLogs
     */
    public SMSLogs() {
        initComponents();
        eventHandler();
    }

    private void eventHandler() {
        jBtnInbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                populateOutboxTable();
                }
        }) ;
        jBtnOutbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 populateInboxTable();
            }
        });
    }

    private void populateOutboxTable() {
         model = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false; //To change body of generated methods, choose Tools | Templates.
                    }

                };
                String cols[] = {"Id", "Name", "Reg_Number.", "Year", "Phone", "Message", "status", "Time sent"};
                model.setColumnIdentifiers(cols);
                conn = new Connect().connect();
                String sqlQuery = "SELECT church_members_records.`Name`,church_members_records.Reg_Number,"
                        + "church_members_records.Year_Of_Study,church_members_records.Phone_Number,"
                        + "smslog.MessageText as message, smslog.StatusCode as status,"
                        + "smslog.SendTime as timesent FROM `church_members_records` "
                        + "inner join smslog on smslog.MessageTo=church_members_records.Phone_Number ORDER BY `smslog`.`SendTime` DESC";

//        scheduler.schedule(new TimerTask() {
//            @Override
//            public void run() {
               model.setRowCount(0);
                try {
                    pst = conn.prepareStatement(sqlQuery);
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }

                Object rows[] = new Object[8];
                try {
                    rs = pst.executeQuery();
                    if (rs.isBeforeFirst()) {
                        int i = 1;
                        while (rs.next()) {
                            for (Object row : rows) {
                                rows[0] = Integer.toString(i);
                                rows[1] = rs.getObject("Name");
                                rows[2] = rs.getObject("Reg_Number");
                                rows[3] = rs.getObject("Year_Of_Study");
                                rows[4] = rs.getObject("Phone_Number");
                                rows[5] = rs.getObject("message");
                                rows[6] = convertStatus(rs.getInt("status"));
                                rows[7] = rs.getString("timesent");
                            }
                            i++;
                            model.addRow(rows);
                        }
                        jTable1.setModel(model);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
//            }
//        }, 1, 10000);

    }

    private void populateInboxTable() {
        /**
         * instantiate the main variable outside the loop thread
         */
        model = new DefaultTableModel();
        String cols[] = {"Id", "Name", "Reg_Number.", "Year", "Phone", "Message", "Time received"};
        model.setColumnIdentifiers(cols);
        conn = new Connect().connect();
        String sqlQuery = "SELECT church_members_records.Name,church_members_records.Year_Of_Study,"
                + "church_members_records.Reg_Number,church_members_records.Phone_Number,church_members_records.Jumuiya,"
                + "inbox.sender,inbox.receiver,inbox.msg,inbox.senttime from inbox inner join"
                + " church_members_records on inbox.sender=church_members_records.Phone_Number order by inbox.senttime DESC";

        
//        scheduler.schedule(new TimerTask() {
//            @Override
//            public void run() {
        model.setRowCount(0);
                try {
                    pst = conn.prepareStatement(sqlQuery);
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }

                Object rows[] = new Object[8];
                try {
                    rs = pst.executeQuery();
                    if (rs.isBeforeFirst()) {
                        int i = 1;
                        while (rs.next()) {
                            for (Object row : rows) {
                                rows[0] = Integer.toString(i);
                                rows[1] = rs.getObject("Name");
                                rows[2] = rs.getObject("Reg_Number");
                                rows[3] = rs.getObject("Year_Of_Study");
                                rows[4] = rs.getObject("Phone_Number");
                                rows[5] = rs.getObject("msg");
                                rows[6] = rs.getString("senttime");
                            }
                            i++;
                            model.addRow(rows);
                        }
                        jTable1.setModel(model);
                    } else {
                        JOptionPane.showMessageDialog(null, "No new message");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
//            }
//        }, 1, 10000);

    }

    /*
    Method to convert message status code to a neat readable messages
     */
    private String convertStatus(int code) {
        switch (code) {
            case 201:
                return "Sent";
            case 301:
                return "Network error";
            case 300:
                return "Failed";
            case 200:
                return "Delivered";
            default:
                return Integer.toString(code); //not interpreted
        }
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnInbox = new javax.swing.JButton();
        jBtnOutbox = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jBtnInbox.setBackground(new java.awt.Color(255, 255, 255));
        jBtnInbox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnInbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/Outbox_38px.png"))); // NOI18N
        jBtnInbox.setText("Outbox");
        jBtnInbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jBtnOutbox.setBackground(new java.awt.Color(255, 255, 255));
        jBtnOutbox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnOutbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/Inbox_38px.png"))); // NOI18N
        jBtnOutbox.setText("Inbox");
        jBtnOutbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnOutbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOutboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jBtnInbox)
                .addGap(32, 32, 32)
                .addComponent(jBtnOutbox)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnInbox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jBtnOutbox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnOutboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOutboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnOutboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnInbox;
    private javax.swing.JButton jBtnOutbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
