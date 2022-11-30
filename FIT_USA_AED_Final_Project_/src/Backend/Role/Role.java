/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.User.User;
import javax.swing.JPanel;
/**
 *
 * @author Akhil
 */
public abstract class Role {


    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Customer("Customer"),
        Dietician("Dietician"),
        Therapist("Therapist"),
        GymInstructor("Gym Instructor"),
        YogaInstructor("Yoga Instructor"),
        Salon("Salon"),
        Spa("Spa"),
        MeditationInstructor("Meditation Instructor");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business, Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }    

 
}
