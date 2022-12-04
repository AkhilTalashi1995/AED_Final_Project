/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.WorkQueue;

/**
 *
 * @author Aashay
 */
public class NutritionistWorkRequest extends WorkRequest{
    private String DoctorAppointment;

    public String getDoctorAppointment() {
        return DoctorAppointment;
    }

    public void setDoctorAppointment(String DoctorAppointment) {
        this.DoctorAppointment = DoctorAppointment;
    }

    
}
