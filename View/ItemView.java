/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.List;

import Model.Item;


/**
 *
 * @author Omnia
 */



public class ItemView {
    
    public static void displayCatalog(List<Item> catalog) {
        System.out.println("********** Catalog **********");
        for (Item item : catalog) {
            System.out.println("Name: " + item.getName());
            System.out.println("Category: " + item.getCategory());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Image: " + item.getImage());
            System.out.println("Brand: " + item.getBrand());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Discount: " + item.getDiscountPercentage() + "%");
            System.out.println("-----------------------------");
        }
    }

}

