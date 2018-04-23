/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class StudentDetail extends javax.swing.JFrame {

    String FNAME,LNAME,AGE,MOBILE,DIVISION;
    
    public StudentDetail(String ROLL_NO) throws SQLException {
        
        initComponents();
        
        setLocation(450,250);
        
        disableAll();
        
        setVisible(true);
        /*Image img=new ImageIcon(this.getClass().getResource("/student_icon.png")).getImage();
        icon.setIcon((Icon) img);
        */
        
        
        databaseFetchValue(ROLL_NO);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        division = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        rollNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("First Name");

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Last Name");

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Division");

        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Mobile");

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Age");

        fName.setForeground(new java.awt.Color(0, 102, 204));

        lName.setForeground(new java.awt.Color(0, 102, 204));

        mobile.setForeground(new java.awt.Color(0, 102, 204));

        division.setForeground(new java.awt.Color(0, 102, 204));
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        age.setForeground(new java.awt.Color(0, 102, 204));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(0, 102, 204));
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(0, 102, 204));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 102, 204));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Roll No");

        rollNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rollNo.setForeground(new java.awt.Color(0, 102, 204));
        rollNo.setText("47");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rollNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(division, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(delete)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(save)
                    .addComponent(delete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divisionActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        enableAll();
        
    }//GEN-LAST:event_editActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
        if(changeAvailable())
        {
        
            updateData();
        
        }
        else
        {
        
        JOptionPane.showMessageDialog(null,"Data Are Same","No Changes Found ",JOptionPane.INFORMATION_MESSAGE);
        
        }
           
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here
        
        int ans=JOptionPane.showConfirmDialog(null,"Are You Sure?","Want to delete record",JOptionPane.YES_NO_OPTION);
        
        if(ans==JOptionPane.YES_OPTION)
        {

            try {
              
                Connection con=DBConnection.connection();
                Statement st=con.createStatement();

                String SQL="DELETE FROM STUDENT_DETAIL WHERE ROLL_NO = '"+rollNo.getText()+"'";                 
                boolean result=st.execute(SQL);
                
                if(!result)
                {
                JOptionPane.showMessageDialog(null, "Record Deleted","Successful",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                
                ViewRecords view=new ViewRecords();
                
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Record Deletion Fail","Unsuccessful",JOptionPane.ERROR_MESSAGE);
                }                
            } catch (SQLException ex) {
                Logger.getLogger(StudentDetail.class.getName()).log(Level.SEVERE, null, ex);
            }
                

                
               
                
  
                
        }
      
    }//GEN-LAST:event_deleteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton delete;
    private javax.swing.JTextField division;
    private javax.swing.JButton edit;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField mobile;
    private javax.swing.JLabel rollNo;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

    private void databaseFetchValue(String ROLL_NO) throws SQLException {
        
        
       Connection con=DBConnection.connection();
       
       Statement statement=con.createStatement();
       String sql="SELECT * FROM STUDENT_DETAIL WHERE ROLL_NO = '"+ROLL_NO+"'";
       ResultSet result=statement.executeQuery(sql);
       
       result.next();
       
      FNAME=result.getString("FIRST_NAME");
      LNAME=result.getString("LAST_NAME");
      MOBILE=result.getString("MOBILE");
      DIVISION=result.getString("DIVISION");
      AGE=result.getString("AGE");
      rollNo.setText(ROLL_NO);
      fName.setText(FNAME);
      lName.setText(LNAME);
      mobile.setText(MOBILE);
      division.setText(DIVISION);
      age.setText(AGE);
      
    }

    private boolean changeAvailable() {
        
        String newFname=fName.getText();
        String newLname=lName.getText();
        String newMobile=mobile.getText();
        String newDivision=division.getText();
        String newAge=age.getText();
        
        if(!FNAME.equals(newFname))
            return true;
     
        if(!LNAME.equals(newLname))
            return true;
        if(!MOBILE.equals(newMobile))
            return true;
     
        if(!DIVISION.equals(newDivision))
            return true;
    
        if(!AGE.equals(newAge))
            return true;
        
        return false;
     
    }
    

    private void updateData()  {
        
        try {
            Connection con=DBConnection.connection();
            
            String sql="UPDATE STUDENT_DETAIL SET FIRST_NAME=? , LAST_NAME=?, MOBILE=?, DIVISION=?, AGE=? WHERE ROLL_NO='"+rollNo.getText()+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, fName.getText());
            ps.setString(2, lName.getText());
            ps.setDouble(3, Double.parseDouble(mobile.getText()));
            ps.setString(4,division.getText());
            ps.setInt(5, Integer.parseInt(age.getText()));
            
            boolean result=ps.execute();
            
            if(!result)
            {
            disableAll();
            JOptionPane.showMessageDialog(null, "Record Updated", "Successful", JOptionPane.PLAIN_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(null, "Record Updation Failed", "Fail", JOptionPane.ERROR_MESSAGE);
       
        } catch (SQLException ex) {
            Logger.getLogger(StudentDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void disableAll() {
        
        fName.setEditable(false);
        lName.setEditable(false);
        mobile.setEditable(false);
        division.setEditable(false);
        age.setEditable(false);
    }
    
    private void enableAll()
    {
        fName.setEditable(true);
        lName.setEditable(true);
        mobile.setEditable(true);
        age.setEditable(true);
        division.setEditable(true);
    }
}
