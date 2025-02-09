package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.VehicleFactories.BudgetCarFactory;
import DesignPatterns.AbstractFactory.VehicleFactories.LuxuryCarFactory;
import DesignPatterns.AbstractFactory.VehicleFactories.VehicleFactory;

// One more layer of abstraction over Factory design pattern...
// to fetch objects bases on a condition, but here from a larger family
public class VehicleFactoryPark {

    VehicleFactory getVehicleFactory(String factoryType) {
        return switch (factoryType.toLowerCase()) {
            case ("luxury") -> new LuxuryCarFactory();
            case ("budget") -> new BudgetCarFactory();
            default -> null;
        };
    }

}
