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
public class MentalWellnessEnterprise extends Enterprise{
     public MentalWellnessEnterprise(String name){
        super(name,Enterprise.EnterpriseType.MentalHealthEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}