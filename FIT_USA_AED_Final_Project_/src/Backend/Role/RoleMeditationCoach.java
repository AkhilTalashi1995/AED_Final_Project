/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.OrganizationMeditation;
import Backend.Organization.Organization;
import Backend.User.User;
import FrontEnd.MeditationCoachRole.WorkAreaMeditationInstructorJPanel;
import javax.swing.JPanel;
/**
 *
 * @author Mital
 */
public class RoleMeditationCoach extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaMeditationInstructorJPanel(userProcessContainer, account, (OrganizationMeditation)organization, enterprise, business, network);
    }    
//Corrected import FrontEnd End
}
