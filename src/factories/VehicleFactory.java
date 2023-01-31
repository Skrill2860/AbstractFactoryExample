package factories;

import vehicles.buses.Bus;
import vehicles.cars.Car;

public abstract class VehicleFactory {
    public abstract Car createCar();
    public abstract Bus createBus();
}
