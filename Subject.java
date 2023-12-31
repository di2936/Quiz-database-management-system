/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Div
 */
public class Subject extends javax.swing.JFrame {
    private DBConnection db = new DBConnection();
public String Login;
    /**
     * Creates new form SUBJECT
     */
    public Subject() {
        initComponents();
    }
     public Subject(String Login1) {
        initComponents();
        Login=Login1;
        login.setText(Login1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelsubject = new javax.swing.JPanel();
        sub_code = new javax.swing.JTextField();
        subject = new javax.swing.JLabel();
        sub_name = new javax.swing.JTextField();
        subcode = new javax.swing.JLabel();
        subname = new javax.swing.JLabel();
        submit3 = new javax.swing.JButton();
        login_id = new javax.swing.JLabel();
        login = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelsubject.setBackground(new java.awt.Color(255, 204, 255));

        subject.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        subject.setForeground(new java.awt.Color(51, 51, 255));
        subject.setText("SUBJECT");

        sub_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_nameActionPerformed(evt);
            }
        });

        subcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subcode.setForeground(new java.awt.Color(0, 51, 255));
        subcode.setText("Sub_code :");

        subname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        subname.setForeground(new java.awt.Color(0, 51, 255));
        subname.setText("Sub_name :");

        submit3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit3.setForeground(new java.awt.Color(0, 51, 255));
        submit3.setText("SUBMIT");
        submit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit3ActionPerformed(evt);
            }
        });

        login_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login_id.setForeground(new java.awt.Color(0, 51, 255));
        login_id.setText("login_id :");

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelsubjectLayout = new javax.swing.GroupLayout(jPanelsubject);
        jPanelsubject.setLayout(jPanelsubjectLayout);
        jPanelsubjectLayout.setHorizontalGroup(
            jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsubjectLayout.createSequentialGroup()
                .addGroup(jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelsubjectLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(subject))
                    .addGroup(jPanelsubjectLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(submit3))
                    .addGroup(jPanelsubjectLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelsubjectLayout.createSequentialGroup()
                                .addComponent(login_id, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelsubjectLayout.createSequentialGroup()
                                    .addComponent(subname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sub_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelsubjectLayout.createSequentialGroup()
                                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(sub_code, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanelsubjectLayout.setVerticalGroup(
            jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsubjectLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(subject)
                .addGap(37, 37, 37)
                .addGroup(jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sub_code, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelsubjectLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(subname))
                    .addGroup(jPanelsubjectLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelsubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_id))
                .addGap(12, 12, 12)
                .addComponent(submit3)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelsubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit3ActionPerformed
        // TODO add your handling code here:
         ResultSet s;
        
    
        String Sub_code=sub_code.getText();
        String Sub_name=sub_name.getText();
        String login_id = login.getText();
        try{
            
          
          String sql=("select * from subject where sub_code='"+Sub_code+"' and Sub_name='"+Sub_name+"' and login_id='"+login_id+"'");
          PreparedStatement p = db.getConnection().prepareStatement(sql);
//            st.setString(1,User);
//            st.setString(2,pass);
            s = p.executeQuery(sql);
            
            if(s.next())
            {
                System.out.println("submitted");
                JOptionPane.showMessageDialog(null,"Successful submit");
                setVisible(false);
                AdminPage ap = new AdminPage();
                ap.setVisible(true);
            }
             
          else{
                System.out.println("submit Failed");
               JOptionPane.showMessageDialog(null,"Submit Failed");
                  }
            db.close();
        }
     
        catch (SQLException ex) {
               java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
               System.out.println("Submit Failed");
           }
    }//GEN-LAST:event_submit3ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void sub_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_nameActionPerformed

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
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelsubject;
    private javax.swing.JTextField login;
    private javax.swing.JLabel login_id;
    private javax.swing.JTextField sub_code;
    private javax.swing.JTextField sub_name;
    private javax.swing.JLabel subcode;
    private javax.swing.JLabel subject;
    private javax.swing.JButton submit3;
    private javax.swing.JLabel subname;
    // End of variables declaration//GEN-END:variables
}
