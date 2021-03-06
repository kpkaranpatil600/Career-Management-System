/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SystemUI.Creator;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.Organization.CreatorOrganization;
import SystemModel.UserAccount.UserAccount;
import SystemModel.Creator.Creator;
import SystemModel.Creator.CreatorDirectory;
import SystemModel.WorkFlow.GCOWorkRequest;
import SystemModel.WorkFlow.WorkRequestList;
import SystemModel.WorkFlow.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sudar
 */
public class CreatorDashboard extends javax.swing.JPanel {

    /** Creates new form CreatorDashboard */
    
    private JPanel workArea;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise enterprise;
    private EcoSystem ESystem;
    private Creator c;
    public CreatorDashboard(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.workArea=downJPanel;
        this.UserAccount=UserAccount;
        this.org=org;
        this.enterprise=enterprise;
        this.ESystem=ESystem;
        
        for (Creator creator:((CreatorOrganization)org).getCreatorList().getCreatorList())
        {
            if (UserAccount.getEmployee().getEmpolyeeName().equals(creator.getCreatorName())) {
                 c = creator;
                 
                System.out.println("Creator Name" + c.getCreatorName());
            }
            
        }
    
    
        if(c.getWorkRequestList()== null){
            WorkRequestList w = new WorkRequestList();
            c.setWorkRequestList(w);
            
        }
        
        
        populateEventTable();
    }
    
    public void populateEventTable()
    {
         DefaultTableModel model = (DefaultTableModel) gcEventTbl.getModel();

        model.setRowCount(0);

        for (WorkRequest work : ESystem.getWorkRequestList().getWorkRequestList()) {
            if (work instanceof GCOWorkRequest) {

                Object[] row = new Object[10];
                row[0] = ((GCOWorkRequest) work).getTitle();
                row[1] = ((GCOWorkRequest) work).getDescription();
                row[2] = work.getDateOfRequest();
                row[3] = ((GCOWorkRequest) work).getLocation();
                row[4] = ((GCOWorkRequest) work).getCreatorRequired();
                row[5] = ((GCOWorkRequest) work).getCreatorAcquired();
                row[6] = work;

                model.addRow(row);
            }

        }
    }
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gcEventTbl = new javax.swing.JTable();
        vRequiredTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        titleTxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descTxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        joinBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creator Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        gcEventTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Title", "Description", "Date", "Location", "Creators Required", "Creators acquired", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gcEventTbl);
        if (gcEventTbl.getColumnModel().getColumnCount() > 0) {
            gcEventTbl.getColumnModel().getColumn(6).setMinWidth(0);
            gcEventTbl.getColumnModel().getColumn(6).setPreferredWidth(0);
            gcEventTbl.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 860, 130));
        add(vRequiredTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 241, 30));

        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 241, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Event Title : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 152, 20));

        viewBtn.setBackground(java.awt.Color.gray);
        viewBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 135, -1));

        titleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTxtActionPerformed(evt);
            }
        });
        add(titleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 241, 30));

        descTxt.setColumns(20);
        descTxt.setRows(5);
        jScrollPane3.setViewportView(descTxt);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 241, 50));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Description : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 152, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Location : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 152, -1));
        add(locationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 241, 30));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Date :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 50, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("No. Creators Required : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 160, -1));

        joinBtn.setBackground(java.awt.Color.gray);
        joinBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        joinBtn.setText("Join this event");
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });
        add(joinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = gcEventTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            GCOWorkRequest p = (GCOWorkRequest) gcEventTbl.getValueAt(selectedRow, 6);
            titleTxt.setText(p.getTitle());
            descTxt.setText(p.getDescription());
            locationTxt.setText(p.getLocation());
            dateTxt.setText(p.getDateOfRequest().toString());
            //dateTxt.setText("date");
            vRequiredTxt.setText(String.valueOf(p.getCreatorRequired()));
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed
        int selectedRow = gcEventTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            GCOWorkRequest p = (GCOWorkRequest) gcEventTbl.getValueAt(selectedRow, 6);
           
            p.setCreatorRequired(p.getCreatorRequired() - 1);
            p.setCreatorAcquired(p.getCreatorAcquired() + 1);
            p.setCreator(c);

            JOptionPane.showMessageDialog(null, "You Successfully registered for an Event! \n The number of Creators acquired so far for this event are " + p.getCreatorAcquired() + "\n The number of Creators now required for this event are" + p.getCreatorRequired());
            DefaultTableModel model = (DefaultTableModel) gcEventTbl.getModel();
            model.removeRow(gcEventTbl.getSelectedRow());

        }
    }//GEN-LAST:event_joinBtnActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

    private void titleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextArea descTxt;
    private javax.swing.JTable gcEventTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton joinBtn;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JTextField vRequiredTxt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

}
