/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import Backend.Role.Role;
import Backend.Role.RoleNutritionConsultant;
import java.util.ArrayList;

/**
 *
 * @author Aashay
 */
public class OrganizationNutritionConsulatant extends Organization {
    public OrganizationNutritionConsulatant() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleNutritionConsultant());
        return roles;
    }
}
