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
import Backend.Organization.OrganizationBeautySalon;
import Backend.User.User;
import FrontEnd.BeauticianRole.WorkAreaSalonJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Aashay
 */
public class RoleBeautician extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
    return new WorkAreaSalonJPanel(userProcessContainer, account, (OrganizationBeautySalon)organization, enterprise, business, network);
    }
// corrected error Import FrontEnd
}

