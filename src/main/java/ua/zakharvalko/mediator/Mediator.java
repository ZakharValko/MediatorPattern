package ua.zakharvalko.mediator;

import ua.zakharvalko.components.Component;

public interface Mediator {

    void startProcess(String msg, Component component);
    void errorMessage(String msg);

}
