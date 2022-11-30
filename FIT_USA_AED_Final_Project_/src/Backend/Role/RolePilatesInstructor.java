/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.OrganizationNutritionConsulatant;
import Backend.Organization.Organization;
import Backend.Organization.OrganizationPilates;
import Backend.User.User;
import FrontEnd.PilatesInstructorRole.WorkAreaPilatesInstructorJPanel;
//import UserInterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Mital
 */
public class RolePilatesInstructor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaPilatesInstructorJPanel(userProcessContainer, account, (OrganizationPilates)organization, enterprise, business, network);    
    }
}
