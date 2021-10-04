package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import ua.zakharvalko.mediator.Mediator;

@AllArgsConstructor
public class TechnicalTaskCreator extends Component {
    private Mediator mediator;

    public void createTechTask(){
        startProcess("Technical task is created!", this);
    }

    @Override
    public void startProcess(String msg, Component component) {
        mediator.startProcess(msg, component);
    }
}
