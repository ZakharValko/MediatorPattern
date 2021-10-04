package ua.zakharvalko.components;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.zakharvalko.mediator.Mediator;

@NoArgsConstructor
public abstract class Component {
    Mediator mediator;

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public Component(Mediator mediator){
        this.mediator = mediator;
    }

    public void startProcess(String msg, Component component){
        mediator.startProcess(msg, component);
    }
}
