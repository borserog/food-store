package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

public class OrderInProgress extends OrderState {

    public OrderInProgress(OrderContext orderContext) {
        super(orderContext);
        System.out.println("Order now In Progress");
    }

    @Override
    public void retryOrder() {

    }

    public void cancelOrder() {
        super.orderContext.changeState(new OrderCancelled(orderContext));
    }

    public void paymentApproved() {
        super.orderContext.changeState(new OrderPaymentApproved(orderContext));
    }

    public void paymentRefused() {
        super.orderContext.changeState(new OrderPaymentRefused(orderContext));
    }
}
