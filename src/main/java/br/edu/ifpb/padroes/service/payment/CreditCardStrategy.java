package br.edu.ifpb.padroes.service.payment;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void doPay() {
        System.out.println("Do credit card payment!");
    }
}
