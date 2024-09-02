/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.PaymentMethod;
/**
 *
 * @author Omnia
 */
public class PaymentMethodView {
    public void displayCashPayment(PaymentMethod cashPayment) {
        System.out.println("Payment method: Cash");
        System.out.println("Amount due: $" + cashPayment.getAmount());
    }
    
}
