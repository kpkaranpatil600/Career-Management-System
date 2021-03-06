/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.UserAccount;

import SystemModel.Role.Role;
import SystemModel.Employee.Employee;
import java.util.ArrayList;
 
/**
 *
 * @author Karan
 */

public class UserAccountDirectory 
{
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
        userAccountList=new ArrayList<>();
        
    }

    public ArrayList<UserAccount> getUserAccountList() 
    {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password)
    {
        for(UserAccount ua:userAccountList)
        {
            if(ua.getUserName().equals(username)&& ua.getPassword().equals(password))
            {
                return ua;
            }
        }
        return null;
    }
    
     public UserAccount createUserAccount(String username, String password, Employee employee, Role role)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
        for(UserAccount ua: userAccountList)
            if(ua.getUserName().equals(username))
            {
                return false;
            }
        return true;
    }
    
}




