package SolidLecture.LiskovPrinciple.Proper;

public class ElectricMotorCycle implements AutoPoweredBike {

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}
