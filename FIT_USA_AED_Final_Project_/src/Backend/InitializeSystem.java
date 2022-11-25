/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Backend.Employee.Employee;
import Backend.Role.RoleSystemAdmin;

import Backend.User.User;
/**
 *
 * @author Akhil
 */
public class InitializeSystem {
    public static EcoSystem configure(){


        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH",null); 
        
        User ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new RoleSystemAdmin());
        
        return system;

  //CORRECTED

    }    
    
}
