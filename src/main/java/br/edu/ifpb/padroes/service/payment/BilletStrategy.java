package br.edu.ifpb.padroes.service.payment;

public class BilletStrategy implements PaymentStrategy {
    @Override
    public void doPay() {
        System.out.println("Do billet payment!");
    }
}
