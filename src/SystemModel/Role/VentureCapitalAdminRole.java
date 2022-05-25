/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Role;

import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemUI.VentureCapitalEnterPrise.VentureCapitalAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Ashish
 */
public class VentureCapitalAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel WorkArea, UserAccount UserAccount, Organization org, Enterprise enterprise, EcoSystem ESystem) {
        return new VentureCapitalAdminWorkArea(WorkArea, UserAccount, org, enterprise, ESystem);
    }

    @Override
    public String toString() {
        return RoleType.VentureCapitalAdminRole.getValue();
    }
}
