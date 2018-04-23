/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class InsertRecord extends javax.swing.JFrame {
    
    
    String rollNo;
    String fName;
    String lName;
    String mobile;
    String age;
    String div=null;
    

    
    public InsertRecord() {
        
        setLocation(450,250);
        setVisible(true);
        
        initComponents();

        listDiv.addItem("Select Division");        
        listDiv.addItem("A");
        listDiv.addItem("B");
        listDiv.addItem("C");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfMobile = new javax.swing.JTextField();
        tfFName = new javax.swing.JTextField();
        tfLName = new javax.swing.JTextField();
        listDiv = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tfRollNo = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Last Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Mobile Number");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Div");

        tfMobile.setForeground(new java.awt.Color(0, 102, 204));
        tfMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMobileActionPerformed(evt);
            }
        });

        tfFName.setForeground(new java.awt.Color(0, 102, 204));
        tfFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFNameActionPerformed(evt);
            }
        });

        tfLName.setForeground(new java.awt.Color(0, 102, 204));
        tfLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLNameActionPerformed(evt);
            }
        });

        listDiv.setForeground(new java.awt.Color(0, 102, 204));
        listDiv.setModel(new javax.swing.DefaultComboBoxModel<>());
        listDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDivActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Roll No");

        tfRollNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tfRollNo.setForeground(new java.awt.Color(0, 102, 204));
        tfRollNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRollNoActionPerformed(evt);
            }
        });

        insert.setBackground(new java.awt.Color(0, 102, 204));
        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(255, 255, 255));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Age");

        tfAge.setForeground(new java.awt.Color(0, 102, 204));
        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("School Management");

        home.setBackground(new java.awt.Color(0, 102, 204));
        home.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        view.setBackground(new java.awt.Color(0, 102, 204));
        view.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home)
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(view)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfMobile)
                                .addComponent(tfLName, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(tfFName, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(listDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(home)
                    .addComponent(view))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMobileActionPerformed

    private void tfFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFNameActionPerformed

    private void tfLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLNameActionPerformed

    private void tfRollNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRollNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRollNoActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here
        
        Connection con=null;
        PreparedStatement ps;
        ResultSet result=null;
        Statement statement=null;
        
        
        rollNo=tfRollNo.getText();
        fName=tfFName.getText();
        lName=tfLName.getText();
        mobile=tfMobile.getText();
        age=tfAge.getText();
        
        if(validateData())
        {
        
            try {
                
                //Creating Database Connection
                
                con=DBConnection.connection();
                
                System.out.println("Connected");
               
                
                //Creating table if not exits
                
                String sql="CREATE TABLE IF NOT EXISTS STUDENT_DETAIL(ROLL_NO INT PRIMARY KEY, FIRST_NAME CHAR(20),LAST_NAME CHAR(20),MOBILE BIGINT(10),DIVISION CHAR(5),AGE INT)";
 
                
                statement=con.createStatement();
                boolean b=statement.execute(sql);
                
                
               String value="INSERT INTO STUDENT_DETAIL VALUES(?,?,?,?,?,?)";           
               ps=con.prepareStatement(value);
               
               ps.setInt(1,Integer.parseInt(rollNo));
               ps.setString(2,fName);
               ps.setString(3, lName);
               ps.setDouble(4, Double.parseDouble(mobile));
               ps.setString(5, div);
               ps.setInt(6,Integer.parseInt(age));
             
               boolean res=ps.execute();
               
               if(!res)                   
                   JOptionPane.showMessageDialog(null, "Record Inserted","Successful",JOptionPane.PLAIN_MESSAGE);
               
               else
               {
                   JOptionPane.showMessageDialog(null, "Record Fail To Insert ","Fail",JOptionPane.ERROR_MESSAGE);
               }
              
            
            } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, "Record Already Inserted ","Fail",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_insertActionPerformed

    private void listDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDivActionPerformed

        if(listDiv.getSelectedIndex()>0)
        {
            div=(String) listDiv.getSelectedItem();
            System.out.println(div);
        }
    }//GEN-LAST:event_listDivActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
 
    }//GEN-LAST:event_tfAgeActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        dispose();
        ViewRecords view=new ViewRecords();
        
    }//GEN-LAST:event_viewActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        
        dispose();
        Home school=new Home();
    }//GEN-LAST:event_homeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> listDiv;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfFName;
    private javax.swing.JTextField tfLName;
    private javax.swing.JTextField tfMobile;
    private javax.swing.JTextField tfRollNo;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

    private boolean validateData() {
        
        
       /* rollNo=tfRollNo.getText();
        fName=tfFName.getText();
        lName=tfLName.getText();
        mobile=tfMobile.getText();
        age=tfAge.getText();
     */
       
       if(rollNo.isEmpty())
       {
       JOptionPane.showMessageDialog(this, "Enter Roll No", "Field Required",JOptionPane.ERROR_MESSAGE);
       return false;
       }
       
       if(fName.isEmpty())
       {
       JOptionPane.showMessageDialog(this, "Enter First Name", "Field Required",JOptionPane.ERROR_MESSAGE);
       return false;
       }

       if(lName.isEmpty())
       {
       JOptionPane.showMessageDialog(this, "Enter Last Name", "Field Required",JOptionPane.ERROR_MESSAGE);
       return false;
       }
       
       if(mobile.isEmpty())
       {
       JOptionPane.showMessageDialog(this, "Enter Mobile Number", "Field Required",JOptionPane.ERROR_MESSAGE);
       return false;
       }
       
       else if(mobile.length()<10)
       {
       JOptionPane.showMessageDialog(this, "Enter 10 Digit Mobile Number", "Field Required",JOptionPane.ERROR_MESSAGE);
       return false;       
       }
       
       if(div==null)
       {
       JOptionPane.showMessageDialog(this, "Select Division", "Field Required",JOptionPane.ERROR_MESSAGE);
       return false;
       
       }
       
       if(age.isEmpty())
       {
       JOptionPane.showMessageDialog(this, "Enter Age", "Field Required",JOptionPane.ERROR_MESSAGE);
       return false;
       }
       
       return true;
    }
}
