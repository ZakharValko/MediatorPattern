package ua.zakharvalko.mediator;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import lombok.Setter;
import ua.zakharvalko.components.*;


@Setter
public class OrderMediator implements Mediator{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private PriceChecker priceChecker;
    private TechnicalTaskCreator taskCreator;
    private Manufacturer manufacturer;
    private OrderPacker orderPacker;
    private OrderSender orderSender;


    @Override
    public void startProcess(String msg, Component component) {
        logger.info(msg);

        if(component == priceChecker){
            taskCreator.createTechTask();
        } else if(component == taskCreator){
            manufacturer.manufacture();
        }else if(component == manufacturer){
            orderPacker.packaging();
        }else if(component == orderPacker){
            orderSender.sending();
        }else if(component == orderSender){
            logger.info("Order has been send successfully!");
        }
    }

    @Override
    public void errorMessage(String msg) {
        logger.info("Process aborted: " + msg);
    }
}
