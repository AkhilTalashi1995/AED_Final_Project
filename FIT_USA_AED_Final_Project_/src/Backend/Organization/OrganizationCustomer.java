/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.RoleAdmin;
import Backend.Role.RoleCustomer;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akhil
 */
public class OrganizationCustomer extends Organization{
    public OrganizationCustomer() {
        super(Organization.Type.Customer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleCustomer());
        return roles;
    }
    
}
