/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.Map;
import Model. Item;
/**
 *
 * @author Omnia
 */
public class ShoppingCartView {
   
    public void displayCart(Map<Item, Integer> items, double totalPrice) {
        System.out.println("Cart Contents:");
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%s (%d) - $%.2f\n", item.getName(), quantity, item.getPrice() * quantity * (1 - item.getDiscountPercentage() / 100));
        }
        System.out.printf("Total Price: $%.2f\n", totalPrice);
    }
}

    

