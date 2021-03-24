package br.edu.ifpb.padroes.service.payment;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void doPay() {
        System.out.println("Do paypal payment!");
    }
}
