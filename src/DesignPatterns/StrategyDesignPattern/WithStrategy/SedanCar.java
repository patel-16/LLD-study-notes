package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.PassengerDrivingStrategy;

public class SedanCar extends Vehicle {

    SedanCar() {
        super(new PassengerDrivingStrategy());
    }

}
