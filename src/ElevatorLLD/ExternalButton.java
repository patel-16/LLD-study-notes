package ElevatorLLD;


import ElevatorLLD.enums.ElevatorDirection;

public class ExternalButton {

    // maybe we can directly have Scheduler here, but I guess
    // better to have a mediator acc to the instructor...lets see
    private final ExternalDispatcher dispatcher;

    public ExternalButton(ExternalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    // this direction of external button is only helpful in selecting the correct elevator
    public void pressButton(int floor, ElevatorDirection direction) {
        dispatcher.submitExternalRequest(floor, direction);
    }
}


