package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import ua.zakharvalko.mediator.Mediator;

@AllArgsConstructor
public class Manufacturer extends Component{
    private Mediator mediator;
    private boolean manufacturingTrouble = false;

    public void manufacture(){
        if(!manufacturingTrouble) {
        mediator.startProcess("Manufacturing is finished!", this);
        } else {
            mediator.errorMessage("Manufacturing process has troubles");
        }
    }

}
