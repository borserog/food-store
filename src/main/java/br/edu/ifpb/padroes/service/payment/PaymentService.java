package br.edu.ifpb.padroes.service.payment;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public PaymentService() {
    }

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void doPayment() {
        paymentStrategy.doPay();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
