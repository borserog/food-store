package br.edu.ifpb.padroes.service.order;

public class OrderPaymentApproved extends OrderState {
    public OrderPaymentApproved(OrderContext orderContext) {
        super(orderContext);
        System.out.println("New Order State: Payment Approved");
    }

    @Override
    public void retryOrder() {

    }

    @Override
    public void cancelOrder() {
        super.orderContext.changeState(new OrderCancelled(orderContext));
    }

    @Override
    public void paymentApproved() {

    }

    @Override
    public void paymentRefused() {

    }
}
