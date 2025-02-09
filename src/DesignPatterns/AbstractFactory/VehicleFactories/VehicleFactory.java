package DesignPatterns.AbstractFactory.VehicleFactories;

import DesignPatterns.AbstractFactory.Vehicle;

public interface VehicleFactory {

    public Vehicle getVehicle(String vehicleName);

}
