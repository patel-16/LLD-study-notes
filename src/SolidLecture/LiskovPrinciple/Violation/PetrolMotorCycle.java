package SolidLecture.LiskovPrinciple.Violation;

public class PetrolMotorCycle implements Bike {

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
