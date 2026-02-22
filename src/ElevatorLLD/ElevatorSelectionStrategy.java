package ElevatorLLD;

import ElevatorLLD.enums.ElevatorDirection;

import java.util.List;

// strategy interface for various algos
// that can be applied to select elevator (via its controller)
// for a given request (floor + direction)
// (I guess this request can also be wrapped under a class
// but we'll see that later)
// Good old physics says request (floor + direction) is a vector ?
public interface ElevatorSelectionStrategy {

    ElevatorController selectElevator(List<ElevatorController> controllers,
                                      int requestFloor,
                                      ElevatorDirection direction);
}
