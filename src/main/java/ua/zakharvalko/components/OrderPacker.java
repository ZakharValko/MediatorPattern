package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import ua.zakharvalko.mediator.Mediator;

@AllArgsConstructor
public class OrderPacker extends Component{
    private Mediator mediator;

    public void packaging(){
        mediator.startProcess("Order is packed!", this);
    }

    @Override
    public void startProcess(String msg, Component component) {
        mediator.startProcess(msg, component);
    }
}
