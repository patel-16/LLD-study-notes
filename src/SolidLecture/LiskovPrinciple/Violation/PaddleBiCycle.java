package SolidLecture.LiskovPrinciple.Violation;

public class PaddleBiCycle implements Bike {

    int speed;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Paddle bi cycle does not have engine");
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}
