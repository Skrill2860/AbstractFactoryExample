import factories.GermanFactory;
import factories.RussianFactory;
import factories.VehicleFactory;
import vehicles.buses.Bus;
import vehicles.cars.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory;
        // Read the name of the factory country from the console
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        // Create an object of the required factory class
        if ("germany".equalsIgnoreCase(country)) {
            vehicleFactory = new GermanFactory();
        } else if ("russia".equalsIgnoreCase(country)) {
            vehicleFactory = new RussianFactory();
        } else {
            System.out.println("Unknown country");
            return;
        }
        Car car = vehicleFactory.createCar();
        Bus bus = vehicleFactory.createBus();
        // Print the information about the created objects
        System.out.println(car);
        System.out.println(bus);
    }
}