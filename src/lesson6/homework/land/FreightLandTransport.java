package lesson6.homework.land;

import lesson6.homework.Brands;

public class FreightLandTransport extends LandTransport {
    private int liftingCapacity;

    public FreightLandTransport(int power, int maxSpeed, int weight, Brands brand, int amountOfWheels, int fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public void isItPossibleToLoadCargo(int liftingCapacity){
        if (liftingCapacity > this.liftingCapacity){
            System.out.println("Вам нужен грузовик побольше!");
        } else {
            System.out.println("Грузовик загружен!");
        }
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Lifting capacity: " + liftingCapacity);
    }
}
