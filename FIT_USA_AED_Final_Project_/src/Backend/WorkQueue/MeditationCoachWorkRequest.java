/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.WorkQueue;

/**
 *
 * @author Aashay
 */
public class MeditationCoachWorkRequest extends WorkRequest{
    private String MeditationInstructorAppointment;

    public String getMeditationInstructorAppointment() {
        return MeditationInstructorAppointment;
    }

    public void setMeditationInstructorAppointment(String MeditationInstructorAppointment) {
        this.MeditationInstructorAppointment = MeditationInstructorAppointment;
    }
   
    
}