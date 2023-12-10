/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz;


import java.sql.*;
 
import javax.swing.JOptionPane;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;



/**
 *
 * @author Div
 */
public class Exam extends javax.swing.JFrame {
     private DBConnection db = new DBConnection();

public String User;
    
  //java.util.Date date;
   //ava.sql.Date sqlDate;
    public String q_no="0";
    public String answer;
    public int marks=0;
    public int Qid=1;
    public String name;
    
    
    public void answerCheck()
    {
        String studentAnswer="";
        if(jRadioButton1.isSelected())
        {
            studentAnswer = jRadioButton1.getText();
        }
        else if(jRadioButton2.isSelected())
        {
             studentAnswer = jRadioButton2.getText();
        }
         else if(jRadioButton3.isSelected())
        {
             studentAnswer = jRadioButton3.getText();
        }
         else if(jRadioButton4.isSelected())
        {
             studentAnswer = jRadioButton4.getText();
        }
        if(studentAnswer.equals(answer))
        { 
            if(marks<5)
            {
            marks= marks +1 ;
            String marks1 = String.valueOf(marks);
            mark1.setText(marks1);
            }
        }
    
    //question number change
      
      int q_no1=Integer.parseInt(q_no);
       q_no1=q_no1+1;
      q_no=String.valueOf(q_no1);
     //last question hide next button
    if(q_no.equals("5"))
    {
        next.setVisible(false);
    }
    }
    public void question()
            {
        ResultSet s;
        
        try{
             
             String sql = ("select * from question where q_no='"+q_no+"'");
             PreparedStatement p = db.getConnection().prepareStatement(sql);
             s=p.executeQuery();
             while(s.next())
             {
                 qno.setText(s.getString(2));
               questions.setText(s.getString(3));
               jRadioButton1.setText(s.getString(4));
                jRadioButton2.setText(s.getString(5));
                         jRadioButton3.setText(s.getString(6));
                                  jRadioButton4.setText(s.getString(7));
                                    answer=s.getString(8);
                
             }
           }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
            }
    
       
            
    
    /**
     * Creates new form EXAM
     */
    public Exam(String User1) {
        initComponents();
        User=User1;
        jLabel6.setText(User1);
       
            String Qid1 = String.valueOf(Qid);
            jLabel9.setText(Qid1);
                          
          //date
           SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date= new java.util.Date();
        jLabel7.setText(dFormat.format(date));

       //first question and student Details
       ResultSet s;
        
    
        try{
            
            String sql = ("select * from question where q_no='"+q_no+"'");
            PreparedStatement p = db.getConnection().prepareStatement(sql);
            s = p.executeQuery();
          
         
           while(s.next())
           {
           qno.setText(s.getString(2));
           questions.setText(s.getString(3));
           jRadioButton1.setText(s.getString(4));
           jRadioButton2.setText(s.getString(5));
           jRadioButton3.setText(s.getString(6));
           jRadioButton4.setText(s.getString(7));
           answer=s.getString(8);
           
           }
           ResultSet s1;
           
           String sql1 = ("select * from students where user_id='"+User+"'");
           PreparedStatement p1 = db.getConnection().prepareStatement(sql1);
            s1 = p1.executeQuery();
           while(s1.next())
           {
             jLabel11.setText(s1.getString(3));  
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
               
                   
                
    }
    public void submit()
    {
         
       
       SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date= new java.util.Date();
    answerCheck();
     
        
    
        try{
            
           String sql = ("insert into takes values(?,?,?,?,?)");         
            PreparedStatement pst = db.getConnection().prepareStatement(sql);
             String marks1 = String.valueOf(marks);
             String name=jLabel11.getText();
            pst.setInt(2, marks);
            pst.setString(1,dFormat.format(date));
            pst.setString(3, User);
            pst.setInt(4, Qid);
            pst.setString(5, name);
            pst.executeUpdate();
           
            
            new SuccessfullySubmitted(marks1).setVisible(true);
          
                }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EXAM = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        totalq = new javax.swing.JLabel();
        totalquestions = new javax.swing.JLabel();
        mar = new javax.swing.JLabel();
        mark1 = new javax.swing.JLabel();
        qno = new javax.swing.JLabel();
        tquestions = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        questions = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EXAM.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        EXAM.setText("QUIZ EXAM");
        getContentPane().add(EXAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 290, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 730, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ADMIN.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        totalq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalq.setText("TotalQuestions:");

        totalquestions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalquestions.setText("q_no:");

        mar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mar.setText("Your marks:");

        mark1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mark1.setText("00");

        qno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qno.setText("00");

        tquestions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tquestions.setText("5");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("User_id:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Quiz_id:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Name:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(totalq, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(totalquestions, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tquestions, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(mar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalq)
                    .addComponent(tquestions))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qno)
                    .addComponent(totalquestions))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mar)
                    .addComponent(mark1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 250, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        questions.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        questions.setText("Question Demo?");
        jPanel2.add(questions, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        next.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Next.png"))); // NOI18N
        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel2.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 379, -1, 30));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("date_of_quiz_taken:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Total time:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("5 Mins");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to submit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            answerCheck();
            submit();
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
          jRadioButton2.setSelected(false);
          jRadioButton3.setSelected(false);
          jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question();
    }//GEN-LAST:event_nextActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected())
        {
            jRadioButton3.setSelected(false);
          jRadioButton4.setSelected(false);
          jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
          if(jRadioButton3.isSelected())
        {
            jRadioButton2.setSelected(false);
          jRadioButton4.setSelected(false);
          jRadioButton1.setSelected(false);
        }
        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton4.isSelected())
        {
          jRadioButton1.setSelected(false);
          jRadioButton2.setSelected(false);
          jRadioButton3.setSelected(false);
        }
        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SuccessfullySubmitted(User).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EXAM;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mar;
    private javax.swing.JLabel mark1;
    private javax.swing.JButton next;
    private javax.swing.JLabel qno;
    private javax.swing.JLabel questions;
    private javax.swing.JButton submit;
    private javax.swing.JLabel totalq;
    private javax.swing.JLabel totalquestions;
    private javax.swing.JLabel tquestions;
    // End of variables declaration//GEN-END:variables
}
