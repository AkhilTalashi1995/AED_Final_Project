/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;
import Backend.Role.RoleAdmin;
import Backend.Role.Role;
import Backend.Role.RolePilatesInstructor;
import java.util.ArrayList;

/**
 *
 * @author Mital
 */
public class OrganizationPilates extends Organization {
    public OrganizationPilates() {
        super(Organization.Type.Yoga.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RolePilatesInstructor());
        return roles;
    }
    
    
}
