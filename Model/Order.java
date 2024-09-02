/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Model.ShoppingCart;

/**
 *
 * @author Omnia
 */
public class Order {
    private List<Item> items;
    private Map<Item, Integer> quantities;
    private String shippingAddress;
    private String paymentMethod;
    private String status;
    private Shopper shopper;
    private String address;
    public Order(Shopper shopper, ShoppingCart cart, String address) {
    this.shopper = shopper;
    this.address = address;
    this.items = new ArrayList<Item>();
    this.quantities = new HashMap<Item, Integer>();
    
  
}


    public Order(List<Item> items, Map<Item, Integer> quantities, String shippingAddress, String paymentMethod) {
        this.items = items;
        this.quantities = quantities;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.status = "placed";
    }

    // Getter and setter for items
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Getter and setter for quantities
    public Map<Item, Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(Map<Item, Integer> quantities) {
        this.quantities = quantities;
    }

    // Getter and setter for shippingAddress
    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    // Getter and setter for paymentMethod
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Getter and setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}