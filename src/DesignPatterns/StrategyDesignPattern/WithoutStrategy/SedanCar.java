package DesignPatterns.StrategyDesignPattern.WithoutStrategy;

public class SedanCar extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Drive with passengers");
    }
}
