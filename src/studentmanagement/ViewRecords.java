/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class ViewRecords extends javax.swing.JFrame {

    /**
     * Creates new form ViewRecords
     */
    public ViewRecords() {
        
        setLocation(450,250);
        setVisible(true);
        initComponents();
        
        getAllData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        divisionList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        surnameList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Division");

        divisionList.setForeground(new java.awt.Color(0, 102, 204));
        divisionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Division", "A", "B", "C" }));
        divisionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionListActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        nameField.setForeground(new java.awt.Color(0, 153, 204));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 102, 204));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAll.setBackground(new java.awt.Color(0, 102, 204));
        btnAll.setForeground(new java.awt.Color(255, 255, 255));
        btnAll.setText("All");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        insert.setBackground(new java.awt.Color(0, 102, 255));
        insert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(255, 255, 255));
        insert.setText("Add New");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tableData.setBackground(new java.awt.Color(0, 102, 255));
        tableData.setForeground(new java.awt.Color(255, 255, 255));
        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableData);

        jLabel1.setText("Surname");

        surnameList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Letter ", "A", "B", "C","D","E","F","G","H","I","J","K",
            "L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}));
surnameList.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        surnameListActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(surnameList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(17, 17, 17)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(divisionList, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(6, 6, 6))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(divisionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSearch)
                .addComponent(btnAll)
                .addComponent(jLabel1)
                .addComponent(surnameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(insert)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        // TODO add your handling code here:
        
        getAllData();        
        
        
        
    }//GEN-LAST:event_btnAllActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void divisionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionListActionPerformed
        // TODO add your handling code here:
        
        
        if(divisionList.getSelectedIndex()>0)
        {
        String div= (String) divisionList.getSelectedItem();
        
        
        Connection con=null;
        PreparedStatement statement;
        ResultSet result;
        
        try {
            con=DBConnection.connection();
            
            String sql="SELECT * FROM STUDENT_DETAIL WHERE DIVISION = ?";
            statement=con.prepareStatement(sql);
            statement.setString(1, div);
            result=statement.executeQuery();
            
            tableData.setModel(DbUtils.resultSetToTableModel(result));
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewRecords.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    }//GEN-LAST:event_divisionListActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String name=nameField.getText();
        
        if(name.isEmpty())
        {
        JOptionPane.showMessageDialog(null,"Enter Search Field", "Search Empty",JOptionPane.ERROR_MESSAGE);
        return;
        }
        Connection con=null;
       PreparedStatement statement;
        ResultSet result;
        
        try {
            con=DBConnection.connection();
            
            String sql="SELECT * FROM STUDENT_DETAIL WHERE FIRST_NAME= ?";
            
            statement=con.prepareStatement(sql);
            statement.setString(1,name);
            result=statement.executeQuery();
            
            tableData.setModel(DbUtils.resultSetToTableModel(result));
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewRecords.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        // TODO add your handling code here:
        
        int row=tableData.getSelectedRow();
        
        String ROLL_NO=tableData.getModel().getValueAt(row, 0).toString();
        System.out.println(ROLL_NO);
        
        dispose();
        try {
            StudentDetail std=new StudentDetail(ROLL_NO);
        } catch (SQLException ex) {
            Logger.getLogger(ViewRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_tableDataMouseClicked

    private void surnameListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameListActionPerformed
        // TODO add your handling code here:
 
      if(surnameList.getSelectedIndex()>0){
                          
        String letter=(String) surnameList.getSelectedItem();
        

          try {
                      Connection con=DBConnection.connection();
              Statement statement=con.createStatement();
              
              String SQL="SELECT * FROM STUDENT_DETAIL WHERE LAST_NAME LIKE '"+letter+"%'";
              
              ResultSet result=statement.executeQuery(SQL);
              
                tableData.setModel(DbUtils.resultSetToTableModel(result));
              
         
          } catch (SQLException ex) {
              Logger.getLogger(ViewRecords.class.getName()).log(Level.SEVERE, null, ex);
          }               
      }
 
    }//GEN-LAST:event_surnameListActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        dispose();
        
        InsertRecord insert=new InsertRecord();
    }//GEN-LAST:event_insertActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> divisionList;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> surnameList;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables

    private void getAllData() {

        Connection con=null;
        Statement statement;
        ResultSet result;
        
        try {
            con=DBConnection.connection();
            
            String sql="SELECT * FROM STUDENT_DETAIL";
            statement=con.createStatement();
            result=statement.executeQuery(sql);
            
            tableData.setModel(DbUtils.resultSetToTableModel(result));
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewRecords.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}
