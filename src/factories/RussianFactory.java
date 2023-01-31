package factories;

import vehicles.buses.Bus;
import vehicles.buses.GAZelle;
import vehicles.cars.Car;
import vehicles.cars.LadaGranta;

public class RussianFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new LadaGranta(160, 300000);
    }

    @Override
    public Bus createBus() {
        return new GAZelle(120, 30, 2000000);
    }
}
