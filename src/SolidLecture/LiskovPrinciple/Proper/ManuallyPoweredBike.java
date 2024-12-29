package SolidLecture.LiskovPrinciple.Proper;

public interface ManuallyPoweredBike extends Bike {

    // I think not needed to be explicitly mentioned due
    // to inheritance
    // but any ways for clarity's sake
    void accelerate();

}
