
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shantanu
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form UserInfo
     */
    int flag =1;
    public Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PhoneNo = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        MiddleName = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        NationalId = new javax.swing.JTextField();
        BirthCertificateNo = new javax.swing.JTextField();
        PresentAddress = new javax.swing.JTextField();
        PermanentAddress = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        ReferanceId = new javax.swing.JTextField();
        SignUp = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        AccoutType = new javax.swing.JComboBox<>();
        GetInfo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Phone No");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Middle Name");

        jLabel5.setText("DOB");

        jLabel6.setText("National Id");

        jLabel7.setText("Birth Certificate");

        jLabel8.setText("Present Address");

        jLabel9.setText("Permanent Address");

        jLabel10.setText("Password");

        jLabel11.setText("Referance id");

        SignUp.setText("Update");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });

        jTextField1.setText("Account Type");

        AccoutType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Agent" }));

        GetInfo.setText("Get Info");
        GetInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetInfoActionPerformed(evt);
            }
        });

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MiddleName)
                    .addComponent(DOB)
                    .addComponent(NationalId)
                    .addComponent(BirthCertificateNo)
                    .addComponent(PresentAddress)
                    .addComponent(PermanentAddress)
                    .addComponent(Password)
                    .addComponent(ReferanceId)
                    .addComponent(FirstName)
                    .addComponent(LastName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addComponent(AccoutType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addComponent(GetInfo)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(SignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GetInfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(NationalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(BirthCertificateNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(PresentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(PermanentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(ReferanceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccoutType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUp)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        if (flag==0) {
            JOptionPane.showMessageDialog(null, "Please click GetInfo");
        }
        else{
    Connection connection;
    PreparedStatement pst;
    ResultSet result = null, stockResult;
  try {
   
   //connection Establishment
   String username = PhoneNo.getText(); 
   connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MFS","sa","ra123456");
   pst=connection.prepareStatement("UPDATE UserInfo SET FirstName = ? , LastName = ?, MiddleName = ? ,DateOfBirth = ? ,NationalId = ? ,BirthCertificate = ? , PresentAddress= ? ,PremanentAddress = ? ,PasswordNo = ? ,ReferenceId = ? where PhoneNo ="+username);
  
   
   pst.setString(1, FirstName.getText());
   pst.setString(2, LastName.getText());
   pst.setString(3, MiddleName.getText());
   pst.setString(4, DOB.getText());
   pst.setString(5, NationalId.getText());
   pst.setString(6, BirthCertificateNo.getText());
   pst.setString(7, PresentAddress.getText());
   pst.setString(8, PermanentAddress.getText());
   pst.setString(9, Password.getText());
   pst.setString(10, ReferanceId.getText());
  
  
  
   pst.executeUpdate();
   JOptionPane.showMessageDialog(null, "Update successful");
   PhoneNo.setText(" ");
   FirstName.setText(" ");
   FirstName.setText(" ");
   LastName.setText(" ");
   MiddleName.setText(" ");
   DOB.setText(" ");
   NationalId.setText(" ");
   BirthCertificateNo.setText(" ");
   PresentAddress.setText(" ");
   PermanentAddress.setText(" ");
   Password.setText(" ");
   ReferanceId.setText(" ");
;
  }catch(SQLException e) {
      e.printStackTrace();
   JOptionPane.showMessageDialog(null, "Update not successful");
  } 
        }
        
    }//GEN-LAST:event_SignUpActionPerformed

    private void GetInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetInfoActionPerformed
        // TODO add your handling code here:
    Connection connection;
        PreparedStatement pst;
        ResultSet result = null, stockResult;
        String username = PhoneNo.getText();
        System.out.println(username);
        
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MFS", "sa", "ra123456");
            pst = connection.prepareStatement("SELECT * FROM UserInfo where PhoneNo = " +Variables.PhoneNo);
            result = pst.executeQuery();
            while(result.next()){
               FirstName.setText(result.getString("FirstName"));
               LastName.setText(result.getString("LastName"));
               MiddleName.setText(result.getString("MiddleName"));
               DOB.setText(result.getString("DateOfBirth"));
               NationalId.setText(result.getString("NationalId"));
               BirthCertificateNo.setText(result.getString("BirthCertificate"));
               PresentAddress.setText(result.getString("PresentAddress"));
               PermanentAddress.setText(result.getString("PremanentAddress"));
               Password.setText(result.getString("PasswordNo"));
               ReferanceId.setText(result.getString("ReferenceId"));
               flag=0;
            }
            
           
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }//GEN-LAST:event_GetInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Account_Info one = new Account_Info();
        one.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccoutType;
    private javax.swing.JTextField BirthCertificateNo;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField FirstName;
    private javax.swing.JButton GetInfo;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField MiddleName;
    private javax.swing.JTextField NationalId;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField PermanentAddress;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JTextField PresentAddress;
    private javax.swing.JTextField ReferanceId;
    private javax.swing.JButton SignUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
