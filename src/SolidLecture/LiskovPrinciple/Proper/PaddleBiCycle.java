package SolidLecture.LiskovPrinciple.Proper;

public class PaddleBiCycle implements ManuallyPoweredBike {

    int speed;

    @Override
    public void accelerate() {
        speed += 10;
    }
}
