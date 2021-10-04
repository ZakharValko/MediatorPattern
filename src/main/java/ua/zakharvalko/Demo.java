package ua.zakharvalko;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.zakharvalko.components.*;
import ua.zakharvalko.mediator.OrderMediator;

public class Demo {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(Demo.class);

        Order order = Order.builder().titleOfYogurt("Danon").quantity(100).totalPrice(8000).build();
        Order order2 = Order.builder().titleOfYogurt("Activia").quantity(100).totalPrice(12000).build();

        OrderMediator mediator = new OrderMediator();

        PriceChecker priceChecker = new PriceChecker(mediator, order);
        TechnicalTaskCreator taskCreator = new TechnicalTaskCreator(mediator);
        Manufacturer manufacturer = new Manufacturer(mediator, false);
        OrderPacker orderPacker = new OrderPacker(mediator);
        OrderSender orderSender = new OrderSender(mediator);

        mediator.setPriceChecker(priceChecker);
        mediator.setTaskCreator(taskCreator);
        mediator.setManufacturer(manufacturer);
        mediator.setOrderPacker(orderPacker);
        mediator.setOrderSender(orderSender);

        logger.info("First order (price is ok)");
        priceChecker.checkPrice(order);
        logger.info("---------------\n");

        logger.info("Second order (price is low)");
        priceChecker.checkPrice(order2);
        logger.info("---------------\n");
    }
}
