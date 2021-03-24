package br.edu.ifpb.padroes.service.payment;

public class DebitStrategy implements PaymentStrategy {
    @Override
    public void doPay() {
        System.out.println("Do debit payment!");
    }
}
