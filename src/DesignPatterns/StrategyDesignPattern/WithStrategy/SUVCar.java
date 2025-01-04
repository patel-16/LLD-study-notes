package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.DrivingStrategy;
import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.PassengerDrivingStrategy;

public class SUVCar extends Vehicle {

    // Here we pass the desired Strategy object so that
    // we can get desired drive() behaviour
    SUVCar() {
        super(new PassengerDrivingStrategy());
    }

}
