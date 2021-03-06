/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.GlobalCommunityEnterprise;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount; 
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author Karan
 */
public class GlobalCommunityAdminWorkArea extends javax.swing.JPanel {
    private JPanel workArea;
    private EcoSystem ESystem;
    private Enterprise enterprise;
    private Organization org;
    private UserAccount UserAccount;
    /**
     * Creates new form GlobalCommunityAdminWorkArea
     */
    public GlobalCommunityAdminWorkArea(JPanel workArea,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.workArea = workArea;
        this.ESystem = ESystem;
        this.enterprise = enterprise;
        this.UserAccount = UserAccount;
        this.org = org;
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
        mngUserAccountBtn = new javax.swing.JButton();
        mngEmployeeBtn = new javax.swing.JButton();
        mngOrganisationBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Global Community Enterprise");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(312, 312, 312))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, -1));

        mngUserAccountBtn.setBackground(java.awt.Color.gray);
        mngUserAccountBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mngUserAccountBtn.setText("User Account");
        mngUserAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngUserAccountBtnActionPerformed(evt);
            }
        });
        add(mngUserAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 241, 52));

        mngEmployeeBtn.setBackground(java.awt.Color.gray);
        mngEmployeeBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mngEmployeeBtn.setText("Organization Employee");
        mngEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngEmployeeBtnActionPerformed(evt);
            }
        });
        add(mngEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 241, 54));

        mngOrganisationBtn.setBackground(java.awt.Color.gray);
        mngOrganisationBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mngOrganisationBtn.setText("Organization");
        mngOrganisationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngOrganisationBtnActionPerformed(evt);
            }
        });
        add(mngOrganisationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 241, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void mngUserAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngUserAccountBtnActionPerformed
        // TODO add your handling code here:
        ManageGCUserAccount mng = new ManageGCUserAccount(workArea, enterprise);
        workArea.add("ManageUserAccount", mng);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_mngUserAccountBtnActionPerformed

    private void mngEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngEmployeeBtnActionPerformed
        // TODO add your handling code here:
        ManageGCOrganizationEmployee mng = new ManageGCOrganizationEmployee(workArea, enterprise.getOrganizationDirectory());
        workArea.add("ManageEmployee", mng);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_mngEmployeeBtnActionPerformed

    private void mngOrganisationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngOrganisationBtnActionPerformed
        // TODO add your handling code here:
        ManageGCOrganization mng = new ManageGCOrganization(workArea, enterprise.getOrganizationDirectory());
        workArea.add("ManageOrganization", mng);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_mngOrganisationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mngEmployeeBtn;
    private javax.swing.JButton mngOrganisationBtn;
    private javax.swing.JButton mngUserAccountBtn;
    // End of variables declaration//GEN-END:variables
}

