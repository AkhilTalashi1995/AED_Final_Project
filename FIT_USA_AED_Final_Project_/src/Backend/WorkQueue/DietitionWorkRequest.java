/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.WorkQueue;

/**
 *
 * @author Akhil
 */
public class DietitionWorkRequest extends WorkRequest{
    
    private String dieticianAppointment;

    public String getDieticianAppointment() {
        return dieticianAppointment;
    }

    public void setDieticianAppointment(String dieticianAppointment) {
        this.dieticianAppointment = dieticianAppointment;
    } 
    
}
