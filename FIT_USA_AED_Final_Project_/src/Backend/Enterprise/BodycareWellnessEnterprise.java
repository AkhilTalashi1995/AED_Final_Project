/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;
import Backend.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akhil
 */
public class BodycareWellnessEnterprise extends Enterprise{
    public BodycareWellnessEnterprise(String name){
        super(name,Enterprise.EnterpriseType.PersonalCareEnt);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
