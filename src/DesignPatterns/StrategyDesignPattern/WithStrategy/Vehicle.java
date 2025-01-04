package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.DrivingStrategy;

public class Vehicle {

    // This strategy object is introduced to tackle the code duplication
    // demonstrated in the WithoutStrategy package
    DrivingStrategy drivingStrategyObj;

    // this is called constructor injection, while its
    // children will use to pass desired drivingStrategyObject
    Vehicle(DrivingStrategy drivingStrategyObj) {
        this.drivingStrategyObj = drivingStrategyObj;
    }

    public void drive() {
        drivingStrategyObj.drive();
    }
}
