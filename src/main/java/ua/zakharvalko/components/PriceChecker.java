package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import ua.zakharvalko.Order;
import ua.zakharvalko.mediator.Mediator;

@AllArgsConstructor
public class PriceChecker extends Component{

    private Mediator mediator;
    private Order order;

    public PriceChecker(Mediator mediator) {
        super(mediator);
    }


    public void checkPrice(Order order){
        this.order = order;

        if(order.getTotalPrice()/order.getQuantity() <= 100) {
            mediator.startProcess("Price verified", this);
        } else {
            mediator.errorMessage("This to low price for this order!");
        }
    }

}
