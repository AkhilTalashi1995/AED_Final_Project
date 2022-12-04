/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Utils;

import java.util.Random;

/**
 *
 * @author Akhil
 */
public class OneTimePassword {
    
    public String getOTP(int len)
    {
        String numbers = "0123456789";
        
        Random rndm_method = new Random();
        
        char[] otp = new char[len];
        
        for (int i = 0; i<len; i++)
            { 
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            otp[i] = 
             numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
        return String.copyValueOf(otp);
        
    }
    
}
