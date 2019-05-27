
package catholic_action;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.management.JMX;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Update_Members_Records extends javax.swing.JInternalFrame {

   
    public Update_Members_Records() {
        initComponents();
//        txtLastName.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtReg_Number = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboYearOfStudy = new javax.swing.JComboBox();
        cboFaculty = new javax.swing.JComboBox();
        cboCourse = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtParish = new javax.swing.JTextField();
        cboJumuiya = new javax.swing.JComboBox();
        cboCounty = new javax.swing.JComboBox();
        cboDioceses = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        EnterSearch = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Update Members Records");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 3));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)), "Personal Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setText("Reg_Number");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setText("Gender");

        txtReg_Number.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cboGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Gender--", "Male", "Female" }));

        txtPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("Phone");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtReg_Number))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReg_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)), "Other_Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12), new java.awt.Color(153, 153, 255))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)), "Academic_Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 12), new java.awt.Color(153, 153, 255))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel15.setText("YearOfStudy");

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("Faculty");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setText("Course");

        cboYearOfStudy.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboYearOfStudy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Year--", "Year_One", "Year_Two", "Year_Three", "Year_Four", "Associate" }));

        cboFaculty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboFaculty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Faculty--", "Sch Of Business & Economics", "Faculty of Agric & Natural Resource Mgnt", "Faculty of Info Scie & Tech", "School Of Law", "Faculty of Education & Human Resource Dev.", "School of Health Sciences", "Sch. of Pure & Applied Scie", "Faculty of Arts & Social Scie" }));
        cboFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFacultyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboYearOfStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboYearOfStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("County");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Jumuiya");

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setText("Parish");

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setText("Diocese");

        txtParish.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cboJumuiya.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboJumuiya.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Jumuiya--", "ST.THOMAS AQUINUS", "ST.PETERS", "ST.BRIDGITS", "HOLY FAMILY", "ST.CHARLES", "ST.STEPHENES" }));

        cboCounty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboCounty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select-- County--", "Baringo County", "Bomet County", "Bungoma County", "Busia County", "Elgeyo Marakwet County", "Embu County", "Garissa County", "Homa Bay County", "Isiolo County", "Kajiado County", "Kakamega County", "Kericho County", "Kiambu County", "Kilifi County", "Kirinyaga County", "Kisii County", "Kisumu County", "Kitui County", "Kwale County", "Laikipia County", "Lamu County", "Machakos County", "Makueni County", "Mandera County", "Meru County", "Migori County", "Marsabit County", "Mombasa County", "Muranga County", "Nairobi County", "Nakuru County", "Nandi County", "Narok County", "Nyamira County", "Nyandarua County", "Nyeri County", "Samburu County", "Siaya County", "Taita Taveta County", "Tana River County", "Tharaka Nithi County", "Trans Nzoia County", "Turkana County", "Uasin Gishu County", "Vihiga County", "Wajir County", "West Pokot County" }));

        cboDioceses.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboDioceses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Diocese--", "Ecclesiastical Jurisidictions", "Bungoma", "Eldoret", "Embu", "Garissa", "Homa Bay", "Isiolo", "Kakamega", "Kericho", "Kisii", "Kisumu", "Kitale", "Kitui", "Lodwar", "Machakos", "Malindi", "Maralal", "Marsabit", "Meru", "Military Ordinariate of Kenya", "Mombasa", "Muranga", "Nairobi", "Nakuru", "Ngong", "Nyahururu\t", "Nyeri" }));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Date");

        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCounty, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtParish)
                    .addComponent(cboDioceses, 0, 0, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboCounty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel11)))
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(cboJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtParish, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboDioceses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose_Action", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Home_30px.png"))); // NOI18N
        jButton3.setText("Home");
        jButton3.setToolTipText("Back Home");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Updates.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.setToolTipText("Update Records");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Cancel 2_30px_2.png"))); // NOI18N
        jButton4.setText("Cancel");
        jButton4.setToolTipText("Cancel records");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(57, 57, 57)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Filter", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        EnterSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EnterSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterSearch.setToolTipText("Enter Your RegNumber");
        EnterSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        EnterSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EnterSearchKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 51, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Search_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(EnterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(EnterSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        char c = evt.getKeyChar();

        if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_ENTER))) {

            JOptionPane.showMessageDialog(null, "Enter Numerics Only");
            evt.consume();

        }          // TODO add your handling code here:

        String phoneNumber=txtPhoneNumber.getText();

        if(phoneNumber.length()==13){
            evt.consume();

        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  int components;
        Connection con=null;
        ResultSet rs;
        Statement st;
        PreparedStatement pst=null;

       // String dl=((JTextField)date.getDateEditor().getUiComponent()).getText();

        try{

            String dbname="st_michael_catholic";
            String pass="";
            String username="root";
            String Url="jdbc:mysql://localhost:3306/";
            String Drivers="com.mysql.jdbc.Driver";

            Class.forName(Drivers);
            con=DriverManager.getConnection(Url+dbname,username,pass);
            String Gender;
            String Fname=txtFirstName.getText();
          //  String lname=txtLastName.getText();
//            String name=Fname+" "+" "+lname;
            String RegNumber=txtReg_Number.getText();
            String phone=txtPhoneNumber.getText();
            String Parish=txtParish.getText();
            String fac=(String) cboFaculty.getSelectedItem();//casting
            String course=(String) cboCourse.getSelectedItem();
            String county=(String) cboCounty.getSelectedItem();
            String diosece=(String) cboDioceses.getSelectedItem();
            String Year=(String) cboYearOfStudy.getSelectedItem();
           
                switch (Year) {
                    case "Year_One":
                        Year="1";
                        break;
                    case "Year_Two":
                        Year="2";
                        break;
                    case "Year_Three":
                        Year="3";
                        break;
                    case "Year_Four":
                        Year="4";
                        break;
                    case "Associate":
                        Year="Associate";
                        break;
                }
                 if(Fname.equals("")||RegNumber.equals("")||phone.equals("")||Parish.equals("")||fac.equals("")||county.equals("")||diosece.equals("")||Year.equals("")){
                    txtFirstName.setBorder(new LineBorder(Color.RED));
                    //txtLastName.setBorder(new LineBorder(Color.RED));
                    txtReg_Number.setBorder(new LineBorder(Color.RED));
                    txtPhoneNumber.setBorder(new LineBorder(Color.RED));
                    txtParish.setBorder(new LineBorder(Color.RED));
                    cboCounty.setBorder(new LineBorder(Color.RED));
                   // cboCourse.setBorder(new LineBorder(Color.RED));
                    cboFaculty.setBorder(new LineBorder(Color.RED));
                    cboJumuiya.setBorder(new LineBorder(Color.RED));
                    cboYearOfStudy.setBorder(new LineBorder(Color.RED));
                    cboDioceses.setBorder(new LineBorder(Color.RED));
       
                    JOptionPane.showMessageDialog(this,"All Fields are Required!");
                    
                
                }
            else{

                String sql="Update church_members_records set Name='"+txtFirstName.getText()+"',"
                + "Reg_Number='"+txtReg_Number.getText()+"',Gender='"+cboGender.getSelectedItem()+"',"
                + "Phone_Number='"+txtPhoneNumber.getText()+"',County='"+cboCounty.getSelectedItem()+"',"
                + "Jumuiya='"+cboJumuiya.getSelectedItem()+"',Parish='"+txtParish.getText()+"',"
                + "Diocese='"+cboDioceses.getSelectedItem()+"',Year_Of_Study='"+Year+"',"
                + "Faculty='"+cboFaculty.getSelectedItem()+"',Course='"+cboCourse.getSelectedItem()+"',"
                + "Dat='"+txtDate.getText()+"' WHERE Reg_Number='"+EnterSearch.getText()+"' || Name= '"+EnterSearch.getText()+"'";
              
             //   String sql="Update executiverecords set First_Name='"+txtFirstName.getText()+"',Last_Name='"+txtLastName.getText()+"',Reg_Number='"+txtReg_Number.getText()+"',Leadership='"+txtPosition.getText()+"'";
                st=con.createStatement();
                st.executeUpdate(sql);
                       
                JOptionPane.showMessageDialog(this,"Records Updated\n Successfully!");
                txtFirstName.setText("");
               // txtLastName.setText("");
                txtReg_Number.setText("");
                txtPhoneNumber.setText("");
                cboDioceses.setSelectedIndex(0);
                cboJumuiya.setSelectedIndex(0);
                cboYearOfStudy.setSelectedIndex(0);
                txtDate.setText("");
                txtParish.setText("");
                cboCounty.setSelectedIndex(0);
                cboCourse.setSelectedIndex(0);
                cboGender.setSelectedIndex(0);
                cboFaculty.setSelectedIndex(0);

            }
        }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error Occured!\n Please try Again"+e.getLocalizedMessage());
            }
         
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                  int component;
        Connection con=null;
        ResultSet rs=null;
        Statement st=null;
        PreparedStatement pst=null;
        // int p=JOptionPane.showConfirmDialog(null,"DO YOU REALLY WANT TO Update?","UPDATE!",JOptionPane.YES_NO_OPTION);
        // if(p==0){
            try{
                String dbname="st_michael_catholic";
                String pass="";
                String username="root";
                String Url="jdbc:mysql://localhost:3306/";
                String Drivers="com.mysql.jdbc.Driver";

                Class.forName(Drivers);
                con=DriverManager.getConnection(Url+dbname,username,pass);
                    String original="",phone_Number="";
               
             while(rs.next()){
                 original=rs.getString("Phone_Number");
                 phone_Number=rs.getString("Phone_Number");
                 String fin = null;
                if(original.startsWith("7")){
                fin=original.replace("7", "+2547");
              }
               else if(!original.startsWith("7")){
             
             }}
                 String sql="Update church_members_records set Phone_Number=? where Phone_Number=?'";
                 
                st=con.createStatement();
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(this,"RECORDS UPDATED\n SUCCESSFULLY!");

            }

            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error Occured!\n Please try Again"+e.getLocalizedMessage());
            }
            //}else{
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        txtFirstName.setText("");
      //  txtLastName.setText("");
        txtReg_Number.setText("");
        txtPhoneNumber.setText("");
        cboDioceses.setSelectedItem("");
        cboJumuiya.setSelectedItem("");
        cboYearOfStudy.setSelectedItem("");
        txtDate.setText("");
        txtParish.setText("");
        cboCounty.setSelectedItem("");
        cboCourse.setSelectedItem("");
        cboGender.setSelectedItem("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void EnterSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterSearchKeyTyped

        table_filter();

        String type=EnterSearch.getText();
        if(type.length()>=14){
            evt.consume();

        }else{

        }
    }//GEN-LAST:event_EnterSearchKeyTyped

    private void cboFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFacultyActionPerformed
      selectFaculty();
    }//GEN-LAST:event_cboFacultyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterSearch;
    private javax.swing.JComboBox cboCounty;
    private javax.swing.JComboBox cboCourse;
    private javax.swing.JComboBox cboDioceses;
    private javax.swing.JComboBox cboFaculty;
    private javax.swing.JComboBox cboGender;
    private javax.swing.JComboBox cboJumuiya;
    private javax.swing.JComboBox cboYearOfStudy;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtParish;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtReg_Number;
    // End of variables declaration//GEN-END:variables
  public void table_filter(){
         
       
      
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

            
            String sql="SELECT * FROM church_members_records WHERE Reg_Number LIKE '%"+EnterSearch.getText()+"%'|| Name LIKE '%"+EnterSearch.getText()+"%'|| Phone_Number LIKE '%"+EnterSearch.getText()+"%'";

            st=con.createStatement();
            rs=st.executeQuery(sql);
           
         
               
            while (rs.next()==true){
                
              //   model.setRowCount(model.getRowCount()+1);

               // String fn=rs.getString("First_Name");
                String n=rs.getString("Name");
                String rn=rs.getString("Reg_Number");
                String gd=rs.getString("Gender");
                String phn=rs.getString("Phone_Number");
                String cnty=rs.getString("County");
                String jm=rs.getString("Jumuiya");
                String ps=rs.getString("Parish");
                String dc=rs.getString("Diocese");
                String yos=rs.getString("Year_Of_Study");
                String fc=rs.getString("Faculty");
                String cs=rs.getString("Course");
                String dt=rs.getString("Dat");
                
                txtFirstName.setText(n);
                txtReg_Number.setText(rn);
                cboGender.setSelectedItem(gd);
                txtPhoneNumber.setText(phn);
                cboCounty.setSelectedItem(cnty);
                cboJumuiya.setSelectedItem(jm);
                txtParish.setText(ps);
                cboDioceses.setSelectedItem(dc);
                cboYearOfStudy.setSelectedItem(yos);
                cboFaculty.setSelectedItem(fc);
                cboCourse.setSelectedItem(cs);
                txtDate.setText(dt);
             
               // model.addRow(new Object[]{fn,mn,ln,gd,rn,phn,yos,jmy});
                   
//            JOptionPane.showMessageDialog(this,"No RECORD FOUND");
        }
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"NO RECORDS FOUND"+e.getLocalizedMessage());
        }
     }
    public void selectFaculty(){
    final DefaultComboBoxModel FANRM = new DefaultComboBoxModel(new String[]{"--Select Course--","BSc.Applied Aquatic Sciences","BSc.Fisheries Aquaculture","Bs.Agribusiness Management","Bsc. Agricultural Economics","Bsc Animal Production","Bsc.Animal Science & Technology","Bsc.Animal Health","Bsc.Environmental Sciences","Bsc.Natural Resource Management","Bsc.Agriculture","Bsc.Agriculture"});
    final DefaultComboBoxModel BBAM = new DefaultComboBoxModel(new String[]{"--Select Course--","Ba. in Commerce","Ba in Catering & Hotel Management","Ba. of Sci in Economic Satatistics","Ba.in Business Management","Ba.in Tourism & Tour Operations Mgnt","Ba.in Acturial Science","Ba.in Enterpreneuship&Small Busness Mgnt"});
    final DefaultComboBoxModel LAW= new DefaultComboBoxModel(new String[]{"--Select Course--", "Bachelor of Laws(LLB)","Ba.in Criminology &Security Studies"});
    final DefaultComboBoxModel FIST = new DefaultComboBoxModel(new String[]{"--Select Course--","Bsc.Arts in Mass Communication","Bs.Computer Science","Bs Applied Comp Science","Bs.Library&Information Science","Bs.Software Engineering","Bs.Information Technology"});
    final DefaultComboBoxModel EDU = new DefaultComboBoxModel(new String[]{"--Select Course--","Bachelor of Education (Arts)","Bachelor of Education (Primary Option)","Bachelor of Education (Science)","Bsc.in Agriculture Edu. And Extension","Bsc.in Clothing,Textiles &Interior Design","Bsc.in Agric& Human Ecology Extension","Ba.in Psychology","Bed.in Early Childhood"});
    final DefaultComboBoxModel HEALTH = new DefaultComboBoxModel(new String[]{"--Select Course--","Bmed.And Bsc of Surgery", "Bsc.Biomedical scie & Tech", "Bsc. Food,Nutrition & Dietic"});
    final DefaultComboBoxModel SPAS = new DefaultComboBoxModel(new String[]{"--Select Course--","Bachelor of General Science","BSc. Chemistry","BSc. Physics","BSc. Biological Science","BSc. Applied Statistics","BSc. In Mathematics with Computing","BSc. Mathematics (Pure Mathematics, Applied","Mathematics and Statistics)","BSc. Biology (Botany or zoology option)","BSc. Biochemistry", "BSc. Microbiology","BSc. Biotechnology","BSc. Cellular and Molecular Biology","BSc. Petroleum Chemistry","BSc.Renewable Energy","BSc.Industrial Chemistry","BSc.Conservation Biology","BSc. Forensic Biology","BSc. Applied Biology","BSc. Natural products","BSc. Laboratory Sciences","BSc. Waste Management","BSc. Plant Production and Pathology","BSc. Analytical Chemistry","BSc.Environmental Chemistry","BSc. Geophysical and mineralogy","Bachelor of Actuarial Science(BACS)"});
    final DefaultComboBoxModel FASS = new DefaultComboBoxModel(new String[]{"--Select Course--","Bsc. General","Bsc. Community Development","Bsc. Peace & Conflict Studies","Bsc.Public Administrator","Bsc Economics & sociology","Bsc. Sociology & Social Work","Bsc.Criminology & Security Studies","Bsc. Counselling Psychology","Linguistics"});
   cboFaculty.addActionListener (new ActionListener() {
        @Override
//                Sch Of Buss & Econ
//Agric & Natural Resource Management
//Infor Scie & Tech
//Sch Of Law
//Education & Human Resource Dev.
//Health Scie
//Pure & Applied Scie
////Arts & Social 
        
        public void actionPerformed(ActionEvent ae) {
             if ("Sch Of Business & Economics".equals(cboFaculty.getSelectedItem())){
           cboCourse.setModel(BBAM);
       } else if("Faculty of Agric & Natural Resource Mgnt".equals(cboFaculty.getSelectedItem())){
           cboCourse.setModel(FANRM);
       }else if("Faculty of Info Scie & Tech".equals(cboFaculty.getSelectedItem())){
           cboCourse.setModel(FIST);
       }else if("School Of Law".equals(cboFaculty.getSelectedItem())){
           cboCourse.setModel(LAW);
       }else if("Faculty of Education & Human Resource Dev.".equals(cboFaculty.getSelectedItem())){
           cboCourse.setModel(EDU);
       }else if("School of Health Sciences".equals(cboFaculty.getSelectedItem())){
           cboCourse.setModel(HEALTH);
       }else if("Sch. of Pure & Applied Scie".equals(cboFaculty.getSelectedItem())){
           cboCourse.setModel(SPAS);
       }else if("Faculty of Arts & Social Scie".equals(cboFaculty.getSelectedItem()))
           cboCourse.setModel(FASS);
    
        }
    });
    
    }       
}
