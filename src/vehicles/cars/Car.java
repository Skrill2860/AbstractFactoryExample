package vehicles.cars;

public abstract class Car {
    private final String model;
    private final int speed;
    private final int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("Car\nModel: %s\nSpeed: %d\nPrice: %d", model, speed, price);
    }
}
