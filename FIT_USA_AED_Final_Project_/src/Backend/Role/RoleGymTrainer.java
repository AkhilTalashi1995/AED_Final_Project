/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.OrganizationGymnasium;
import Backend.Organization.Organization;
import Backend.User.User;
import FrontEnd.GymTrainerRole.GymTrainerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Mital
 */
public class RoleGymTrainer extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new GymTrainerWorkAreaJPanel(userProcessContainer, account, (OrganizationGymnasium)organization, enterprise, business, network);
    }    
    
}
