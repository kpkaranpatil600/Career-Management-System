/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.VentureCapitalUser.VentureCapitalUser;

import SystemModel.EcoSystem; 
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemModel.WorkFlow.ServiceSeekerWorkReqest;
import SystemModel.WorkFlow.WorkRequest;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ashish
 */
public class VentureCapitalUserWorkArea extends javax.swing.JPanel {
    private JPanel workArea;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise Enterprise;
    private EcoSystem ESystem;
    /**
     * Creates new form VentureCapitalUserWorkArea
     */
    public VentureCapitalUserWorkArea(JPanel workArea,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.workArea=workArea;
        this.UserAccount=UserAccount;
        this.org=org;
        this.Enterprise=enterprise;
        this.ESystem=ESystem;
        
        populateWorkQueueTable();
    }
    public void populateWorkQueueTable(){
    DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : ESystem.getWorkRequestList().getWorkRequestList()){
           if((work instanceof ServiceSeekerWorkReqest)&& (work.getSubject().equalsIgnoreCase("Funding")))
               {
                   
               
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getEmpolyeeName();
            row[1] = work.getSubject();
            row[2] = ((ServiceSeekerWorkReqest) work).getDescription();
            row[3] = ((ServiceSeekerWorkReqest) work).getLocation();
            row[4] = work.getDateOfRequest();
            row[5] = work;
            row[6] = work.getReciever();
            
            model.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        requestJTable = new javax.swing.JTable();
        completeWorkBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Venture Capital User Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject", "Description", "Location", "Date", "Status", "Service Provider"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 133, 757, 230));

        completeWorkBtn.setBackground(java.awt.Color.gray);
        completeWorkBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        completeWorkBtn.setText("Complete!");
        completeWorkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeWorkBtnActionPerformed(evt);
            }
        });
        add(completeWorkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 220, 36));
    }// </editor-fold>//GEN-END:initComponents

    private void completeWorkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeWorkBtnActionPerformed
        int selectedRow = requestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please first select a row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else{

            ServiceSeekerWorkReqest ss = (ServiceSeekerWorkReqest) requestJTable.getValueAt(selectedRow, 5);

            ss.setStatus("Complete");
            ss.setReciever(UserAccount);
            JOptionPane.showMessageDialog(null, "The request has been completed successfully");
            populateWorkQueueTable();

        }
    }//GEN-LAST:event_completeWorkBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeWorkBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestJTable;
    // End of variables declaration//GEN-END:variables
}

