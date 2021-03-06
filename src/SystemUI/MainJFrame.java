/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI;

import SystemModel.DB4OUtil.DB4OUtil;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Location.Location;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author Karan
 */
public class MainJFrame extends javax.swing.JFrame {

    
    private EcoSystem ecosystem;
    private DB4OUtil db4outil=DB4OUtil.getInstance();
   
    public MainJFrame() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setSize(550, 350);
        
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        ecosystem=db4outil.retrieveSystem();
        EcoSystem.setInstance(ecosystem);
        
        Time();
        Date();
    }
    
    public void Time(){
    
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                //timeLabel.setText(sdf.format(d));   
            }

        }
        ).start();
    }
    
    
    public void Date() {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//    dateLabel.setText(sdf.format(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        controlArea = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        workArea = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplitPane.setBackground(new java.awt.Color(255, 255, 255));
        SplitPane.setDividerLocation(160);
        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        controlArea.setBackground(java.awt.Color.black);
        controlArea.setFont(new java.awt.Font("Malayalam MN", 0, 13)); // NOI18N

        lblusername.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Username:");

        lblpassword.setBackground(new java.awt.Color(255, 255, 255));
        lblpassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Password:");

        txtusername.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        btnlogin.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        javax.swing.GroupLayout controlAreaLayout = new javax.swing.GroupLayout(controlArea);
        controlArea.setLayout(controlAreaLayout);
        controlAreaLayout.setHorizontalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblusername, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(63, 63, 63)
                .addGroup(controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(controlAreaLayout.createSequentialGroup()
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtusername)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2563, Short.MAX_VALUE))
        );

        controlAreaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblpassword, lblusername});

        controlAreaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtpassword, txtusername});

        controlAreaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnlogin, btnlogout});

        controlAreaLayout.setVerticalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtusername))
                .addGap(18, 18, 18)
                .addGroup(controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassword))
                .addGap(25, 25, 25)
                .addGroup(controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin)
                    .addComponent(btnlogout))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        controlAreaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblpassword, lblusername, txtpassword, txtusername});

        controlAreaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnlogin, btnlogout});

        SplitPane.setTopComponent(controlArea);

        workArea.setBackground(new java.awt.Color(204, 204, 255));
        workArea.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemUI/Icon/MicrosoftTeams-image.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(420, 190, 660, 390);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel2.setText("We solve earth scale problems in Job, Training and Funding!");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 110, 1160, 50);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("\"CareerCircle\"");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 30, 450, 70);

        workArea.add(jPanel1, "card2");

        SplitPane.setRightComponent(workArea);

        getContentPane().add(SplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 776));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:

        String username = txtusername.getText();
        char[] passwordArray = txtpassword.getPassword();
        String password = String.valueOf(passwordArray);
        if (username.equals("") || password.equals("")){

            JOptionPane.showMessageDialog(null, " All fields are necessary ");
            return;
        }
        else{
 
            UserAccount useraccount = ecosystem.getUserAccountDirectory().authenticateUser(username, password);
            Enterprise inEnterprise = null;
            Organization inOrganization = null;

            if (useraccount == null) {
                for (Location network : ecosystem.getLocationList()){
                    
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        useraccount = enterprise.getUserAccountDirectory().authenticateUser(username, password);
                        if (useraccount == null) {
                            
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                useraccount = organization.getUserAccountDirectory().authenticateUser(username, password);

                                if (useraccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganization = organization;
                                    break;
                                }
                            }
                        }
                        else{
                            inEnterprise = enterprise;
                            break;
                        }
                        if (inEnterprise != null) {
                            break;
                        }
                        if (inEnterprise != null) {
                            break;
                        }
                    }
                }
            }
            if (useraccount == null) {
                JOptionPane.showMessageDialog(null, "Incorrect Username/Password, Please try again!");
                return;
            } else {
                CardLayout layout = (CardLayout) workArea.getLayout();

                workArea.add("workArea", useraccount.getRole().createWorkArea(workArea, useraccount, inOrganization, inEnterprise, ecosystem));

                layout.next(workArea);
            }
            btnlogin.setEnabled(false);
            btnlogout.setEnabled(true);
            txtusername.setEnabled(false);
            txtpassword.setEnabled(false);

        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        String userName = txtusername.getText();
        char[] passwordArray = txtpassword.getPassword();
        String password = String.valueOf(passwordArray);

        if (userName.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, " Please first Login");
            return;

        }
        else {
            btnlogout.setEnabled(false);
            btnlogin.setEnabled(true);
            txtusername.setEnabled(true);
            txtpassword.setEnabled(true);

            txtusername.setText("");
            txtpassword.setText("");

            workArea.removeAll();
            JPanel blankJPanel = new JPanel();
            workArea.add("blank", blankJPanel);
            CardLayout crdLyt = (CardLayout) workArea.getLayout();
            crdLyt.next(workArea);
            db4outil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnlogoutActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel controlArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
