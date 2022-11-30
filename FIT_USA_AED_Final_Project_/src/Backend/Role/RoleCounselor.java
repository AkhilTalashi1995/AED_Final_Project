/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;

import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.Organization.Organization.Type;
import Backend.Organization.OrganizationCounselling;
import Backend.Role.Role.RoleType;
import Backend.User.User;
import FrontEnd.CounselorRole.WorkAreaTherapistJPanel;
import javax.swing.JPanel;
/**
 *
 * @author Aashay
 */
public class RoleCounselor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {  
    return new WorkAreaTherapistJPanel(userProcessContainer, account, (OrganizationCounselling)organization, enterprise, business, network);
    }    
//Edited name from counsellor and the import package
    
}

