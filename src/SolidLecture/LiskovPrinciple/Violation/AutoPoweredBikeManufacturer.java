package SolidLecture.LiskovPrinciple.Violation;

import java.util.List;

public class AutoPoweredBikeManufacturer {
    List<Bike> bikeModels;

    // now here the issue is that if we have a
    // manufacturer who has both petrol and electric motorcycle
    // the method will fail when we try to call turnOnEngine for
    // a paddleBiCycle object which also inherits "Bike"

    // this also thus violates Liskov substitution principle
    // which says when we use replace "Bike" in the
    // above line with PaddleBiCycle
    // List<Bike> bikeModel; -> List<PaddleBiCycle> bikeModel;
    // the testBike() method will fail ...

    // A proper solution to this is mentioned in Proper sub-package of the
    // LiskovPrinciple package,
    // that solutions addressed the problem by changing Inheritance
    // structure by introducing one more classification
    // and an additional Interface

    // P.S:
    // a good reference: https://www.baeldung.com/java-liskov-substitution-principle
    public void testBike() {
        for (Bike bike : bikeModels) {
            bike.turnOnEngine();
            bike.accelerate();
        }
    }
}
