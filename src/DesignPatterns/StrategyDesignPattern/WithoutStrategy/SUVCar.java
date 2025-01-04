package DesignPatterns.StrategyDesignPattern.WithoutStrategy;

public class SUVCar extends Vehicle {

    // the objective of Strategy design pattern appears to be
    // tackling redundancy/(duplication) of code among children of
    // a base class...

    // here this method implementation is identical to that of SedanCar class
    @Override
    public void drive() {
        System.out.println("Drive with passengers");
    }
}
