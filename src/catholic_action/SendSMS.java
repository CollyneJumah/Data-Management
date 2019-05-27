/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catholic_action;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info@mimidots.com
 */
public final class SendSMS extends javax.swing.JPanel {
    
    private DefaultTableModel model;
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    private static String message;
    private static int countOverride;

    /**
     * Creates new form SendSMS
     */
    public SendSMS() {
        initComponents();
        initTable();
        eventHandler();
    }
    
    private void initTable() {
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 6; //set cell editable
            }
            
            //@Override
            public Class<?> getColumnClass(int columnIndex) {
                Class object = String.class;
                switch (columnIndex) {
                    case 6:
                        object = Boolean.class;
                }
                return object;
            }
            
        };
        jTable1.setRowHeight(30);
        String cols[] = {"Id", "Name", "Reg_Number","Jumuiya", "Year_Of_Study", "Phone_Number", ""};
        model.setColumnIdentifiers(cols);
        conn = new Connect().connect();
        String sqlQuery = "SELECT * from church_members_records order by Year_Of_Study";
        
        try {
            pst = conn.prepareStatement(sqlQuery);
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        populateTable(pst);
    }
    
    private void eventHandler(){
    jCheckSendAll.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent ie) {
            if (jCheckSendAll.isSelected()) {
                //select all recepients
                for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {
                    jTable1.getModel().setValueAt(true, i, 6);
                    countOverride = i;
                }
                jLabelCount.setText("Total recepients=" + countOverride);
            }
        }
    });
    
   jTxtSearch.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent ke) {
           String index = jTxtSearch.getText();
           String sqlQuery = "SELECT * from church_members_records where (Name like ? or Reg_Number like ? or Phone_Number like? )";
                try {
                    pst = conn.prepareStatement(sqlQuery);
                    pst.setString(1, "%" + index + "%");
                    pst.setString(2, "%" + index + "%");
                    pst.setString(3, index + "%");
                    pst.setString(4, "%" + index + "%");
                    pst.setString(5, index + "%");
                } catch (SQLException ex) {
                    Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                }
                populateTable(pst);

        } 
    });
   
   jComboFilter.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent ie) {
                int index = jComboFilter.getSelectedIndex();
            switch (index) {
                case 0: {
                    String sqlQuery = "SELECT * from church_members_records order by Year_Of_Study";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 1: {
                    String sqlQuery = "SELECT * from church_members_records order by Year_Of_Study";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                 case 2: {
                    String sqlQuery = "SELECT * from church_members_records where Year_Of_Study= '1'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                  case 3: {
                    String sqlQuery = "SELECT * from church_members_records where Year_Of_Study= '2'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                   case 4: {
                    String sqlQuery = "SELECT * from church_members_records where Year_Of_Study= '3'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                    case 5: {
                    String sqlQuery = "SELECT * from church_members_records where Year_Of_Study= '4'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                     case 6: {
                    String sqlQuery = "SELECT * from church_members_records where Year_Of_Study= 'Associate'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 7: {  /*use a simple inner join*/
                        String sqlQuery = "SELECT executiverecords.`Reg_Number`,church_members_records.Phone_Number,"
                            + "church_members_records.Name,church_members_records.Year_Of_Study FROM"
                            + " `executiverecords`inner join church_members_records on"
                            + " church_members_records.Phone_Number=executiverecords.Phone_Number";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                default: {
                    String sqlQuery = "SELECT * from church_members_records where Year_Of_Study=? order by Reg_Number";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                        pst.setInt(1, index);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }

            //call the populate table method
            populateTable(pst);
            
                   }
    });
   //Jumuiya sms sending
   filterJumuiya.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent ie) {
            int index = filterJumuiya.getSelectedIndex();
            switch (index) {
                case 0: {
                    String sqlQuery = "SELECT * from church_members_records order by Jumuiya ";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 1: {
                    String sqlQuery = "SELECT * from church_members_records order by Jumuiya ";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 2: {  /*use a simple inner join*/
                          String sqlQuery = "SELECT * from church_members_records where Jumuiya= 'ST.PETERS'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 3: {  /*use a simple inner join*/
                          String sqlQuery = "SELECT * from church_members_records where Jumuiya= 'ST.CHARLES'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 4: {  /*use a simple inner join*/
                          String sqlQuery = "SELECT * from church_members_records where Jumuiya= 'ST.BRIDGITS'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 5: {  /*use a simple inner join*/
                          String sqlQuery = "SELECT * from church_members_records where Jumuiya= 'HOLY FAMILY'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 6: {  /*use a simple inner join*/
                          String sqlQuery = "SELECT * from church_members_records where Jumuiya= 'ST.THOMAS AQUINAS'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 7: {  /*use a simple inner join*/
                          String sqlQuery = "SELECT * from church_members_records where Jumuiya= 'St.Stephenes'";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                default: {
                    String sqlQuery = "SELECT * from church_members_records where Jumuiya=? order by Reg_Number";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                        pst.setInt(1, index);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }

            //call the populate table method
            populateTable(pst);
            
                    }
    });
   //selecting churchgroups and populating table
    cboChurchGroups.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent ie) {
            int index = cboChurchGroups.getSelectedIndex();
            switch (index) {
                case 1: {
//                     String sqlQuery = "SELECT executiverecords.`Reg_Number`,church_members_records.Phone_Number,"
//                            + "church_members_records.Name,church_members_records.Year_Of_Study FROM"
//                            + " `executiverecords`inner join church_members_records on"
//                            + " church_members_records.Phone_Number=executiverecords.Phone_Number";
                    String sqlQuery="SELECT * FROM `executiverecords` WHERE `Year`='2018/2019' ";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 2: {
//                     String sqlQuery = "SELECT executiverecords.`Reg_Number`,church_members_records.Phone_Number,"
//                            + "church_members_records.Name,church_members_records.Year_Of_Study FROM"
//                            + " `executiverecords`inner join church_members_records on"
//                            + " church_members_records.Phone_Number=executiverecords.Phone_Number";
                    String sqlQuery="SELECT * FROM `jumuiyaleaders` order by Year ASC";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                 case 3: {
                    String sqlQuery="SELECT * FROM churchchoir order by RegNumber";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                  case 4: {
                    String sqlQuery="SELECT * FROM `nmcs` ORDER by RegNumber ASC";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                   case 5: {
                    String sqlQuery="SELECT * FROM `alterservers` ORDER BY RegNumber ASC";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                   case 6: {
                    String sqlQuery="SELECT * FROM `dancers` ORDER BY RegNumber ASC";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                   case 7: {
                    String sqlQuery="SELECT * FROM `ambassador` ORDER BY RegNumber ASC";
                    try {
                        pst = conn.prepareStatement(sqlQuery);
                    } catch (SQLException ex) {
                        Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
           
            }
             churchGroups(pst);
                   }
    });
    //handle the select repients within the table
    jTable1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
        int row = jTable1.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    if ((Boolean) jTable1.getModel().getValueAt(row, 6) == false) {
                        jCheckSendAll.setSelected(false);
                        countOverride--;
                    } else {
                        countOverride++;
                    }
                    jLabelCount.setText("Total recepients=" + countOverride);
                }
                
            }
        
       });
    /*handle the send sms action event button*/
    jBtnSend.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
             int count = 0;
            message = jTextArea1.getText();
            //get the message typed
            if (message.trim().equals("")) {
                int c = JOptionPane.showConfirmDialog(null, "Are you sure you want to send a blank message?", null, JOptionPane.OK_OPTION);
                if (c == 1) {
                    jTextArea1.setBorder(new LineBorder(Color.RED));
                    return; //exit the flow of execution to allow user to enter the message
                } else {
                    message = "";
                }
            }
            //send the message
            String recepients[] = new String[model.getRowCount()];
            for (int i = 0; i < jTable1.getModel().getRowCount(); i++) {
                /*add the recepients phone numbers into an array (size=the total number of rows)*/
                if ((Boolean) jTable1.getModel().getValueAt(i, 6) == true) {
                    recepients[count] = (String) jTable1.getModel().getValueAt(i, 5);
                    count++;
                }
            }
            
            for (String recepient : recepients) {
                if (null != recepient) {
                    //call the send sms method (only insert the receipients where index value is not null!!!)
                    sendSMS(recepient);
                }
            }
            //executed after sending the sms
            try {
                Icon icon = new ImageIcon(getClass().getResource("/smstest/images/10.gif"));
               JOptionPane.showMessageDialog(null, "Sending messages...","",JOptionPane.INFORMATION_MESSAGE,icon);

            } catch (Exception ex) {
                Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
            }
           }
    });
    }
    int p = 1;

    /**
     * method to initiate the SMS sending process [Inserts the messages to be
     * send into the out-box table]
     *
     * @param sendTo >>the recipient number
     */
    private void sendSMS(String sendTo) {
        try {
            pst = conn.prepareStatement("INSERT INTO outbox(receiver,msg,msgtype,sender) VALUES(?,?,?,?)");
            pst.setString(1, sendTo);
            pst.setString(2, message);
            pst.setString(3, "sms.text");
            pst.setString(4, "0790366848");
            
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.execute();
            System.out.println(p + ". sending to " + sendTo);
            p++;
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void populateTable(PreparedStatement pst) {
        Object rows[] = new Object[7];
        model.setRowCount(0); //clear the table first (to avoid appending the new data)
        countOverride = 0; //also reset the marked recepients to zero !important
        jLabelCount.setText("Total recepients=" + countOverride);
        
        try {
            rs = pst.executeQuery();
            if (rs.isBeforeFirst()) {
                jCheckSendAll.setEnabled(true); //incase it was disabled (in null filter results )
                int i = 1;
                while (rs.next()) {
                    for (Object row : rows) {
                        rows[0] = Integer.toString(i);
                        rows[1] = rs.getObject("Name");
                        rows[2] = rs.getObject("Reg_Number");
                        rows[3] = rs.getObject("Jumuiya");
                        rows[4] = rs.getObject("Year_Of_Study");
                        rows[5] = rs.getObject("Phone_Number");
                        rows[6] = false;
                    }
                    i++;
                    model.addRow(rows);
                }
                jTable1.setModel(model);
            } else {
                jCheckSendAll.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void churchGroups(PreparedStatement pst) {
        Object rows[] = new Object[7];
        model.setRowCount(0); //clear the table first (to avoid appending the new data)
        countOverride = 0; //also reset the marked recepients to zero !important
        jLabelCount.setText("Total recepients=" + countOverride);
        
        try {
            rs = pst.executeQuery();
            if (rs.isBeforeFirst()) {
                jCheckSendAll.setEnabled(true); //incase it was disabled (in null filter results )
                int i = 1;
                while (rs.next()) {
                    for (Object row : rows) {
                        rows[0] = Integer.toString(i);
                        rows[1] = rs.getObject("Name");
                        rows[2] = rs.getObject("RegNumber");
                        rows[3] = rs.getObject("Jumuiya");
                        rows[4] = rs.getObject("YearOfStudy");
                       // rows[5] = rs.getObject("Leadership");
                        rows[5] =rs.getObject("PhoneNumber");
                        rows[6] = false;
                    }
                    i++;
                    model.addRow(rows);
                }
                jTable1.setModel(model);
            } else {
                jCheckSendAll.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SendSMS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckSendAll = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        filterJumuiya = new javax.swing.JComboBox();
        cboChurchGroups = new javax.swing.JComboBox();
        cboCommittees = new javax.swing.JComboBox();
        jComboFilter = new javax.swing.JComboBox<>();
        jTxtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBtnSend = new javax.swing.JButton();
        jLabelCount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true), "www.collynejumah.com", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 255))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true), "Select recepients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/SMS_38px_2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, 70));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(153, 153, 255)));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 320, 130));

        jCheckSendAll.setBackground(new java.awt.Color(255, 255, 255));
        jCheckSendAll.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jCheckSendAll.setText("Send to all");
        jCheckSendAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSendAllActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckSendAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)), "Select Jumuiya to Send Message", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        filterJumuiya.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        filterJumuiya.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-Jumuiya-", "ALL", "St.Peters", "St.Charles", "St.Bridgits", "Holy Family", "St.Thomas Aquinas", "St.Stephenes", "Guest" }));

        cboChurchGroups.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboChurchGroups.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Group--", "Executive", "JumuiyaLeaders", "Choir", "NMCS", "AlterServers", "Dancers", "Fri Ambassadors" }));

        cboCommittees.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboCommittees.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-Committee-", "Development", "Prayer&Litergical", "EditorialBoard", "Organizing", "Ushering", "Sales&Marketing" }));

        jComboFilter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-Year-", "ALL", "Year_One", "Year_Two", "Year_Three", "Year_Four", "Associate", "Executive" }));
        jComboFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filterJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboChurchGroups, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(cboCommittees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChurchGroups, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCommittees, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 560, -1));

        jTxtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTxtSearch.setForeground(new java.awt.Color(0, 0, 204));
        jTxtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTxtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 187, 29));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true), "Filter", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(0, 102, 153))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 420, 70));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Or");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 255))); // NOI18N

        jBtnSend.setBackground(new java.awt.Color(153, 153, 255));
        jBtnSend.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnSend.setForeground(new java.awt.Color(102, 102, 255));
        jBtnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smstest/images/Paper Plane_35px.png"))); // NOI18N
        jBtnSend.setText("Send");
        jBtnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSendActionPerformed(evt);
            }
        });

        jLabelCount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCount.setText("Total recepients=0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jBtnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSend)
                    .addComponent(jLabelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboFilterActionPerformed

    private void jCheckSendAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSendAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckSendAllActionPerformed

    private void jBtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboChurchGroups;
    private javax.swing.JComboBox cboCommittees;
    private javax.swing.JComboBox filterJumuiya;
    private javax.swing.JButton jBtnSend;
    private javax.swing.JCheckBox jCheckSendAll;
    private javax.swing.JComboBox<String> jComboFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTxtSearch;
    // End of variables declaration//GEN-END:variables
}
