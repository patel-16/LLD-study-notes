package SolidLecture.LiskovPrinciple.Proper;

public class PetrolMotorCycle implements AutoPoweredBike {

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
