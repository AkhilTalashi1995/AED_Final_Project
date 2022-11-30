/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.OrganizationDietition;
import Backend.Organization.Organization;
import Backend.User.User;
import FrontEnd.DietitionRole.DietitionnWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author Akhil
 */

public class RoleDietitian extends Role  {


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new DietitionnWorkAreaJPanel(userProcessContainer, account, (OrganizationDietition)organization, enterprise, business, network);
    }
    
}
