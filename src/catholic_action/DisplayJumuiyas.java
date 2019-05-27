
package catholic_action;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class DisplayJumuiyas extends javax.swing.JInternalFrame {
        Connection conn=null;
        ResultSet rs= null;
        Statement st= null;
        PreparedStatement pst=null;
    /**
     * Creates new form DisplayJumuiyas
     */
    public DisplayJumuiyas() {
        initComponents();
         DisplayJumuiyas.peters.setText("St.Peters="+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("church_members_records WHERE Jumuiya='ST.PETERS' AND Year_Of_Study !='Associate'")));
         tableFilter();
          DisplayJumuiyas.charles.setText("St.Charles="+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("church_members_records WHERE Jumuiya='ST.CHARLES' AND Year_Of_Study !='Associate'")));
          tableFilter();
           DisplayJumuiyas.bridgets.setText("St.Bridgets="+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("church_members_records WHERE Jumuiya='ST.BRIDGITS' AND Year_Of_Study !='Associate'")));
           tableFilter();
            DisplayJumuiyas.holyFamily.setText("HolyFamily="+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("church_members_records WHERE Jumuiya='HOLY FAMILY' AND Year_Of_Study !='Associate'")));
            tableFilter();
             DisplayJumuiyas.thomas.setText("St.Thomas="+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("church_members_records WHERE Jumuiya='ST.Thomas Aquinas' AND Year_Of_Study !='Associate'")));
             tableFilter();
              DisplayJumuiyas.stephenes.setText("St.Stephenes="+Integer.toString(COUNT_TOTAL_NUMBER.countRegisteredMembers("church_members_records WHERE Jumuiya='ST.STEPHENES' AND Year_Of_Study !='Associate'")));
              tableFilter();
    }
    public void toExcel(JTable student_details, File file){
		try{
			TableModel model = student_details.getModel();
			FileWriter excel = new FileWriter(file);

			for(int i = 0; i < model.getColumnCount(); i++){
				excel.write(model.getColumnName(i) + "\t");
			}

			excel.write("\n");

			for(int i=0; i< model.getRowCount(); i++) {
				for(int j=0; j < model.getColumnCount(); j++) {
					excel.write(model.getValueAt(i,j).toString()+"\t");
				}
				excel.write("\n");
			}

			excel.close();
		}catch(IOException e){ 
                   // System.out.println(e);
                }}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSortjumuiya = new javax.swing.JTable();
        comboSort = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        peters = new javax.swing.JButton();
        charles = new javax.swing.JButton();
        stephenes = new javax.swing.JButton();
        thomas = new javax.swing.JButton();
        holyFamily = new javax.swing.JButton();
        bridgets = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Jumuiyas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        TableSortjumuiya.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        TableSortjumuiya.setForeground(new java.awt.Color(51, 0, 51));
        TableSortjumuiya.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "RegNo.", "Phone", "Jumuiya", "Year"
            }
        ));
        jScrollPane1.setViewportView(TableSortjumuiya);

        comboSort.setBackground(new java.awt.Color(255, 255, 153));
        comboSort.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        comboSort.setForeground(new java.awt.Color(153, 153, 255));
        comboSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select Jumuiya---", "St.Peters", "St.Charles", "St.Bridgits", "Holy Family", "St.Thomas Aquinas", "St.Stephenes" }));
        comboSort.setToolTipText("Select Group to Sort!");
        comboSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSortActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Print_30px_1.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.setToolTipText("Print Records");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myImages/Microsoft Excel_30px.png"))); // NOI18N
        jButton2.setText("Convert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        peters.setBackground(new java.awt.Color(0, 0, 153));
        peters.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        peters.setForeground(new java.awt.Color(255, 255, 255));

        charles.setBackground(new java.awt.Color(255, 102, 0));
        charles.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        charles.setForeground(new java.awt.Color(255, 255, 255));

        stephenes.setBackground(new java.awt.Color(255, 255, 102));
        stephenes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        stephenes.setForeground(new java.awt.Color(51, 51, 255));

        thomas.setBackground(new java.awt.Color(255, 0, 0));
        thomas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        thomas.setForeground(new java.awt.Color(255, 255, 255));

        holyFamily.setBackground(new java.awt.Color(51, 153, 255));
        holyFamily.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        holyFamily.setForeground(new java.awt.Color(255, 255, 255));

        bridgets.setBackground(new java.awt.Color(102, 255, 102));
        bridgets.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        bridgets.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bridgets, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(charles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(peters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(holyFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stephenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(comboSort, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(peters, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(charles, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bridgets, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(holyFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thomas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stephenes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSortActionPerformed

     tableFilter();
    }//GEN-LAST:event_comboSortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            MessageFormat header=new MessageFormat("JUMUIYA LIST");
            MessageFormat footer=new MessageFormat("Page {0,number,integer}");
            TableSortjumuiya.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %%n",e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String header[] = {"Id","Name","RegNo.","Phone","Jumuiya","Year"};

        String data[][] = null;
        DefaultTableModel model = new DefaultTableModel(data, header);

        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(DisplayJumuiyas.this);
        if(option == JFileChooser.APPROVE_OPTION){
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();

            int len = filename.length();
            String ext = "";
            String file = "";

            if(len > 4){
                ext = filename.substring(len-4, len);
            }

            if(ext.equals(".xls")){
                file = path + "\\" + filename; 
            }else{ 
                file = path + "\\" + filename + ".xls"; 
            }
            toExcel(TableSortjumuiya, new File(file));
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableSortjumuiya;
    public static javax.swing.JButton bridgets;
    public static javax.swing.JButton charles;
    private javax.swing.JComboBox comboSort;
    public static javax.swing.JButton holyFamily;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton peters;
    public static javax.swing.JButton stephenes;
    public static javax.swing.JButton thomas;
    // End of variables declaration//GEN-END:variables
        public void tableFilter(){
           DefaultTableModel model=(DefaultTableModel)TableSortjumuiya.getModel();
        model.setRowCount(0);

            Connect connect= new Connect();
            conn= connect.connect();
            try{
                int count=1;
            String sql="SELECT * FROM church_members_records WHERE Jumuiya='"+comboSort.getSelectedItem()+"' ORDER BY Year_Of_Study ASC";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            model=(DefaultTableModel)TableSortjumuiya.getModel();
            while (rs.next()){

                // model.setRowCount(model.getRowCount()+1);
                int id=count;
                String fn=rs.getString("Name");
               // String ln=rs.getString("Last_Name");
                String reg=rs.getString("Reg_Number");
                String phn=rs.getString("Phone_Number");
                String jmy=rs.getString("Jumuiya");
                String yos=rs.getString("Year_Of_Study");

                model.addRow(new Object[]{id,fn,reg,phn,jmy,yos});
                count=count+1;
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"NO RECORDS FOUND"+e.getLocalizedMessage());
        }
        
        }
        
//         try{
//             Connect connect= new Connect();
//            conn= connect.connect();
//            
//            InputStream ur17 = getClass().getResourceAsStream("/catholic_action/St.Thomas.jrxml");
//
//            JasperDesign dis = JRXmlLoader.load(ur17);
//            
//            JasperReport jr = JasperCompileManager.compileReport(dis);
//            
////            String reportPath="E:\\FlashDisk\\CATHOLIC_ACTION\\src\\catholic_action\\St.Thomas.jrxml";     
////                JasperReport jr= JasperCompileManager.compileReport(reportPath);
////                JRDataSource jry= new JREmptyDataSource();
//                JasperPrint jp=JasperFillManager.fillReport(jr, null,conn);
//               
//                
//                
////                JasperExportManager.exportReportToPdfFile(jp,"E:\\FlashDisk\\CATHOLIC_ACTION\\test.pdf");
//                JasperViewer.viewReport(jp);
//        }catch(Exception e){
//        JOptionPane.showMessageDialog(this, e);
//        }

}
