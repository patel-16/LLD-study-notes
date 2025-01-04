package DesignPatterns.StrategyDesignPattern.WithoutStrategy;

public class GoodsTruck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Drive with cargo");
    }
}
