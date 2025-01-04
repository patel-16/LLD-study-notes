package DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy;

public class PassengerDrivingStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Drive with cargo");
    }
}
