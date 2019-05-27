
package catholic_action;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class MainMenu1 extends javax.swing.JFrame {

   
    public MainMenu1() {
        initComponents();
        
       //  Component add = this.jDesktopPane1.add(new SendSMS());
        // eventHandler();
        UIManager UI = new UIManager();
        UI.put("OptionPane.messageFont", new FontUIResource(new Font("Trebuchet MS", 1, 15)));
        UI.put("OptionPane.background", new ColorUIResource(153,153,255));
        UI.put("Panel.background", new ColorUIResource(Color.white));
        UI.put("OptionPane.foreground",new ColorUIResource(Color.white));
        UI.put("DateChooser.background", new ColorUIResource(102, 142, 0));
       
//        MainMenu mm= new MainMenu();
//        mm.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
//    private void eventHandler(){
//    
//    jMennuSendSms.addActionListener((d)->{
//      //  changeView (new SendSMS());
//    });
//           
//    }
  private void changeView(JDesktopPane d){
      this.jDesktopPane1.removeAll();
      this.jDesktopPane1.add(d);
      this.jDesktopPane1.revalidate();
      this.jDesktopPane1.repaint();
  
  
  }
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        showTotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        showCurrentTime = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        viewCurrentUser = new javax.swing.JLabel();
        showDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem11 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem13 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("catholic_action/Bundle"); // NOI18N
        jMenuItem7.setText(bundle.getString("MainMenu1.jMenuItem7.text")); // NOI18N

        jMenuItem9.setText(bundle.getString("MainMenu1.jMenuItem9.text")); // NOI18N

        jMenuItem12.setText(bundle.getString("MainMenu1.jMenuItem12.text")); // NOI18N

        jMenuItem13.setText(bundle.getString("MainMenu1.jMenuItem13.text")); // NOI18N

        jMenuItem4.setText(bundle.getString("MainMenu1.jMenuItem4.text")); // NOI18N

        jMenuItem23.setText(bundle.getString("MainMenu1.jMenuItem23.text")); // NOI18N

        jMenuItem24.setText(bundle.getString("MainMenu1.jMenuItem24.text")); // NOI18N

        jMenuItem26.setText(bundle.getString("MainMenu1.jMenuItem26.text")); // NOI18N

        jMenuItem28.setText(bundle.getString("MainMenu1.jMenuItem28.text")); // NOI18N

        jMenuItem32.setText(bundle.getString("MainMenu1.jMenuItem32.text")); // NOI18N

        jMenuItem33.setText(bundle.getString("MainMenu1.jMenuItem33.text")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/argentina_flag_flying_animation.gif"))); // NOI18N
        jLabel10.setText(bundle.getString("MainMenu1.jLabel10.text")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Wide Latin", 3, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText(bundle.getString("MainMenu1.jLabel13.text")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Wide Latin", 3, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText(bundle.getString("MainMenu1.jLabel14.text")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 255));
        jLabel15.setText(bundle.getString("MainMenu1.jLabel15.text")); // NOI18N

        jLabel16.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 255));
        jLabel16.setText(bundle.getString("MainMenu1.jLabel16.text")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/caLOGO#.png"))); // NOI18N
        jLabel8.setText(bundle.getString("MainMenu1.jLabel8.text")); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/kisiii3.png"))); // NOI18N
        jLabel18.setText(bundle.getString("MainMenu1.jLabel18.text")); // NOI18N

        jLabel20.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 153, 255));
        jLabel20.setText(bundle.getString("MainMenu1.jLabel20.text")); // NOI18N

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        showTotal.setBackground(new java.awt.Color(255, 255, 255));
        showTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        showTotal.setForeground(new java.awt.Color(102, 153, 255));
        showTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showTotal.setText(bundle.getString("MainMenu1.showTotal.text")); // NOI18N

        jDesktopPane1.setLayer(showTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(527, Short.MAX_VALUE)
                .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(showTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(jLabel16)
                                .addGap(48, 48, 48)))
                        .addComponent(jLabel10)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDesktopPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 49, 1233, 640));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText(bundle.getString("MainMenu1.jLabel7.text")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/hi_tech_radio_welcome_animation_clipart.gif"))); // NOI18N
        jLabel11.setText(bundle.getString("MainMenu1.jLabel11.text")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 2, -1, 45));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/clock-48.png"))); // NOI18N
        jLabel17.setText(bundle.getString("MainMenu1.jLabel17.text")); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 6, 56, 37));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));

        showCurrentTime.setBackground(new java.awt.Color(0, 0, 0));
        showCurrentTime.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        showCurrentTime.setForeground(new java.awt.Color(0, 255, 0));
        showCurrentTime.setText(bundle.getString("MainMenu1.showCurrentTime.text")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(showCurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showCurrentTime, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 6, -1, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 51), 1, true));

        viewCurrentUser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewCurrentUser.setForeground(new java.awt.Color(51, 255, 0));
        viewCurrentUser.setText(bundle.getString("MainMenu1.viewCurrentUser.text")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(viewCurrentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(viewCurrentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 6, -1, -1));

        showDate.setText(bundle.getString("MainMenu1.showDate.text")); // NOI18N
        jPanel1.add(showDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 13, 164, 16));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255), 2), bundle.getString("MainMenu1.jPanel2.border.title"), javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/customers_customer_user_male-64.png"))); // NOI18N
        jLabel1.setText(bundle.getString("MainMenu1.jLabel1.text")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/boss-64.png"))); // NOI18N
        jLabel2.setText(bundle.getString("MainMenu1.jLabel2.text")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/social_network-64.png"))); // NOI18N
        jLabel3.setText(bundle.getString("MainMenu1.jLabel3.text")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/sync_reload_refresh_arrow-64.png"))); // NOI18N
        jLabel4.setText(bundle.getString("MainMenu1.jLabel4.text")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Delete_user-64.png"))); // NOI18N
        jLabel5.setText(bundle.getString("MainMenu1.jLabel5.text")); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 102));
        jButton1.setText(bundle.getString("MainMenu1.jButton1.text")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 102));
        jButton2.setText(bundle.getString("MainMenu1.jButton2.text")); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 102));
        jButton3.setText(bundle.getString("MainMenu1.jButton3.text")); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 102));
        jButton4.setText(bundle.getString("MainMenu1.jButton4.text")); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 102));
        jButton5.setText(bundle.getString("MainMenu1.jButton5.text")); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/kenya_flag_animation_image.gif"))); // NOI18N
        jLabel9.setText(bundle.getString("MainMenu1.jLabel9.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jButton2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));

        jMenu1.setBackground(new java.awt.Color(51, 51, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jMenu1.setForeground(new java.awt.Color(255, 255, 102));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Admin_30px.png"))); // NOI18N
        jMenu1.setText(bundle.getString("MainMenu1.jMenu1.text")); // NOI18N
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jRadioButtonMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem6.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jRadioButtonMenuItem6.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem6.text")); // NOI18N
        jRadioButtonMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Lock_30px.png"))); // NOI18N
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem6);

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jCheckBoxMenuItem1.setForeground(new java.awt.Color(102, 102, 255));
        jCheckBoxMenuItem1.setText(bundle.getString("MainMenu1.jCheckBoxMenuItem1.text")); // NOI18N
        jCheckBoxMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Key_30px_1.png"))); // NOI18N
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jRadioButtonMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButtonMenuItem4.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem4.text")); // NOI18N
        jRadioButtonMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Shutdown_30px.png"))); // NOI18N
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(51, 51, 255));
        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jMenu2.setForeground(new java.awt.Color(255, 255, 51));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/People_30px.png"))); // NOI18N
        jMenu2.setText(bundle.getString("MainMenu1.jMenu2.text")); // NOI18N
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenu3.setForeground(new java.awt.Color(102, 102, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Add User Group Woman Man_25px.png"))); // NOI18N
        jMenu3.setText(bundle.getString("MainMenu1.jMenu3.text")); // NOI18N
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jRadioButtonMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonMenuItem8.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem8.setSelected(true);
        jRadioButtonMenuItem8.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem8.text")); // NOI18N
        jRadioButtonMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Admin_25px.png"))); // NOI18N
        jRadioButtonMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem8);

        jRadioButtonMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonMenuItem7.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem7.setSelected(true);
        jRadioButtonMenuItem7.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem7.text")); // NOI18N
        jRadioButtonMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Add User Male_25px.png"))); // NOI18N
        jRadioButtonMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem7);

        jRadioButtonMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonMenuItem1.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem1.text")); // NOI18N
        jRadioButtonMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Online Support_25px.png"))); // NOI18N
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonMenuItem2.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem2.text")); // NOI18N
        jRadioButtonMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Paste As Text_25px_1.png"))); // NOI18N
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonMenuItem3.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem3.text")); // NOI18N
        jRadioButtonMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Report Card_25px.png"))); // NOI18N
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem3);

        jCheckBoxMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxMenuItem3.setForeground(new java.awt.Color(102, 102, 255));
        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText(bundle.getString("MainMenu1.jCheckBoxMenuItem3.text")); // NOI18N
        jCheckBoxMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Children_25px.png"))); // NOI18N
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem3);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem20.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Online_25px_1.png"))); // NOI18N
        jMenuItem20.setText(bundle.getString("MainMenu1.jMenuItem20.text")); // NOI18N
        jMenuItem20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem20);

        jMenu11.setForeground(new java.awt.Color(51, 51, 255));
        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Info Squared_25px.png"))); // NOI18N
        jMenu11.setText(bundle.getString("MainMenu1.jMenu11.text")); // NOI18N
        jMenu11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem18.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Paste As Text_25px_1.png"))); // NOI18N
        jMenuItem18.setText(bundle.getString("MainMenu1.jMenuItem18.text")); // NOI18N
        jMenuItem18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem19.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Bill_25px_1.png"))); // NOI18N
        jMenuItem19.setText(bundle.getString("MainMenu1.jMenuItem19.text")); // NOI18N
        jMenuItem19.setActionCommand(bundle.getString("MainMenu1.jMenuItem19.actionCommand")); // NOI18N
        jMenuItem19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem19);

        jMenuItem27.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem27.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Add User Group Woman Man_25px.png"))); // NOI18N
        jMenuItem27.setText(bundle.getString("MainMenu1.jMenuItem27.text")); // NOI18N
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem27);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem29.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem29.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Online_25px_1.png"))); // NOI18N
        jMenuItem29.setText(bundle.getString("MainMenu1.jMenuItem29.text")); // NOI18N
        jMenu11.add(jMenuItem29);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem30.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Help_25px.png"))); // NOI18N
        jMenuItem30.setText(bundle.getString("MainMenu1.jMenuItem30.text")); // NOI18N
        jMenu11.add(jMenuItem30);

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem31.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem31.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Online_25px_1.png"))); // NOI18N
        jMenuItem31.setText(bundle.getString("MainMenu1.jMenuItem31.text")); // NOI18N
        jMenu11.add(jMenuItem31);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem34.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Online Support_25px.png"))); // NOI18N
        jMenuItem34.setText(bundle.getString("MainMenu1.jMenuItem34.text")); // NOI18N
        jMenu11.add(jMenuItem34);

        jMenu3.add(jMenu11);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        jMenu5.setBackground(new java.awt.Color(51, 51, 255));
        jMenu5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jMenu5.setForeground(new java.awt.Color(255, 255, 51));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Sort By Recently Viewed_38px_1.png"))); // NOI18N
        jMenu5.setText(bundle.getString("MainMenu1.jMenu5.text")); // NOI18N
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenu8.setForeground(new java.awt.Color(102, 102, 255));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Edit Profile_30px.png"))); // NOI18N
        jMenu8.setText(bundle.getString("MainMenu1.jMenu8.text_1")); // NOI18N
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Add User Male_25px.png"))); // NOI18N
        jMenuItem1.setText(bundle.getString("MainMenu1.jMenuItem1.text")); // NOI18N
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Add User Group Woman Man_25px.png"))); // NOI18N
        jMenuItem2.setText(bundle.getString("MainMenu1.jMenuItem2.text")); // NOI18N
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Copy_25px.png"))); // NOI18N
        jMenuItem3.setText(bundle.getString("MainMenu1.jMenuItem3.text")); // NOI18N
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenu5.add(jMenu8);

        jMenuBar1.add(jMenu5);

        jMenu7.setBackground(new java.awt.Color(51, 51, 255));
        jMenu7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jMenu7.setForeground(new java.awt.Color(255, 255, 51));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Cathedral_30px.png"))); // NOI18N
        jMenu7.setText(bundle.getString("MainMenu1.jMenu7.text_1")); // NOI18N
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Children_25px.png"))); // NOI18N
        jMenuItem8.setText(bundle.getString("MainMenu1.jMenuItem8.text")); // NOI18N
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Navigation Toolbar Left_25px_1.png"))); // NOI18N
        jMenuItem10.setText(bundle.getString("MainMenu1.jMenuItem10.text")); // NOI18N
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Pharmacist_25px.png"))); // NOI18N
        jMenuItem11.setText(bundle.getString("MainMenu1.jMenuItem11.text")); // NOI18N
        jMenuItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem14.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Sort Left_25px.png"))); // NOI18N
        jMenuItem14.setText(bundle.getString("MainMenu1.jMenuItem14.text")); // NOI18N
        jMenuItem14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem15.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Bill_25px_1.png"))); // NOI18N
        jMenuItem15.setText(bundle.getString("MainMenu1.jMenuItem15.text")); // NOI18N
        jMenuItem15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem21.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Children_25px.png"))); // NOI18N
        jMenuItem21.setText(bundle.getString("MainMenu1.jMenuItem21.text")); // NOI18N
        jMenuItem21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenuBar1.add(jMenu7);

        jMenu6.setBackground(new java.awt.Color(51, 51, 255));
        jMenu6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jMenu6.setForeground(new java.awt.Color(255, 255, 51));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Manager_30px.png"))); // NOI18N
        jMenu6.setText(bundle.getString("MainMenu1.jMenu6.text")); // NOI18N
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonMenuItem5.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem5.text")); // NOI18N
        jRadioButtonMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Edit Profile_30px.png"))); // NOI18N
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jRadioButtonMenuItem5);

        jRadioButtonMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jRadioButtonMenuItem11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonMenuItem11.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem11.setSelected(true);
        jRadioButtonMenuItem11.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem11.text")); // NOI18N
        jRadioButtonMenuItem11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Copy_25px.png"))); // NOI18N
        jRadioButtonMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jRadioButtonMenuItem11);

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem17.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Open_25px.png"))); // NOI18N
        jMenuItem17.setText(bundle.getString("MainMenu1.jMenuItem17.text")); // NOI18N
        jMenuItem17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem22.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Admin_25px.png"))); // NOI18N
        jMenuItem22.setText(bundle.getString("MainMenu1.jMenuItem22.text")); // NOI18N
        jMenuItem22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem22);

        jMenuBar1.add(jMenu6);

        jMenu9.setBackground(new java.awt.Color(51, 51, 255));
        jMenu9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102), 2));
        jMenu9.setForeground(new java.awt.Color(255, 255, 102));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/About_25px_1.png"))); // NOI18N
        jMenu9.setText(bundle.getString("MainMenu1.jMenu9.text")); // NOI18N
        jMenu9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jCheckBoxMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxMenuItem7.setForeground(new java.awt.Color(102, 102, 255));
        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText(bundle.getString("MainMenu1.jCheckBoxMenuItem7.text")); // NOI18N
        jCheckBoxMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/icons8_Holy_Bible_25px_1.png"))); // NOI18N
        jMenu9.add(jCheckBoxMenuItem7);

        jRadioButtonMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.META_MASK));
        jRadioButtonMenuItem13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jRadioButtonMenuItem13.setForeground(new java.awt.Color(102, 102, 255));
        jRadioButtonMenuItem13.setSelected(true);
        jRadioButtonMenuItem13.setText(bundle.getString("MainMenu1.jRadioButtonMenuItem13.text")); // NOI18N
        jRadioButtonMenuItem13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/About_25px_1.png"))); // NOI18N
        jRadioButtonMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jRadioButtonMenuItem13);

        jMenuBar1.add(jMenu9);

        jMenu4.setBackground(new java.awt.Color(51, 51, 255));
        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153), 2));
        jMenu4.setForeground(new java.awt.Color(255, 255, 51));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/Services_30px.png"))); // NOI18N
        jMenu4.setText(bundle.getString("MainMenu1.jMenu4.text")); // NOI18N
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenu10.setForeground(new java.awt.Color(0, 0, 204));
        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/icons8_Maintenance_25px_1.png"))); // NOI18N
        jMenu10.setText(bundle.getString("MainMenu1.jMenu10.text")); // NOI18N
        jMenu10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem25.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Documents Folder_25px.png"))); // NOI18N
        jMenuItem25.setText(bundle.getString("MainMenu1.jMenuItem25.text")); // NOI18N
        jMenuItem25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem25);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attatchments/emailService.png"))); // NOI18N
        jMenuItem5.setText(bundle.getString("MainMenu1.jMenuItem5.text")); // NOI18N
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Open_25px.png"))); // NOI18N
        jMenuItem6.setText(bundle.getString("MainMenu1.jMenuItem6.text")); // NOI18N
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem6);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem16.setForeground(new java.awt.Color(102, 102, 255));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIcons/Help_25px.png"))); // NOI18N
        jMenuItem16.setText(bundle.getString("MainMenu1.jMenuItem16.text")); // NOI18N
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem16);

        jMenu4.add(jMenu10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                 MainMenu1.showTotal.setText("Total Registered Members:"+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("church_members_records")));
                   //MainMenu.n.setText("Total Registered Members:"+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("nmcs")));
                  timer();
                //  Date d= new Date();
                  SimpleDateFormat sd= new SimpleDateFormat("yyy-MM-dd");
                //  showDate.setText(sd.format(d));
                  
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Register rf= new Register();
        jDesktopPane1.add(rf);
        rf.show();
       // rf.setBounds(1000, 1000, 1000, 1000);
       
        
