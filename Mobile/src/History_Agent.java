
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shantanu
 */
public class History_Agent extends javax.swing.JFrame {

    /**
     * Creates new form History
     */
    public History_Agent() {
        initComponents();
         Toolkit tk=Toolkit.getDefaultToolkit();
        int x=1000;
        int y=400;
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 600));
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Send Money", "Payment", "Cash Out", "Mobile Recharge", "Cash In" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(20, 30, 230, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 20, 210, 42);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(657, 490, 200, 41);

        HistoryTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(HistoryTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 840, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Account_Info_Agent one = new Account_Info_Agent();
        one.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Connection connection;
        PreparedStatement pst;
        ResultSet result = null, stockResult;

       try {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MFS", "sa", "ra123456");
            String value = (String) jComboBox1.getSelectedItem();
            if (value.equals("Send Money")) {
                String query = "SELECT SenderId,ReciverId,TrixType,Ammount,TrixDate FROM TrixTable where TrixType='Send_Money' AND UserId="+Variables.UserId;
                pst = connection.prepareStatement(query);
                result = pst.executeQuery();
                HistoryTable.setModel(DbUtils.resultSetToTableModel(result));
            } else if (value.equals("Payment")) {
                String query = "SELECT SenderId,ReciverId,TrixType,Ammount,TrixDate FROM TrixTable where TrixType='Payment'AND UserId="+Variables.UserId;
                pst = connection.prepareStatement(query);
                result = pst.executeQuery();
                HistoryTable.setModel(DbUtils.resultSetToTableModel(result));
            } else if (value.equals("Cash Out")) {
                String query = "SELECT SenderId,ReciverId,TrixType,Ammount,TrixDate FROM TrixTable where TrixType='Cash Out'AND UserId="+Variables.UserId;
                pst = connection.prepareStatement(query);
                result = pst.executeQuery();
                HistoryTable.setModel(DbUtils.resultSetToTableModel(result));
            } else if (value.equals("Mobile Recharge")) {
                String query = "SELECT SenderId,ReciverId,TrixType,Ammount,TrixDate FROM TrixTable where TrixType='Mobile_Recharge'AND UserId="+Variables.UserId;
                pst = connection.prepareStatement(query);
                result = pst.executeQuery();
                HistoryTable.setModel(DbUtils.resultSetToTableModel(result));
            }else if (value.equals("Cash In")) {
                String query = "SELECT SenderId,ReciverId,TrixType,Ammount,TrixDate FROM TrixTable where  ReciverId="+Variables.PhoneNo;
                pst = connection.prepareStatement(query);
                result = pst.executeQuery();
                HistoryTable.setModel(DbUtils.resultSetToTableModel(result));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HistoryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
