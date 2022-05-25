/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.SponsorAdmin;
import SystemModel.ServiceProvider.ServiceProvider;
import SystemModel.EcoSystem;
import SystemModel.Employee.Employee;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.SponsorOrganization;
import SystemModel.Organization.ServiceProviderOrganization;
import SystemModel.Organization.ServiceSeekerOrganization;
import SystemModel.Organization.Organization;
import SystemModel.Role.SponsorRole;
import SystemModel.Role.ServiceProviderRole;
import SystemModel.Role.ServiceSeekerRole;
import SystemModel.Role.Role;
import SystemModel.UserAccount.UserAccount;
import static com.db4o.qlin.QLinSupport.p;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adhar
 */
public class ManageUserAccount extends javax.swing.JPanel {
     private JPanel workArea;
     private Enterprise enterprise;
    /**
     * Creates new form ManageUserAccount
     */
    public ManageUserAccount(JPanel workArea,Enterprise enterprise) {
        initComponents();
        this.workArea=workArea;
        this.enterprise=enterprise;
        
        populateOrganizationJComboBox();
        populateData();
    }

    
    
    public void populateOrganizationJComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof SponsorOrganization)
            organizationJComboBox.addItem(organization);
            
        }
    }

    
    public void populateEmployeeJComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateEmployeeRoleJComboBox(Enterprise e){
        EmployeeRoleJComboBox.removeAllItems();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if(organization instanceof SponsorOrganization){
       // for (Role role : e.getSupportedRole()){
            EmployeeRoleJComboBox.addItem(new SponsorRole());
        
        }
       
       // }
    }
    
    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                row[0] = ua;
                row[1] = ua.getRole();
                row[2] = ua.getPassword();
                ((DefaultTableModel) userTable.getModel()).addRow(row);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        EmployeeRoleJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Manage User Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Employee Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 140, -1));

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 209, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Employee Role :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 140, 20));

        EmployeeRoleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(EmployeeRoleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 209, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Username  :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));
        add(usernameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 209, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password  :");
        jLabel6.setToolTipText("");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));
        add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 207, -1));

        addBtn.setBackground(java.awt.Color.gray);
        addBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 110, 30));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Organization : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 209, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Role", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 120, 640, 110));

        backBtn.setBackground(java.awt.Color.gray);
        backBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 97, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(usernameTxtField.getText().isEmpty()|| passwordTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Any of the above text field(s) can't be Empty");
        }else{        String userName = usernameTxtField.getText();
            String password = passwordTxtField.getText();
            if(EcoSystem.checkIfUsernameIsUnique(userName)){
                Organization organization = (Organization) organizationJComboBox.getSelectedItem();
                Employee employee = (Employee) employeeJComboBox.getSelectedItem();
                Role role = (Role) EmployeeRoleJComboBox.getSelectedItem();

                if (organization instanceof ServiceProviderOrganization){
                    ServiceProvider hp= new ServiceProvider();

                    hp.setName(employee.getEmpolyeeName());

                    ((ServiceProviderOrganization) organization).getServiceproviderlist().getServiceProviderDirectory().add(hp);
                           

                }
                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                populateData();
                usernameTxtField.setText("");
                passwordTxtField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeJComboBox(organization);
            populateEmployeeRoleJComboBox(enterprise);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EmployeeRoleJComboBox;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables
}

