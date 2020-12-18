package lesson6.homework.land;

import lesson6.homework.Brands;
import lesson6.homework.Transport;

public class LandTransport extends Transport {
    protected int amountOfWheels;
    protected int fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, Brands brand, int amountOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Amount of wheels: " + amountOfWheels);
        System.out.println("Fuel consumption: " + fuelConsumption);
    }
}
