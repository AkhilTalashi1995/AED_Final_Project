/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;
import Backend.Role.RoleDietitian;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akhil
 */
public class OrganizationDietition extends Organization {
    public OrganizationDietition() {
        super(Organization.Type.Dietician.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleDietitian());
        return roles;
    }
}
