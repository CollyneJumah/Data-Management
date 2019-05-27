
package catholic_action;
                 
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.text.html.parser.DTDConstants;


public class ExecutiveRegistration extends javax.swing.JInternalFrame {
       
   
    public ExecutiveRegistration() {
        initComponents();
                txtFirst_Name.setEditable(false);
                txtReg_Number.setEditable(false);
                txtPhone.setEditable(false);
                cboYearStudy.setEditable(false);
               
//         ImageIcon img = new ImageIcon(getClass().getResource("/myImages/buzz.png"));
//       //  this.setIconImage(img.getImage());
//        this.setTitle("This is Collyne's data");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtReg_Number = new javax.swing.JTextField();
        cboPosition = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtFirst_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtemailAddress = new javax.swing.JTextField();
        attach = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        attachPhoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboYear = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cboJumuiya = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cboYearStudy = new javax.swing.JComboBox();
        regNumber = new javax.swing.JTextField();
        showTime = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Executive Registration");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)), "Register as an Executive", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Reg_Number");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Leadership");

        txtReg_Number.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtReg_Number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReg_Number.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        cboPosition.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select-Position---", "Chair Person", "Vice Chair Person", "Organizing Secretary", "Seceretary", "Vice Secretary", "Financial Controller", "Publicity Secretary", "Project Coordinator", "Prayer&Liturgical Coordinator", "Entertainment Secretary", "Alter Server Rep", "NMCS Rep", "Choir Coordinator" }));
        cboPosition.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Name");

        txtFirst_Name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtFirst_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirst_Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Phone");

        txtPhone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Email");

        txtemailAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtemailAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtemailAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtemailAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailAddressKeyTyped(evt);
            }
        });

        attach.setBackground(new java.awt.Color(153, 153, 255));
        attach.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        attach.setForeground(new java.awt.Color(255, 255, 102));
        attach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/upload.png"))); // NOI18N
        attach.setText("Upload Image");
        attach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachActionPerformed(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attachPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attachPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(attachPhoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Year");

        cboYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Year--", "2016/2017", "2017/2018", "2018/2019", "2019/2020", "2020/2021", "2021/2022", "2022/2023", "2023/2024", "2024/2025", "2025/2026", "2026/2027", "2027/2028", "2028/2029", "2029/2030" }));
        cboYear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Jumuiya:");

        cboJumuiya.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboJumuiya.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Jumuiya--", "ST.THOMAS AQUINUS", "ST.PETERS", "ST.BRIDGITS", "HOLY FAMILY", "ST.CHARLES", "ST.STEPHENES" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Study Year");

        cboYearStudy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Year--", "Year_One", "Year_Two", "Year_Three", "Year_Four", "Associate" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtReg_Number, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(txtFirst_Name))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboJumuiya, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtemailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cboYearStudy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attach, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1))
                .addGap(157, 157, 157))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtReg_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(txtemailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFirst_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboYearStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        regNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        regNumber.setForeground(new java.awt.Color(0, 102, 102));
        regNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regNumber.setToolTipText("Enter Reg_Number");
        regNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        regNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNumberActionPerformed(evt);
            }
        });
        regNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regNumberKeyTyped(evt);
            }
        });

        showTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Search.png"))); // NOI18N
        jButton3.setText("RegNumber");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Save.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Cancel 2_30px_2.png"))); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(showTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(showTime, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailAddressKeyTyped

        //        String emailAddress=txtemailAddress.getText();
        //        Pattern regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        //        Matcher regMatcher = regexPattern.matcher(emailAddress);
        //        if(regMatcher.matches()) {
            //            //return "Valid Email Address";
            //            JOptionPane.showMessageDialog(this,"Valid Email Address");
            //        } else {
            //           // return "Invalid Email Address";
            //            JOptionPane.showMessageDialog(this,"Invalid Email Address");
            //        }
    }//GEN-LAST:event_txtemailAddressKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //       int save;
        //      save=JOptionPane.showConfirmDialog(null,"Are you a Jumuiya leader\n Click YES to register!","Save/n ?",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        //    if(save==JOptionPane.YES_NO_OPTION){
            //     JUMUIYAlEADERS jm= new JUMUIYAlEADERS();
            //     jm.setVisible(true);
            //
            //     }
        //     else{
            //     JOptionPane.showMessageDialog(this,"Save Successfully!");
            //    }

        ///save to database executive
