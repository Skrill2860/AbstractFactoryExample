package factories;

import vehicles.buses.Bus;
import vehicles.buses.MercedesSprinter;
import vehicles.cars.Car;
import vehicles.cars.MercedesGLC;

public class GermanFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new MercedesGLC(250, 5000000);
    }

    @Override
    public Bus createBus() {
        return new MercedesSprinter(150, 8, 10000000);
    }
}
