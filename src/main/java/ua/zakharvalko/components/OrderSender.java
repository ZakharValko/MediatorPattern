package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import ua.zakharvalko.mediator.Mediator;

@AllArgsConstructor
public class OrderSender extends Component{
    private Mediator mediator;

    public void sending(){
        mediator.startProcess("Order is sent!", this);
    }
}
