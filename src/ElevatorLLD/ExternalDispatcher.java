package ElevatorLLD;

import ElevatorLLD.enums.ElevatorDirection;

import java.util.List;

public class ExternalDispatcher {

    ElevatorScheduler scheduler;

    public ExternalDispatcher(ElevatorScheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void submitExternalRequest(int floor, ElevatorDirection direction) {

        // get controller from scheduler
        ElevatorController controller =
                scheduler.assignElevator(floor, direction);

        // submit request to controller
        controller.submitRequest(floor);
    }

}
