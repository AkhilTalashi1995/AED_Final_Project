/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Role;
import Backend.Customers.Customer;
import Backend.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.OrganizationCustomer;
import Backend.Organization.Organization;
import Backend.User.User;
import FrontEnd.Customer.CustomerLoginWorkAreaJPanel;
import FrontEnd.Customer.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Akhil
 */

public class RoleCustomer extends Role {

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
         return new CustomerWorkAreaJPanel(userProcessContainer, (OrganizationCustomer)organization, business, network);
    } 
 
}