//            Dimension desktopSize = jDesktopPane1.getSize();
//            Dimension jInternalFrameSize = ca.getSize();
//            ca.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
//            (desktopSize.height- jInternalFrameSize.height)/2);
//            jDesktopPane1.add(ca);
           
//               jInternalFrame1= new JInternalFrame();
//               jInternalFrame1.setBackground(SystemColor.activeCaptionBorder);
//               ca.add(jInternalFrame1, BorderLayout.CENTER);
//               ca.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ExecutiveRegistration re= new ExecutiveRegistration();
       jDesktopPane1.add(re);
       re.show();
      // re.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
       Update_Members_Records up= new Update_Members_Records();
        jDesktopPane1.add(up);
        up.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Delete_MEmbers_Records dl= new Delete_MEmbers_Records();
       jDesktopPane1.add(dl);
       dl.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
        AccountCreationForm ca= new AccountCreationForm();
        jDesktopPane1.add(ca);
        ca.show();
       
      
      //  ca.setVisible(true);
       // this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
      Login lh= new Login();
      jDesktopPane1.add(lh);
      lh.show();
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        
        Register_churchChoir ch= new Register_churchChoir();
        jDesktopPane1.add(ch);
        ch.show();
       
     //   this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
       register_alterServer as= new register_alterServer();
      jDesktopPane1.add(as);
      as.show();
      // this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
       RegisterNMCS nm= new RegisterNMCS();
       jDesktopPane1.add(nm);
       nm.show();
       
     //  this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
       RegisterFriendsOfAmbassoder am= new RegisterFriendsOfAmbassoder();
       jDesktopPane1.add(am);
       am.show();
      
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
       DisplayExecutiveList ex= new DisplayExecutiveList();
       jDesktopPane1.add(ex);
       ex.show();
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void jRadioButtonMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem11ActionPerformed
       DisplayJumuiyaListLeaders dj= new DisplayJumuiyaListLeaders();
       jDesktopPane1.add(dj);
       dj.show();
      
    }//GEN-LAST:event_jRadioButtonMenuItem11ActionPerformed

    private void jRadioButtonMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem13ActionPerformed
       AboutMe collyne= new AboutMe();
       collyne.setVisible(true);
      // this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        AllMembersRecords all= new AllMembersRecords();
        all.setVisible(true);
        all.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       DisplayJumuiyas sj= new DisplayJumuiyas();
       jDesktopPane1.add(sj);
       sj.show();
      
      // this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        DisplayAccordingToYears sy= new DisplayAccordingToYears();
        jDesktopPane1.add(sy);
        sy.show();
        
       // this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Display_CGA_CLA sgl= new Display_CGA_CLA();
        jDesktopPane1.add(sgl);
        sgl.show();
      
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       DisplayChoirRecord cr= new DisplayChoirRecord();
       jDesktopPane1.add(cr);
       cr.show();
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        display_Alter_ServersList al = new display_Alter_ServersList();
        jDesktopPane1.add(al);
        al.show();
       
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       Display_NMCS nm= new Display_NMCS();
       jDesktopPane1.add(nm);
       nm.show();
       
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jRadioButtonMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem7ActionPerformed
       
       JumuiyaLeadersRegistration rj= new JumuiyaLeadersRegistration();
        jDesktopPane1.add(rj);
        rj.show();
       
    }//GEN-LAST:event_jRadioButtonMenuItem7ActionPerformed

    private void jRadioButtonMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem8ActionPerformed
                 ExecutiveRegistration re= new ExecutiveRegistration();
                    jDesktopPane1.add(re);
                   re.show();
    }//GEN-LAST:event_jRadioButtonMenuItem8ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
       
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      Display_FriendsOfAmbassadors fr= new Display_FriendsOfAmbassadors();
      jDesktopPane1.add(fr);
      fr.show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
      
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
          int close;
            close=  JOptionPane.showConfirmDialog(null,"Are you sure you want to Logout?","System Close",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
      
            if(close==JOptionPane.YES_NO_OPTION){
                Login l= new Login();
                l.setVisible(true);
                this.dispose();
                
           // System.exit(0);
            //JOptionPane.showMessageDialog(this, "You are Logged out");
                }
            else{
                }
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        JOptionPane.showMessageDialog(this,"Need any Help? Contact System Administrator.\nCall or Watsap 07-(903)-(668)-48!");
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        HarambeeCommitteeRegister hc= new HarambeeCommitteeRegister();
        jDesktopPane1.add(hc);
        hc.show();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        DisplayHarambeeCommittee dh= new DisplayHarambeeCommittee();
        jDesktopPane1.add(dh);
        dh.show();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
       DancersRegistration dr= new DancersRegistration();
       jDesktopPane1.add(dr);
       dr.show();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        DisplayChurchDancers dd =new DisplayChurchDancers();
        jDesktopPane1.add(dd);
        dd.show();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
       executiveProfile ex= new executiveProfile();
       ex.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        FileManager f= new FileManager();
        jDesktopPane1.add(f);
        f.show();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      
       ReportsGenerator rp= new ReportsGenerator();
       jDesktopPane1.add(rp);
       rp.show();
////
//            JasperReport jr = JasperCompileManager.compileReport(ur17);
//            JasperPrint jp = JasperFillManager.fillReport(jr, null, connn);
//            JasperViewer.viewReport(jp);
//            InputStream path = this.getClass().getResourse("/catholic_action/report1.jrxml");
//            // compiles jrxml
//            JasperCompileManager.compileReportToFile(reportName + ".jrxml");
//            // fills compiled report with parameters and a connection
//            JasperPrint print = JasperFillManager.fillReport(reportName + ".jasper", null, connn);
//            // exports report to pdf
//            JRExporter exporter = new JRPdfExporter();
//            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
//            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream(reportName + ".pdf")); // your output goes here
//
//            exporter.exportReport();
        
        
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
       RegisterGetTogether gt= new RegisterGetTogether();
       jDesktopPane1.add(gt);
       this.show();
       this.setVisible(true);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       MainUI t= new MainUI();
       t.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem11;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem13;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem8;
    private javax.swing.JLabel showCurrentTime;
    private javax.swing.JLabel showDate;
    public static javax.swing.JLabel showTotal;
    public static javax.swing.JLabel viewCurrentUser;
    // End of variables declaration//GEN-END:variables

public void timer(){

     Thread clock= new Thread(){
         public void run(){
         
         for(;;){
          Calendar cal = new GregorianCalendar();
          SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss a");
           showCurrentTime.setText(sdf.format(cal.getTime()));
         
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

}
