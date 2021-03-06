/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.SystemAdministrator;

import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Location.Location;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class EnterpriseManagement extends javax.swing.JPanel {
private JPanel workArea;
private EcoSystem ecosystem;
    /**
     * Creates new form EnterpriseManagement
     */
    public EnterpriseManagement(JPanel workArea,EcoSystem ecosystem) {
        initComponents();
        this.workArea=workArea;
        this.ecosystem=ecosystem;
        populateEnterpriseTable();
        populateJComboBox();
    }

       private void populateEnterpriseTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseTbl.getModel();

        model.setRowCount(0);
        for (Location network : ecosystem.getLocationList()) 
        {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) 
            {
                Object[] row = new Object[3];
                
                row[0] = enterprise;
                
                row[1] = network.getLocationName();
                
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
    
        private void populateJComboBox() {
                networkJComboBox.removeAllItems();
                enterpriseTypeJComboBox.removeAllItems();

                for (Location network : ecosystem.getLocationList()) 
                {
                    networkJComboBox.addItem(network);
                }

                for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) 
                {
                    enterpriseTypeJComboBox.addItem(type);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        nameTxtField = new javax.swing.JTextField();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        networkJComboBox = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblCheckName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(78);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Enterprise Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel1)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(null);

        enterpriseTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name ", "Location", "Type"
            }
        ));
        jScrollPane1.setViewportView(enterpriseTbl);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(166, 52, 421, 207);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Location :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(188, 315, 93, 17);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Enterprise Type :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(141, 372, 140, 17);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Name :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(226, 425, 55, 19);

        addBtn.setBackground(java.awt.Color.gray);
        addBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn);
        addBtn.setBounds(327, 474, 84, 25);

        deleteBtn.setBackground(java.awt.Color.gray);
        deleteBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn);
        deleteBtn.setBounds(488, 474, 79, 25);

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        nameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtFieldKeyReleased(evt);
            }
        });
        jPanel2.add(nameTxtField);
        nameTxtField.setBounds(327, 415, 240, 30);

        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(enterpriseTypeJComboBox);
        enterpriseTypeJComboBox.setBounds(327, 362, 240, 30);

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(networkJComboBox);
        networkJComboBox.setBounds(327, 305, 240, 30);

        btnBack.setBackground(java.awt.Color.gray);
        btnBack.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);
        btnBack.setBounds(38, 36, 67, 25);
        jPanel2.add(lblCheckName);
        lblCheckName.setBounds(617, 425, 150, 19);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemUI/Icon/healthy-organisation-system.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 960, 550);

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdministrator sysAdminwjp = (SystemAdministrator) component;
        //sysAdminwjp.populateTree();  /// move this code to Refresh button--functionality-> refreshes the data
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
      
            Location network = (Location) networkJComboBox.getSelectedItem();
            Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

            if (network == null || type == null) {
                JOptionPane.showMessageDialog(null, "Invalid Input!");
                return;
            }

            String name = nameTxtField.getText();
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the Enterprise name!");
                return;
            } else {

                Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

                populateEnterpriseTable();
                nameTxtField.setText("");
            }
        

    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow= enterpriseTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            Enterprise p=(Enterprise) enterpriseTbl.getValueAt(selectedRow, 0);

            for (Location network : ecosystem.getLocationList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                    if(p==enterprise){
                        network.getEnterpriseDirectory().getEnterpriseList().remove(p);
                        break;
                    }

                }
            }

            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateEnterpriseTable();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void nameTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtFieldKeyReleased
        // TODO add your handling code here:
        
//        
//        String ValidLocation = "^[A-Za-z\\s]{2,15}$";
//        Pattern pattern = Pattern.compile(ValidLocation);
//        Matcher match = pattern.matcher(nameTxtField.getText());
//
//        if (!match.matches()) {
//            lblCheckName.setText("InValid Input!!!");
//        } else {
//            lblCheckName.setText(null);
//        }
    }//GEN-LAST:event_nameTxtFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable enterpriseTbl;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblCheckName;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox networkJComboBox;
    // End of variables declaration//GEN-END:variables
}
