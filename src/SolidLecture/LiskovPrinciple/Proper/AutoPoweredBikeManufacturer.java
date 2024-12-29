package SolidLecture.LiskovPrinciple.Proper;

import SolidLecture.LiskovPrinciple.Proper.AutoPoweredBike;

import java.util.List;

public class AutoPoweredBikeManufacturer {
    List<AutoPoweredBike> bikeModels;

    // here instead of "Bike" in the violating version
    // of AutoPoweredBikeManufacturer
    // we use the newly introduced
    // AutoPoweredBike interface and thus here
    // we can replace "AutoPoweredBike" with
    // Electric or Petrol MotorCycle class, and the code will
    // still not break
    public void testBike() {
        for (AutoPoweredBike bike : bikeModels) {
            bike.turnOnEngine();
            bike.accelerate();
        }
    }
}
