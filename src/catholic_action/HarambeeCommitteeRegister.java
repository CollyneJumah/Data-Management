
package catholic_action;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author CollyneJumah
 */
public class HarambeeCommitteeRegister extends javax.swing.JInternalFrame {

    /**
     * Creates new form HarambeeCommitteeRegister
     */
    public HarambeeCommitteeRegister() {
        initComponents();
               txtName.setEditable(false);
                txtRegNumber.setEditable(false);
                txtJumuiya.setEditable(false);
                txtPhone.setEditable(false);
                txtYear.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRegNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtJumuiya = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboLeadership = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cboYearRange = new javax.swing.JComboBox();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        attachPhoto = new javax.swing.JLabel();
        attach = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEnterRegNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("RegNumber");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Jumuiya");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("PHONE");

        jLabel5.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Harambee Committee Registration");

        txtRegNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRegNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        txtJumuiya.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJumuiya.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Email");

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Leadership");

        cboLeadership.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboLeadership.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select--Position--", "ChairPerson", "ViceChairPerson", "Secretary", "ViceSecretary", "Financial Controller", "Member" }));
        cboLeadership.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        cboLeadership.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboLeadership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLeadershipActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("YearOfStudy");

        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Year");

        cboYearRange.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cboYearRange.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Year Range--", "2016/2017", "2017/2018", "2018/2019", "2019/2020", "2021/2022", "2022/2023", "2023/2024", "2024/2025", "2025/2026", "2026/2027", "2027/2028", "2028/2029", "2029/2030", "2030/2031" }));
        cboYearRange.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        cboYearRange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attachPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(attachPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(attachPhoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        attach.setBackground(new java.awt.Color(102, 102, 255));
        attach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        attach.setForeground(new java.awt.Color(255, 255, 102));
        attach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Upload_30px.png"))); // NOI18N
        attach.setText("Attach");
        attach.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));
        attach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Cancel 2_30px_2.png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Save.png"))); // NOI18N
        jButton3.setText("Submit");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 0));

        txtEnterRegNumber.setFont(new java.awt.Font("Prestige Elite Std", 1, 18)); // NOI18N
        txtEnterRegNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEnterRegNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        txtEnterRegNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEnterRegNumberKeyTyped(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/kenya_flag_animation_image.gif"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Search.png"))); // NOI18N
        jButton1.setText("Enter Your RegNumber");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addGap(3, 3, 3)
                        .addComponent(txtEnterRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboLeadership, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(cboYearRange, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attach, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboLeadership, cboYearRange, txtEmail, txtJumuiya, txtName, txtPhone, txtRegNumber, txtYear});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)))
                .addGap(128, 128, 128)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(txtEnterRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtJumuiya, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cboLeadership, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel2)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel7)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cboYearRange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(attach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboLeadership, cboYearRange, txtEmail, txtJumuiya, txtName, txtPhone, txtRegNumber, txtYear});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboLeadershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLeadershipActionPerformed
      
    }//GEN-LAST:event_cboLeadershipActionPerformed

    private void txtEnterRegNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnterRegNumberKeyTyped
      tableFilter();
    }//GEN-LAST:event_txtEnterRegNumberKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtName.setText("");
        txtRegNumber.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtJumuiya.setText("");
        txtEnterRegNumber.setText("");
        cboLeadership.setSelectedIndex(0);
        cboYearRange.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       saveData();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attach;
    private javax.swing.JLabel attachPhoto;
    private javax.swing.JComboBox cboLeadership;
    private javax.swing.JComboBox cboYearRange;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnterRegNumber;
    private javax.swing.JTextField txtJumuiya;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRegNumber;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables


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
//String sql="SELECT * FROM church_members_records WHERE Reg_Number LIKE '%"+txtRegNumber.getText()+"%'";
//
//            st=con.createStatement();
//            rs=st.executeQuery(sql);
//           
//            while (rs.next()){
            con=DriverManager.getConnection(Url+dbname,username,pass);
            String sql="SELECT * FROM church_members_records WHERE Reg_Number LIKE '%"+txtEnterRegNumber.getText()+"%' || Name LIKE '%"+txtEnterRegNumber.getText()+"%'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
           
            while (rs.next()){
                
              //   model.setRowCount(model.getRowCount()+1);
                String nm=rs.getString("Name");
                String rg=rs.getString("Reg_Number");
                String fn=rs.getString("Jumuiya");
                String pn=rs.getString("Phone_Number");
                String ys=rs.getString("Year_Of_Study");
               
                txtName.setText(nm);
                txtRegNumber.setText(rg);
                txtJumuiya.setText(fn);
                txtPhone.setText(pn);
                txtYear.setText(ys);
                
                
               // model.addRow(new Object[]{fn,mn,ln,gd,rn,phn,yos,jmy});
            
                    
           }
        
//            JOptionPane.showMessageDialog(this,"No RECORD FOUND");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"NO RECORDS FOUND"+e.getLocalizedMessage());
        }
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
             String name=txtName.getText();
        String reg = txtEnterRegNumber.getText();
               try {

        Class.forName(Driver).newInstance();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      
            try {
              
                cn = DriverManager.getConnection(url + dbnam, usernam, pwd);
                Statement s = cn.createStatement();

                 String insert = "INSERT INTO harambeecommittee (Name,RegNumber,Jumuiya,PhoneNumber,YearOfStudy,Email,Leadership,Year,image) VALUES(?,?,?,?,?,?,?,?,?)";
                pst = cn.prepareStatement(insert);
                  
                pst.setString(1, (String) txtName.getText());
                pst.setString(2, (String) txtRegNumber.getText());
                pst.setString(3, (String) txtJumuiya.getText());
                pst.setString(4, (String) txtPhone.getText());
                pst.setString(5, (String) txtYear.getText());
                pst.setString(6, (String) txtEmail.getText());
                pst.setString(7,(String) cboLeadership.getSelectedItem());
                pst.setString(8, (String) cboYearRange.getSelectedItem());
                pst.setBytes (9, person_image);
                pst.execute();

            JOptionPane.showMessageDialog(null, "Data successful");           
            txtEmail.setText("");
            txtName.setText("");
            txtJumuiya.setText("");
            txtEnterRegNumber.setText("");
            txtPhone.setText("");
            txtRegNumber.setText("");
            txtYear.setText("");
            
            } catch (SQLException m) {
                JOptionPane.showMessageDialog(null,"Dear"+" "+name+" "+"You're Registered\nof committee.");
            }
        
    }
            private String sd;
            private ImageIcon format=null;
            String filename=null;
            int s=0;
            byte[] person_image=null;

}
