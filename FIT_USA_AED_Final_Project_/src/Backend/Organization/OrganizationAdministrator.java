/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.RoleAdmin;
import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Mital
 */
public class OrganizationAdministrator extends Organization {
    public OrganizationAdministrator() {
        super(Organization.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleAdmin());
        return roles;
    }
}