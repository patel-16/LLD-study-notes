package ElevatorLLD;

import ElevatorLLD.enums.ElevatorDirection;

import java.util.concurrent.PriorityBlockingQueue;

// note that 'run' of the Runnable ...
// since each elevator controller must run (parallelly / concurrently)
// it implements Runnable since it will be submitted to separate threads ???
// Check Demo.java

// need to check the monitor object as well...wait and notify pair
// acc to the video it does do a job of making elevator/thread asleep
// and awake as per need
public class ElevatorController implements Runnable {

    // since request can come from multiple sources
    // such as internal and external floor buttons,
    // should be from "concurrent" java package
    // (also remember 'instruction set' and
    // how read/write ops happen to understand more
    // why concurrency safe might be needed in general when
    // requests come from multiple sources simultaneously )
    PriorityBlockingQueue<Integer> upMinPQ;
    PriorityBlockingQueue<Integer> downMaxPQ;

    ElevatorCar elevatorCar;

    private final Object monitor = new Object();

    ElevatorController(ElevatorCar elevatorCar) {

        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityBlockingQueue<>();
        // lookie here how custom comparator works for java...similar to c++ I guess
        downMaxPQ = new PriorityBlockingQueue<>(10, (a, b) -> b - a);
    }


    // earlier I thought request should have both
    // direction and floor, but notice that here the
    // variable is only named destinationFloor, so might not care
    // about direction...just the destination
    // ...see carefully..
    public void submitRequest(int destinationFloor) {
        enqueueRequest(destinationFloor);
    }

    private void enqueueRequest(int destinationFloor) {
        System.out.println("Request details-> destinationFloor: " + destinationFloor + " accepted by elevator:" + elevatorCar.id);

        // next stop since I think it is hard to determine motions
        // in case of currentFloor...also assuming that info not provided...
        // also might change direction in between due to usage of current floor
        // hence better to use nextFloor
        if (destinationFloor == elevatorCar.nextFloorStoppage){
            return;
        }
        if (destinationFloor >= elevatorCar.nextFloorStoppage) {
            if (!upMinPQ.contains(destinationFloor)) {
                upMinPQ.offer(destinationFloor);
            }
        } else {
            if (!downMaxPQ.contains(destinationFloor)) {
                downMaxPQ.offer(destinationFloor);
            }
        }

        // not sure...need to see.
        // video says to wake up elevator...
        // I think the corresponding wait is in
        // controlElevator method ...
        synchronized (monitor) {
            monitor.notify();   // wake elevator thread
        }
    }

    @Override
    public void run() {
        controlElevator();
    }

    public void controlElevator() {

        // I guess needs to run always...
        while (true) {

            //no request, go to sleep
            // (I guess synchronized needed since again request can
            // come from multiple buttons ? Internal and external ??)
            synchronized (monitor) {
                while (upMinPQ.isEmpty() && downMaxPQ.isEmpty()) {
                    try {
                        System.out.println("elevator:" + elevatorCar.id + " is IDLE");
                        elevatorCar.movingDirection = ElevatorDirection.IDLE;
                        monitor.wait(); // sleep until request arrives
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }


            while (!upMinPQ.isEmpty()) {
                int floor = upMinPQ.poll();
                System.out.println("Serving floor: " + floor + " by elevator:" + elevatorCar.id + " currentFloor: " + elevatorCar.currentFloor);
                elevatorCar.moveElevator(floor);
            }


            while (!downMaxPQ.isEmpty()) {
                int floor = downMaxPQ.poll();
                System.out.println("Serving floor: " + floor + " by elevator:" + elevatorCar.id + " currentFloor: " + elevatorCar.currentFloor);
                elevatorCar.moveElevator(floor);
            }
        }
    }
}
