/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Organization;

import java.util.ArrayList;
/**
 *
 * @author Mital
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization getOrganization(int index) {

        return organizationList.get(index);

    }

    

    public Organization removeOrganization(int index) {

        return organizationList.remove(index);

    }



    public int getOrganizationID(int index){

       return organizationList.get(index).getOrganizationID();

    }

    

    public String getOrganizationName(int index){

        return organizationList.get(index).getName();

    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Salon.getValue())) {
            organization = new OrganizationBeautySalon();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Spa.getValue())) {
            organization = new OrganizationSpa();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Meditation.getValue())) {
            organization = new OrganizationMeditation();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Therapist.getValue())) {
            organization = new OrganizationCounselling();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Doctor.getValue())) {
            organization = new OrganizationNutritionConsulatant();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Dietician.getValue())) {
            organization = new OrganizationDietition();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Gym.getValue())) {
            organization = new OrganizationGymnasium();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.Yoga.getValue())) {
            organization = new OrganizationPilates();
            organizationList.add(organization);
        }

        return organization;
    }
}
