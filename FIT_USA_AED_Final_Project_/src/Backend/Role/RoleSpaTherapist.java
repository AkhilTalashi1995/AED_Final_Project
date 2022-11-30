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
import Backend.Organization.OrganizationSpa;
import Backend.User.User;
import FrontEnd.SpaTherapistRole.WorkAreaSpaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Aashay
 */
public class RoleSpaTherapist extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaSpaJPanel(userProcessContainer, account, (OrganizationSpa)organization, enterprise, business, network);
    }    
   
}