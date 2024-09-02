/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Item;
import Model.ShoppingCart;
import View.ShoppingCartView;


/**
 *
 * @author Omnia
 */
public class ShoppingCartController {
    
    private ShoppingCart cart;
   
    private ShoppingCartView cartView;

    public ShoppingCartController() {
        cart = new ShoppingCart();
        cartView = new ShoppingCartView();
    }

    public void addItem(Item item, int quantity) {
        cart.addItem(item, quantity);
        updateView();
    }

    public void removeItem(Item item, int quantity) {
        cart.removeItem(item, quantity);
        updateView();
    }

    private void updateView() {
        cartView.displayCart(cart.getItems(), cart.getTotalPrice());
    }

    public ShoppingCartView getCartView() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public ShoppingCart getCart() {
        return cart;
}
   

    
}


   

   
    


    

