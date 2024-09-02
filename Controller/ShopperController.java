/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Shopper;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Omnia
 */
public class ShopperController {
    private Map<String, Shopper> shopperDatabase;
    private Map<String, String> otpCodes;
    private Random random = new Random();

    public ShopperController() {
        shopperDatabase = new HashMap<String, Shopper>();
        otpCodes = new HashMap<String, String>();
    }

    public boolean registerShopper(String email, String password, String address) {
         if (!isValidEmail(email) || !isValidPassword(password)) {
              System.out.println("Error:this email or password not valid\n");
            return false;
        }
        
        if (shopperDatabase.containsKey(email)) {
            System.out.println("Error:this email already exist\n");
            return false;
        }
        
        

        Shopper shopper = new Shopper(email, password, address);
        shopperDatabase.put(email, shopper);
        sendOTP(email);
        System.out.println("Shopper registered successfully.");

        return true;
    }
     public boolean loginShopper(String email, String password) {
        
        if (!shopperDatabase.containsKey(email)) {
            System.out.println("Error:this email doesn't already exis\nt");
            return false;
        }

        Shopper shopper = shopperDatabase.get(email);
        if (!shopper.getPassword().equals(password)) {
            System.out.println("Error:password isn't correct\n");
            return false;
        }
         
         System.out.println("User logged in successfully.");
        return true;
     }  
     private boolean isValidEmail(String email) {
    
    String emailValid = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    return email.matches(emailValid);
}

private boolean isValidPassword(String password) {
   
    String passwordValid = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    return password.matches(passwordValid);
}
private void sendOTP(String email) {
        String otpCode = generateOTP();
        otpCodes.put(email, otpCode);

}
    private String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }
    public Shopper getShopper(String email) {
        Iterable<Shopper> shoppers;
        for (Shopper shopper : shoppers) {
            if (shopper.getEmail().equals(email)) {
                return shopper;
            }
        }



        
       
    

   

        
    

