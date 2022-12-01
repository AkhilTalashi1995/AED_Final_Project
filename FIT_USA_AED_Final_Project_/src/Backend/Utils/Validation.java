/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mital
 */
public class Validation {
    
    public static boolean validateEmail(String email){
        //Pattern p = Pattern.compile("^[^_][a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-zA-Z]+$");
        Pattern p = Pattern.compile("^(.+)@(.+)$");
        Matcher m = p.matcher(email);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean  validatePassword(String password){
        Pattern p = Pattern.compile("^[A-Za-z0-9+_@$]+$");
        Matcher m = p.matcher(password);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validateNameAndNumber(String text) {
        //Pattern p = Pattern.compile("^\\w+$");
        Pattern p = Pattern.compile("^\\d{10}$");
        Matcher m = p.matcher(text);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public static boolean validateFirstName(String firstname){
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(firstname);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validateLastName(String lastname){
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(lastname);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validateCity(String city){
        Pattern p = Pattern.compile("^[A-Za-z0-9+_$]+$");
        Matcher m = p.matcher(city);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validateState(String state){
        Pattern p = Pattern.compile("^[A-Za-z]+$");
        Matcher m = p.matcher(state);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validatePincode(String pincode){
        Pattern p = Pattern.compile("^[0-9]{5}$");
        Matcher m = p.matcher(pincode);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
        
        
    }
    
    public static boolean validateMobnumber(String mobnumber){
        Pattern p = Pattern.compile("^(\\+\\d{1,3}[- ]?)?\\d{10}");
        Matcher m = p.matcher(mobnumber);

        boolean b = m.find();
        if (b == true) {
            return true;
        } else {
            return false;
        }
        
    }
    
}

