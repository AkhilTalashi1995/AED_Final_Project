/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Aashay
 */
public class FoodWellnessEnterprise extends Enterprise{
    public FoodWellnessEnterprise(String name){
        super(name,Enterprise.EnterpriseType.HealthCareEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
