
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shantanu
 */
public class UserInfo extends javax.swing.JFrame {

    /**
     * Creates new form UserInfo
     */
    public UserInfo() {
        initComponents();
          Toolkit tk=Toolkit.getDefaultToolkit();
        int x=900;
        int y=700;
        this.setSize(x,y);
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
        NationalId = new javax.swing.JTextField();
        BirthCertificateNo = new javax.swing.JTextField();
        PresentAddress = new javax.swing.JTextField();
        PermanentAddress = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        ReferanceId = new javax.swing.JTextField();
        SignUp = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        AccoutType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Phone No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 160, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 46, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 96, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Middle Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 180, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("DOB");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 190, 140, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("National Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 226, 180, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Birth Certificate");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 280, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Present Address");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 330, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Permanent Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 380, 180, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Password");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 420, 170, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Referance id");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 452, 190, 30);

        PhoneNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PhoneNo);
        PhoneNo.setBounds(245, 13, 380, 28);

        FirstName.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        getContentPane().add(FirstName);
        FirstName.setBounds(250, 50, 380, 30);

        LastName.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        getContentPane().add(LastName);
        LastName.setBounds(250, 92, 380, 30);

        MiddleName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(MiddleName);
        MiddleName.setBounds(250, 142, 380, 30);

        NationalId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(NationalId);
        NationalId.setBounds(250, 230, 380, 30);

        BirthCertificateNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(BirthCertificateNo);
        BirthCertificateNo.setBounds(250, 280, 380, 30);

        PresentAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PresentAddress);
        PresentAddress.setBounds(250, 330, 380, 30);

        PermanentAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(PermanentAddress);
        PermanentAddress.setBounds(250, 372, 380, 30);

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Password);
        Password.setBounds(250, 410, 380, 28);

        ReferanceId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(ReferanceId);
        ReferanceId.setBounds(250, 450, 380, 28);

        SignUp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp);
        SignUp.setBounds(130, 560, 230, 50);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText("Account Type");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 500, 180, 28);

        AccoutType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AccoutType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Agent" }));
        getContentPane().add(AccoutType);
        AccoutType.setBounds(250, 500, 380, 28);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(641, 560, 200, 50);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(250, 190, 150, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        
    Connection connection;
    PreparedStatement pst;
    
    ResultSet result = null, stockResult;
   
        
  try {
   
   //connection Establishment
   connection=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MFS","sa","ra123456");
   pst=connection.prepareStatement("insert into UserInfo values(?,?,?,?,?,?,?,?,?,?,?,?)");
   pst.setInt(1,Integer.parseInt(PhoneNo.getText()));
   int phone = Integer.parseInt(PhoneNo.getText());
   pst.setString(2, FirstName.getText());
   pst.setString(3, LastName.getText());
   pst.setString(4, MiddleName.getText());
   SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
   String date = dcn.format(jDateChooser1.getDate() );
   pst.setString(5, date);
   pst.setString(6, NationalId.getText());
   pst.setString(7, BirthCertificateNo.getText());
   pst.setString(8, PresentAddress.getText());
   pst.setString(9, PermanentAddress.getText());
   pst.setString(10, Password.getText());
   pst.setString(11, ReferanceId.getText());
   String value=(String)AccoutType.getSelectedItem();
   
   
   if(value.equals("User"))
   {
     pst.setInt(12,1); 
   }
   else{
        pst.setInt(12,2);
   }
   pst.executeUpdate();
   
   PhoneNo.setText(" ");
   FirstName.setText(" ");
   FirstName.setText(" ");
   LastName.setText(" ");
   MiddleName.setText(" ");
  
   NationalId.setText(" ");
   BirthCertificateNo.setText(" ");
   PresentAddress.setText(" ");
   PermanentAddress.setText(" ");
   Password.setText(" ");
   ReferanceId.setText(" ");
   pst = connection.prepareStatement("SELECT * FROM UserInfo where PhoneNo = " +phone);
   result = pst.executeQuery();
      while (result.next()) {
            int UserId= result.getInt("UserId");
            System.out.println(UserId);
             pst=connection.prepareStatement("insert into BlanceTable values(?,?)");
             pst.setInt(1,UserId);
             pst.setInt(2,0);
             pst.executeUpdate();
          
      }
      
      JOptionPane.showMessageDialog(null, "Registration successful");
      Login_Signup one =new Login_Signup();
      one.setVisible(true);
      dispose();
   

  }
  catch(SQLException e) {
   JOptionPane.showMessageDialog(null, "Registration not successful");
  } 
        
    }//GEN-LAST:event_SignUpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login_Signup one =new Login_Signup();
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
    private javax.swing.JTextField FirstName;
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
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
