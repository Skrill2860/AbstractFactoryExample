package vehicles.buses;

public abstract class Bus {
    private final String model;
    private final int speed;
    private final int maxPassengers;
    private final int price;

    public Bus(String model, int speed, int maxPassengers, int price) {
        this.model = model;
        this.speed = speed;
        this.maxPassengers = maxPassengers;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("Bus\nModel: %s\nSpeed: %d\nMax passengers: %d\nPrice: %d", model, speed, maxPassengers, price);
    }
}
