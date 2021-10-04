package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import ua.zakharvalko.mediator.Mediator;

@AllArgsConstructor
public class TechnicalTaskCreator extends Component {
    private Mediator mediator;

    public void createTechTask(){
        mediator.startProcess("Technical task is created!", this);
    }

}
