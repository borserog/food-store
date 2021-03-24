package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.log.FileLogHandler;
import br.edu.ifpb.padroes.service.log.LogHandlerImpl;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.mail.EmailNotification;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;

public class OrderManager {

    public OrderManager(Order order) {
        this.order = order;
    }

    private Order order;

    private EmailNotification emailNotification = new EmailNotification();

    private PaymentService paymentService = new PaymentService();

    private LogService logServiceImpl = new LogService(new FileLogHandler());

    public void payOrder(PaymentStrategy paymentStrategy) {
        order.setStatus(Order.OrderStatus.IN_PROGRESS);
        try {
            paymentService.setPaymentStrategy(paymentStrategy);
            paymentService.doPayment();
            order.setStatus(Order.OrderStatus.PAYMENT_SUCCESS);
            emailNotification.sendMailNotification(String.format("Order %d completed successfully", order.getId()));
            logServiceImpl.info("payment finished");
        } catch (Exception e) {
            logServiceImpl.error("payment refused");
            order.setStatus(Order.OrderStatus.PAYMENT_REFUSED);
            emailNotification.sendMailNotification(String.format("Order %d refused", order.getId()));
        }
    }

    public void cancelOrder() {
        order.setStatus(Order.OrderStatus.CANCELED);
        emailNotification.sendMailNotification(String.format("Order %d canceled", order.getId()));
        logServiceImpl.debug(String.format("order %d canceled", order.getId()));
    }

}