//        int components;
//        Connection con=null;
//        ResultSet rs;
//        Statement st;
//        PreparedStatement pst=null;

//        try{
//
//            String dbname="st_michael_catholic";
//            String pass="";
//            String username="root";
//            String Url="jdbc:mysql://localhost:3306/";
//            String Drivers="com.mysql.jdbc.Driver";
//
//            Class.forName(Drivers);
//            con=DriverManager.getConnection(Url+dbname,username,pass);
//
//            String sql="INSERT INTO executiverecords(Reg_Number,First_Name,Last_Name,Leadership,Email)VALUES('"+txtReg_Number.getText()+"','"+txtFirst_Name.getText()+"','"+txtLastName.getText()+"','"+cboPosition.getSelectedItem()+"','"+txtemailAddress.getText()+"')";
//            pst=con.prepareStatement(sql);
//            pst.execute();
//
//            int saveExec;
//            saveExec=  JOptionPane.showConfirmDialog(null,"Save","Are you Sure you/n want to Save Data?",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
//
//            if(saveExec==JOptionPane.YES_NO_OPTION){
//                JOptionPane.showMessageDialog(this,"Data Saved Successfully!");
//            }
//            else{
//
//            }
//        }catch(Exception ex){
//
//            JOptionPane.showMessageDialog(this,"Please Fill all Fields!"+ex.getLocalizedMessage());
//
//        }
        saveData();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void regNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNumberActionPerformed

    private void regNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regNumberKeyTyped
           tableFilter();
        String input=regNumber.getText();
        if(input.length()>=14){

            JOptionPane.showMessageDialog(this,"Maxmum Lenght is 14!");
            evt.consume();
        }
       
    }//GEN-LAST:event_regNumberKeyTyped

    private void attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachActionPerformed
                 JFileChooser chooser=new  JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int rase=chooser.showOpenDialog(this);

        if(rase==JFileChooser.APPROVE_OPTION)
        {

            FileInputStream fis=null;

            try{

                File file=chooser.getSelectedFile();
                ImageIcon image=new ImageIcon(file.getAbsolutePath());
                java.awt.Rectangle rec=attachPhoto.getBounds();
                Image scaledImage=image.getImage().getScaledInstance
                (rec.width,rec.height,Image.SCALE_DEFAULT);
                image=new ImageIcon(scaledImage);
                attachPhoto.setIcon(image);
                File f=chooser.getSelectedFile();
                filename=f.getAbsolutePath();
                attach.setText(filename);
                File image1=new File(filename);
                fis=new FileInputStream(image1);
                ByteArrayOutputStream bos=new ByteArrayOutputStream();
                byte buf[]=new byte[1024];
                for (int readNum; (readNum=fis.read(buf)) != -1;) {

                    bos.write(buf, 0, readNum);
                }
                person_image=bos.toByteArray();
            }
            catch(IOException ex){

                ex.printStackTrace();
            }

        }

    }//GEN-LAST:event_attachActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attach;
    private javax.swing.JLabel attachPhoto;
    private javax.swing.JComboBox cboJumuiya;
    private javax.swing.JComboBox cboPosition;
    private javax.swing.JComboBox cboYear;
    private javax.swing.JComboBox cboYearStudy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField regNumber;
    private javax.swing.JLabel showTime;
    private javax.swing.JLabel time;
    private javax.swing.JTextField txtFirst_Name;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtReg_Number;
    private javax.swing.JTextField txtemailAddress;
    // End of variables declaration//GEN-END:variables

 private String sd;
            private ImageIcon format=null;
            String filename=null;
            int s=0;
            byte[] person_image=null;
