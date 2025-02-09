package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.VehicleFactories.VehicleFactory;

public class Demo {

    VehicleFactory luxuryVehicleFactory = new VehicleFactoryPark().getVehicleFactory("luxury");

    Vehicle luxuryVehicle = luxuryVehicleFactory.getVehicle("BMW");

    VehicleFactory budgetVehicleFactory = new VehicleFactoryPark().getVehicleFactory("luxury");

    Vehicle budgetVehicle = budgetVehicleFactory.getVehicle("Hyundai");

}
