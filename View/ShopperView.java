/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.Scanner;
import Controller.ShopperController;

/**
 *
 * @author Omnia
 */
public class ShopperView {
    
    private ShopperController userController =new ShopperController();
    private Scanner scanner = new Scanner(System.in);

    public void registerUser() {
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        boolean success = userController.registerShopper(email, password, address);
        if (success) {
            System.out.println("Registration successful. Please check your email for OTP.");
        } else {
            System.out.println("Registration failed. Please try again.");
        }
    }

    public void loginUser() {
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        boolean success = userController.loginShopper(email, password);
        if (success) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }
}

   