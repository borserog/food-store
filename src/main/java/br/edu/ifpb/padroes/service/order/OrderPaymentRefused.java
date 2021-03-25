package br.edu.ifpb.padroes.service.order;

public class OrderPaymentRefused extends OrderState {
    public OrderPaymentRefused(OrderContext orderContext) {
        super(orderContext);
        System.out.println("New Order State: Payment Refused");
    }

    public void retryOrder() {
        super.orderContext.changeState(new OrderInProgress(orderContext));
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
