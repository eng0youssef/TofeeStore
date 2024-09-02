/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Omnia
 */
public class ShoppingCart {
   
    private Map<Item, Integer> items; 
    

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public Map<Item, Integer> getItems() {
        return items;
    }

    public void addItem(Item item, int quantity) {
        if (items.containsKey(item)) {
            int currentQuantity = items.get(item);
            items.put(item, currentQuantity + quantity);
        } else {
            items.put(item, quantity);
        }
    }

    public void removeItem(Item item, int quantity) {
        if (items.containsKey(item)) {
            int currentQuantity = items.get(item);
            if (currentQuantity > quantity) {
                items.put(item, currentQuantity - quantity);
            } else {
                items.remove(item);
            }
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += item.getPrice() * quantity * (1 - item.getDiscountPercentage());
        }
        return totalPrice;
    }
}


    

