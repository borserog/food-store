package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

public class OrderContext {

    private Order order;
    private OrderState orderState;

    public OrderContext(Order order) {
        this.order = order;
        this.orderState = new OrderInProgress(this);
    }

    public void changeState(OrderState orderState) {
        this.orderState = orderState;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public Order getOrder() {
        return order;
    }
}
