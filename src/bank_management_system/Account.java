package bank_management_system;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import java.util.Random;

public class Account extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
PreparedStatement pstBal;
PreparedStatement pBal;
Random rand;
int randAcc = 0;
String sex = "";

    public Account() {
        this.setTitle("Create Account");
        initComponents();
         conn = javaconnect.ConnectrDb();
        rand = new Random();
        randAcc = rand.nextInt(9999) + 1000;
        txtField_Acc.setText(String.valueOf(randAcc));
        /*
        ButtonGroup btnG = new ButtonGroup();
        btnG.add(rb_Male);
        btnG.add(rb_Female);
        */
        this.setLocationRelativeTo(null);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtField_No = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtField_Name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbBox_AccType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        rb_Female = new javax.swing.JRadioButton();
        txtField_Caste = new javax.swing.JTextField();
        txtField_Add = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtField_Answer = new javax.swing.JTextField();
        cmbBox_nationality = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        rb_Male = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtField_Acc = new javax.swing.JTextField();
        txtField_MICR = new javax.swing.JTextField();
        txtField_Pin = new javax.swing.JTextField();
        txtField_Balance = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmb_SecQ = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\uriel\\Downloads\\Bank Icons\\LovBank.png")); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3), "Create New Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 102, 0))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nationality:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Gender:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pin:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("MICR no.");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Account Type:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Date of Birth:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Security A:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Account no.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Address:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Security Q:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Name:");

        cmbBox_AccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Saving", "Current" }));
        cmbBox_AccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_AccTypeActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\uriel\\Downloads\\Bank Icons\\createicon.png")); // NOI18N
        jButton1.setText("Create");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rb_Female.setText("Female");
        rb_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_FemaleActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Mobile:");

        cmbBox_nationality.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbBox_nationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "English(American)", "English(United Kingdom)", "Filipino", "Hindu", "Islam", "Japanese", "Korean", "Chinese", "Australian", "Arabic", "Russian", "Mexican", "France", "Germanian", "Egyptian", "Vietnamese", "Columnbian", " " }));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\uriel\\Downloads\\Bank Icons\\Clearicon.png")); // NOI18N
        jButton3.setText("Clear");

        rb_Male.setText("Male");
        rb_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_MaleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Caste:");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\uriel\\Downloads\\Bank Icons\\backicon.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtField_Acc.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Balance:");

        cmb_SecQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's Your Pet's name?", "What is your Father's Name?", "Where are You From?", "Who is Your First Best Friend?", "Who's Your First Lover?", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtField_Add)
                                    .addComponent(cmbBox_AccType, 0, 219, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rb_Male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rb_Female))
                                    .addComponent(txtField_Acc)
                                    .addComponent(txtField_MICR)
                                    .addComponent(txtField_Pin)
                                    .addComponent(txtField_Balance))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtField_Answer, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtField_No, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtField_Caste, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbBox_nationality, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtField_Name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_SecQ, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField_Acc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(txtField_MICR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(cmbBox_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtField_Pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbBox_AccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtField_Caste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(rb_Male)
                        .addComponent(rb_Female)
                        .addComponent(txtField_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtField_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(cmb_SecQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField_Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtField_Balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 51));
        jLabel15.setText("Thanks For Creating Account for Us!");
        jLabel15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel15KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 909, 725);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel15KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15KeyTyped

    private void cmbBox_AccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_AccTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBox_AccTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Authentication().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int prompt = JOptionPane.showConfirmDialog(this, "Are you sure you want to submit?", "Confirmation", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if (prompt == JOptionPane.YES_OPTION)
        {
            String sql1 = "INSERT INTO account VALUES(?, ?, ?, ?, ? ,? ,? ,? ,? ,? ,? ,? ,?, ?)";
            String sql2 = "INSERT INTO balances VALUES(?, ?, ?, ?)";
            String sql3 ="INSERT INTO personalbalance(Name)VALUES(?)";
            String phoneText = txtField_No.getText();
            String micrText = txtField_MICR.getText();
            String pinText = txtField_Pin.getText();
            String balText = txtField_Balance.getText();

            try
            {   
                int phoneNum = Integer.valueOf(phoneText);
                int MICR = Integer.parseInt(micrText);
                int Pin= Integer.parseInt(pinText);
                int Balance = Integer.parseInt(balText);
                
                pst = conn.prepareStatement(sql1);
                pst.setString(1, String.valueOf(randAcc));
                pst.setString(2, txtField_Name.getText());
                pst.setString(3, String.valueOf(date.getDate()));
                pst.setInt(4, Pin);
                pst.setString(5, cmbBox_AccType.getSelectedItem().toString());
                pst.setString(6, cmbBox_nationality.getSelectedItem().toString());
                pst.setString(7, txtField_Caste.getText());
                pst.setInt(8, MICR);
                pst.setString(9, sex);
                pst.setInt(10, phoneNum);
                pst.setString(11, txtField_Add.getText());
                pst.setString(12, cmb_SecQ.getSelectedItem().toString());
                pst.setString(13, txtField_Answer.getText());
                pst.setInt(14, Balance);
                
                pstBal = conn.prepareStatement(sql2);
                pstBal.setString(1, txtField_Name.getText());
                pstBal.setInt(2, Integer.parseInt(txtField_Acc.getText()));
                pstBal.setInt(3, Integer.parseInt(txtField_MICR.getText()));
                pstBal.setInt(4, Integer.parseInt(txtField_Balance.getText()));
                
                pBal = conn.prepareStatement(sql3);
                pBal.setString(1, txtField_Name.getText());
                
                pst.executeUpdate();
                pstBal.executeUpdate();
                pBal.executeUpdate();
                
                conn.close();
                pst.close();
                pstBal.close();
                pBal.close();
                JOptionPane.showMessageDialog(this, "Account Created Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Authentication().setVisible(true);
            } catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rb_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_MaleActionPerformed
        if (rb_Male.isSelected())
        {
            rb_Female.setSelected(false);
            sex = "Male";
        }
    }//GEN-LAST:event_rb_MaleActionPerformed

    private void rb_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_FemaleActionPerformed
        if (rb_Female.isSelected())
        {
            rb_Male.setSelected(false);
            sex = "Female";
        }
    }//GEN-LAST:event_rb_FemaleActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBox_AccType;
    private javax.swing.JComboBox<String> cmbBox_nationality;
    private javax.swing.JComboBox<String> cmb_SecQ;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rb_Female;
    private javax.swing.JRadioButton rb_Male;
    private javax.swing.JTextField txtField_Acc;
    private javax.swing.JTextField txtField_Add;
    private javax.swing.JTextField txtField_Answer;
    private javax.swing.JTextField txtField_Balance;
    private javax.swing.JTextField txtField_Caste;
    private javax.swing.JTextField txtField_MICR;
    private javax.swing.JTextField txtField_Name;
    private javax.swing.JTextField txtField_No;
    private javax.swing.JTextField txtField_Pin;
    // End of variables declaration//GEN-END:variables

}
