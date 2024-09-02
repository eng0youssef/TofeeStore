/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Order;
import View.OrderView;

/**
 *
 * @author Omnia
 */
public class OrderController {
    private Order order;
    private OrderView orderView;

public OrderController(Order order, OrderView orderView) {
    this.order = order;
    this.orderView = orderView;
}


public void markOrderAsDelivered() {
    order.setStatus("delivered");
    orderView.showOrderDetails(order);
}


public void processPayment() {
    System.out.println("Processing payment for order...");
    
    System.out.println("Payment processed successfully.");
    markOrderAsDelivered();
}
    
}
