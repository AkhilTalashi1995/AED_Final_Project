/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.RoleAdmin;
import Backend.Role.RoleMeditationCoach;
import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Aashay
 */
public class OrganizationMeditation extends Organization{
     public OrganizationMeditation() {
        super(Organization.Type.Meditation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleMeditationCoach());
        return roles;
    }
    
    
}