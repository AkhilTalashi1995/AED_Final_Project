/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;
import Backend.Role.RoleAdmin;
import Backend.Role.Role;
import Backend.Role.RoleSpaTherapist;
import java.util.ArrayList;
/**
 *
 * @author rutujaghate
 */
public class OrganizationSpa extends Organization {
    public OrganizationSpa() {
        super(Organization.Type.Spa.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleSpaTherapist());
        return roles;
    }  
    
    
}
