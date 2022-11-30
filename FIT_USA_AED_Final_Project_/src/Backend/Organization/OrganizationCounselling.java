/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.RoleAdmin;
import Backend.Role.Role;
import Backend.Role.RoleCounselor;
import java.util.ArrayList;
/**
 *
 * @author Aashay
 */
public class OrganizationCounselling extends Organization {
    public OrganizationCounselling() {
        super(Organization.Type.Therapist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleCounselor());
        return roles;
    }
}

