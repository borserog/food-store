package br.edu.ifpb.padroes.service.order;

abstract class OrderState {
    OrderContext orderContext;

    public OrderState(OrderContext orderContext) {
        this.orderContext = orderContext;
    }

    abstract public void retryOrder();
    abstract public void cancelOrder();
    abstract public void paymentApproved();
    abstract public void paymentRefused();
}