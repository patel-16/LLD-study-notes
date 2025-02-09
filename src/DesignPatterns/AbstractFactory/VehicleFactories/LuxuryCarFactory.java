package DesignPatterns.AbstractFactory.VehicleFactories;

import DesignPatterns.AbstractFactory.LuxuryCars.BMWCar;
import DesignPatterns.AbstractFactory.LuxuryCars.MercedesCar;
import DesignPatterns.AbstractFactory.Vehicle;

public class LuxuryCarFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String car) {

        return switch (car.toLowerCase()) {
            case ("bmw") -> new BMWCar();
            case ("mercedes") -> new MercedesCar();
            default -> null;
        };

    }

}
