/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.PaymentMethod;
import View.PaymentMethodView;


/**
 *
 * @author Omnia
 */
public class PaymentMethodController  {
    private PaymentMethod cashPayment;
    private PaymentMethodView cashPaymentView;

    public PaymentMethodController(PaymentMethod cashPayment, PaymentMethodView cashPaymentView) {
        this.cashPayment = cashPayment;
        this.cashPaymentView = cashPaymentView;
    }

    public void setAmount(double amount) {
        cashPayment.setAmount(amount);
    }

    public void processPayment() {
        cashPaymentView.displayCashPayment(cashPayment);
    }
}

    

