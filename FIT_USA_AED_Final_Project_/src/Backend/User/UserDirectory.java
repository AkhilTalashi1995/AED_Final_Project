/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.User;

import Backend.Employee.Employee;
import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Mital
 */
public class UserDirectory {

    private ArrayList<User> userAccountList;

    public UserDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userAccountList;
    }
    
    public User authenticateUser(String username, String password){
        for (User ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public User createUserAccount(String username, String password, Employee employee, Role role){
        User userAccount = new User();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUserAccount(User u){
        
        userAccountList.remove(u);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }    
}


