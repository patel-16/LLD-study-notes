package DesignPatterns.StrategyDesignPattern.WithStrategy;

import DesignPatterns.StrategyDesignPattern.WithStrategy.Strategy.CargoDrivingStrategy;

public class GoodsTruck extends Vehicle {
    GoodsTruck() {
        super(new CargoDrivingStrategy());
    }
}
