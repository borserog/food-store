package br.edu.ifpb.padroes.service.order;

public class OrderCancelled extends OrderState {
    public OrderCancelled(OrderContext orderContext) {
        super(orderContext);
        System.out.println("New Order State: Cancelled");
    }

    @Override
    public void retryOrder() {

    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void paymentApproved() {

    }

    @Override
    public void paymentRefused() {

    }
}
