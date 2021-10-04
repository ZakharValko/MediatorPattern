package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import ua.zakharvalko.mediator.Mediator;

@AllArgsConstructor
public class Manufacturer extends Component{
    private Mediator mediator;
    private boolean manufacturingTrouble = false;

    public void manufacture(){
        if(!manufacturingTrouble) {
            startProcess("Manufacturing is finished!", this);
        } else {
            mediator.errorMessage("Manufacturing process has troubles");
        }
    }

    @Override
    public void startProcess(String msg, Component component){
        mediator.startProcess(msg, component);
    }

}
