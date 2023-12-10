/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Div
 */
public class DeleteQuestions extends javax.swing.JFrame {
private DBConnection db = new DBConnection();

    /**
     * Creates new form DELETE_QUESTIONS
     */
    public DeleteQuestions() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        deletequestions = new javax.swing.JLabel();
        QNO = new javax.swing.JLabel();
        qstat = new javax.swing.JLabel();
        optionA = new javax.swing.JLabel();
        optionB = new javax.swing.JLabel();
        optionC = new javax.swing.JLabel();
        optionD = new javax.swing.JLabel();
        crct_choice = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        q_stat = new javax.swing.JTextField();
        choiceA = new javax.swing.JTextField();
        choiceB = new javax.swing.JTextField();
        choiceC = new javax.swing.JTextField();
        choiceD = new javax.swing.JTextField();
        crct_answer = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchbutton = new javax.swing.JButton();
        qno = new javax.swing.JTextField();
        quiz_id = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletequestions.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        deletequestions.setText("Delete questions");
        jPanel2.add(deletequestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 490, 60));

        QNO.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        QNO.setText("q_no");
        jPanel2.add(QNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        qstat.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        qstat.setText("q_statement:");
        jPanel2.add(qstat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        optionA.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        optionA.setText("A");
        jPanel2.add(optionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        optionB.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        optionB.setText("B");
        jPanel2.add(optionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        optionC.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        optionC.setText("C");
        jPanel2.add(optionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 10, -1));

        optionD.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        optionD.setText("D");
        jPanel2.add(optionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 20, -1));

        crct_choice.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        crct_choice.setText("crct_choice:");
        jPanel2.add(crct_choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel2.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 110, 40));

        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 369, 100, 40));

        q_stat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        q_stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q_statActionPerformed(evt);
            }
        });
        jPanel2.add(q_stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 510, 30));

        choiceA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(choiceA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 360, -1));

        choiceB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(choiceB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 360, -1));

        choiceC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(choiceC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 360, -1));

        choiceD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        choiceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceDActionPerformed(evt);
            }
        });
        jPanel2.add(choiceD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 360, -1));

        crct_answer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(crct_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 360, -1));

        close.setBackground(new java.awt.Color(255, 204, 102));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compressed_1644052934656.jpeg"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        searchbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 110, 30));

        qno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qnoActionPerformed(evt);
            }
        });
        jPanel2.add(qno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 80, -1));

        quiz_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quiz_id.setText("quiz_id:");
        jPanel2.add(quiz_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 696, 463));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
       
      
        String q_no = qno.getText();
         try{
            
            String sql = ("delete from  question where q_no=?");
             PreparedStatement p = db.getConnection().prepareStatement(sql);
           
            p.setString(1,q_no);
            p.executeUpdate();
          JFrame jf = new JFrame();
          jf.setAlwaysOnTop(true);
          JOptionPane.showMessageDialog(jf,"Successfully Deleted");
          setVisible(false);
          new DeleteQuestions().setVisible(true);
         }
         catch(Exception e)
         {
              JFrame jf = new JFrame();
                  jf.setAlwaysOnTop(true);
                  JOptionPane.showMessageDialog(jf,e);
         }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
         qno.setText("");
         jTextField1.setText("");
         q_stat.setText("");
         choiceA.setText("");
         choiceB.setText("");
         choiceC.setText("");
         choiceD.setText("");
         crct_answer.setText("");
         qno.setEditable(true);
    }//GEN-LAST:event_clearActionPerformed

    private void q_statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q_statActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q_statActionPerformed

    private void choiceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceDActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        AdminPage.open=0;
        setVisible(false);

    }//GEN-LAST:event_closeActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        // TODO add your handling code here:
        ResultSet s;
        
        String q_no = qno.getText();
        try{
          
           
            PreparedStatement pst = db.getConnection().prepareStatement("select* from  question where q_no ='"+q_no+"'",ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_UPDATABLE); 
            s = pst.executeQuery();
            if(s.first())
            {
                jTextField1.setText(s.getString(1));
                q_stat.setText(s.getString(3));
                choiceA.setText(s.getString(4));
                choiceB.setText(s.getString(5));
                choiceC.setText(s.getString(6));
                choiceD.setText(s.getString(7));
                crct_answer.setText(s.getString(8));
                qno.setEditable(false);
            }
            else{
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Question Number does not exist");
            }
        }
        catch(Exception e)
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,e);
        }

    }//GEN-LAST:event_searchbuttonActionPerformed

    private void qnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qnoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QNO;
    private javax.swing.JTextField choiceA;
    private javax.swing.JTextField choiceB;
    private javax.swing.JTextField choiceC;
    private javax.swing.JTextField choiceD;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JTextField crct_answer;
    private javax.swing.JLabel crct_choice;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel deletequestions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel optionA;
    private javax.swing.JLabel optionB;
    private javax.swing.JLabel optionC;
    private javax.swing.JLabel optionD;
    private javax.swing.JTextField q_stat;
    private javax.swing.JTextField qno;
    private javax.swing.JLabel qstat;
    private javax.swing.JLabel quiz_id;
    private javax.swing.JButton searchbutton;
    // End of variables declaration//GEN-END:variables
}