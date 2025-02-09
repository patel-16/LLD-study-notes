package DesignPatterns.AbstractFactory.VehicleFactories;

import DesignPatterns.AbstractFactory.BudgetCars.HyundaiCar;
import DesignPatterns.AbstractFactory.BudgetCars.MarutiCar;
import DesignPatterns.AbstractFactory.Vehicle;

public class BudgetCarFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String car) {

        return switch (car.toLowerCase()) {
            case ("hyundai") -> new HyundaiCar();
            case ("maruti") -> new MarutiCar();
            default -> null;
        };

    }

}
