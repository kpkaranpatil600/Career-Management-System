/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.CareerServiceEnterprise;

import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class CareerServiceAdminWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    
    /**
     * Creates new form CareerServiceAdminUI
     */
    public CareerServiceAdminWorkArea(JPanel workArea, EcoSystem ecosystem,Enterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        
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
        jLabel1 = new javax.swing.JLabel();
        btnManageOrganisation = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageUserAccount = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.cyan);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Career Service Admin Enterprise");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel1)
                .addContainerGap(607, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, -1));

        btnManageOrganisation.setBackground(java.awt.Color.gray);
        btnManageOrganisation.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnManageOrganisation.setText("Organization");
        btnManageOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganisationActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageOrganisation, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 370, 53));

        btnManageEmployee.setBackground(java.awt.Color.gray);
        btnManageEmployee.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnManageEmployee.setText("Organization's Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 370, 50));

        btnManageUserAccount.setBackground(java.awt.Color.gray);
        btnManageUserAccount.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnManageUserAccount.setText("User Account");
        btnManageUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 370, 52));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganisationActionPerformed
        // TODO add your handling code here:
        ManageCSEOrganization manageOrganization = new ManageCSEOrganization(workArea, enterprise.getOrganizationDirectory());
        workArea.add("ManageOrganization", manageOrganization);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageOrganisationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        ManageCSEEmployee manageOrganizationEmployee = new ManageCSEEmployee(workArea, enterprise.getOrganizationDirectory());
        workArea.add("ManageEmployee", manageOrganizationEmployee);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserAccountActionPerformed
        // TODO add your handling code here:
        ManageCSEUserAccount manageUserAccount = new ManageCSEUserAccount(workArea, enterprise);
        workArea.add("ManageUserAccount", manageUserAccount);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageUserAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganisation;
    private javax.swing.JButton btnManageUserAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
