/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;
import Backend.Role.RoleAdmin;
import Backend.Role.Role;
import Backend.Role.RoleBeautician;
import java.util.ArrayList;
/**
 *
 * @author Aashay
 */

public class OrganizationBeautySalon extends Organization {
    public OrganizationBeautySalon() {
        super(Organization.Type.Salon.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleBeautician());
        return roles;
    }
    
    
}