public void tableFilter(){
         
        int component;
        Connection con=null;
        ResultSet rs;
        Statement st;
        PreparedStatement pst=null;

        try{
            String dbname="st_michael_catholic";
            String pass="";
            String username="root";
            String Url="jdbc:mysql://localhost:3306/";
            String Drivers="com.mysql.jdbc.Driver";

            Class.forName(Drivers);

            con=DriverManager.getConnection(Url+dbname,username,pass);
            String sql="SELECT * FROM church_members_records WHERE Reg_Number LIKE '%"+regNumber.getText()+"%' || Name LIKE '%"+regNumber.getText()+"%'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
           
            while (rs.next()){   
              //model.setRowCount(model.getRowCount()+1);
                String rg=rs.getString("Reg_Number");
                String fn=rs.getString("Name");
                String phn=rs.getString("Phone_Number");
                String jm=rs.getString("Jumuiya");
                String y=rs.getString("Year_Of_Study");
        
                txtReg_Number.setText(rg);
                txtFirst_Name.setText(fn);
                txtPhone.setText(phn);
                cboJumuiya.setSelectedItem(jm);
                cboYearStudy.setSelectedItem(y);
            
           }
            
        
//            JOptionPane.showMessageDialog(this,"No RECORD FOUND");
        }
       
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"No Record Match!"+e.getLocalizedMessage());
        }
       
     }

public void timer(){

     Thread clock= new Thread(){
         public void run(){
         
         for(;;){
          Calendar cal = new GregorianCalendar();
        int second= cal.get(Calendar.SECOND);
        int minutes= cal.get(Calendar.MINUTE);
        int hours= cal.get(Calendar.HOUR);
        time.setText("Time:"+(hours+12)+":"+minutes+":"+"Min"+second+"Sec");
         try{
             sleep(1000);
         }catch(Exception ex){
         
             JOptionPane.showMessageDialog(null, ex);
         
         }
         }
         }
         
                };
         clock.start();
                 }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void saveData(){
                
        String dbnam = "st_michael_catholic";
        String pwd = "";
        String usernam = "root";
        String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String tb = "testimage";
        Connection cn = null;
        Connection cn_ = null;
        PreparedStatement pst = null;
        PreparedStatement pst_ = null;
        ResultSet rs = null;

        String reg = txtReg_Number.getText();
               try {

        Class.forName(Driver).newInstance();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
               String regN= txtReg_Number.getText();
              // String lname= txtLastName.getText();
               String fname=txtFirst_Name.getText();
               String email= txtemailAddress.getText();
               String leader=(String)cboPosition.getSelectedItem();
               String year= (String)cboYear.getSelectedItem();
               if(regN.equals("")||fname.equals("")||email.equals("")||leader.equals("")||year.equals("")){
                   
                    txtemailAddress.setBorder(new LineBorder(Color.red));
                    cboPosition.setBorder(new LineBorder(Color.red));
                    cboYear.setBorder(new LineBorder(Color.red));
                    cboYearStudy.setBorder(new LineBorder(Color.red));
                   JOptionPane.showMessageDialog(this,"Please,All Fields are required!");
               
               }else{
      
            try {
              
                cn = DriverManager.getConnection(url + dbnam, usernam, pwd);
                Statement s = cn.createStatement();

                 String insert = "INSERT INTO executiverecords (Name,RegNumber,PhoneNumber,Jumuiya,Leadership,Email,Year,YearOfStudy,image) VALUES(?,?,?,?,?,?,?,?,?)";
                pst = cn.prepareStatement(insert);

                pst.setString(1, (String) txtFirst_Name.getText());
                pst.setString(2, (String) txtReg_Number.getText());
                pst.setString(3, (String) txtPhone.getText());
                pst.setString(4, (String) cboJumuiya.getSelectedItem());
                pst.setString(5, (String) cboPosition.getSelectedItem());
                pst.setString(6, (String) txtemailAddress.getText());
                pst.setString(7, (String) cboYear.getSelectedItem());
                 pst.setString(8, (String) cboYearStudy.getSelectedItem());
                pst.setBytes (9, person_image);
                pst.execute();

            JOptionPane.showMessageDialog(null, "Data saved Successful");
                txtFirst_Name.setText("");
                txtPhone.setText("");
                txtReg_Number.setText("");
                cboJumuiya.setSelectedIndex(0);
                cboPosition.setSelectedIndex(0);
                cboYear.setSelectedIndex(0);
                cboYearStudy.setSelectedIndex(0);
 
//                cn.close();
//                cn_.close();
            } catch (SQLException m) {
                JOptionPane.showMessageDialog(this,"Dear"+"\n "+fname+"!"+"\n\t\tYou are Registered.");
            }
        
    }
    }
}
