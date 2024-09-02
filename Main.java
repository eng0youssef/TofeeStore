/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Controller.ShoppingCartController;
import Controller.ItemController;
import Controller.OrderController;
import Controller.ShopperController;

import Model.Item;
import Model.Order;
import Model.Shopper;
import View.OrderView;
import View.ShoppingCartView;
import java.util.ArrayList;


/**
 *
 * @author Omnia
 */
public class Main {
    
    public static void main(String[] args) {
        // Testing ItemController
        ItemController itemController = new ItemController();
        itemController.addItems();
        ArrayList<Item> items = itemController.getItems();
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }

        // Testing ShopperController
        ShopperController shopperController = new ShopperController();
        shopperController.registerShopper("example@gmail.com", "Password1@", "123 Main Street");
        shopperController.registerShopper("invalidemail", "password", "456 High Street");
        shopperController.loginShopper("example@gmail.com", "Password1@");
        shopperController.loginShopper("example@gmail.com", "incorrectpassword");
        shopperController.loginShopper("nonexistentemail", "Password1@");

      
    }
}




