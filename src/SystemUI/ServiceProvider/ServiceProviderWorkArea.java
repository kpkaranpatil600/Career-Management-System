/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.ServiceProvider;
 
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.CareerServiceEnterprise.ManageCSEEmployee;
import java.awt.CardLayout;
import javax.swing.JPanel; 

/**
 *
 * @author rohan
 */
public class ServiceProviderWorkArea extends javax.swing.JPanel {
    private JPanel workArea;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form HelpProviderAdminWorkArea
     */
    public ServiceProviderWorkArea(JPanel workArea,Enterprise enterprise) {
        initComponents();
        this.workArea=workArea;
        this.enterprise=enterprise;
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
        jLabel1 = new javax.swing.JLabel();
        manageUserAccountBtn = new javax.swing.JButton();
        manageEmployeeBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Service Provider Organization");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(307, 307, 307))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        manageUserAccountBtn.setBackground(java.awt.Color.gray);
        manageUserAccountBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        manageUserAccountBtn.setText("User Account");
        manageUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountBtnActionPerformed(evt);
            }
        });
        add(manageUserAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 266, 55));

        manageEmployeeBtn.setBackground(java.awt.Color.gray);
        manageEmployeeBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        manageEmployeeBtn.setText("Employee");
        manageEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeBtnActionPerformed(evt);
            }
        });
        add(manageEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 209, 266, 55));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountBtnActionPerformed
        ManagementUserAccount muajp = new ManagementUserAccount(workArea, enterprise);
        workArea.add("HelpProviderManageUserAccount", muajp);

        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_manageUserAccountBtnActionPerformed

    private void manageEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeBtnActionPerformed
        ManageCSEEmployee manageEmployeeJPanel = new ManageCSEEmployee(workArea, enterprise.getOrganizationDirectory());
       workArea.add("GiverManageEmployee", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_manageEmployeeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageEmployeeBtn;
    private javax.swing.JButton manageUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}
