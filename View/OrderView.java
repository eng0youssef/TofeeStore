/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Order;

/**
 *
 * @author Omnia
 */
public class OrderView {
    public void showOrderDetails(Order order) {
        System.out.println("Order details:");
        System.out.println("Items: " + order.getItems());
        System.out.println("Quantities: " + order.getQuantities());
        System.out.println("Shipping Address: " + order.getShippingAddress());
        System.out.println("Payment Method: " + order.getPaymentMethod());
        System.out.println("Status: " + order.getStatus());
    }
}
