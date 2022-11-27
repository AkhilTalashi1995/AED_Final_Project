/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.RoleAdmin;
import Backend.Role.RoleGymTrainer;
import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Mital
 */
public class OrganizationGymnasium extends Organization {
    public OrganizationGymnasium() {
        super(Organization.Type.Gym.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleGymTrainer());
        return roles;
    }
}
