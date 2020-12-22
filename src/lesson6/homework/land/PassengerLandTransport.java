package lesson6.homework.land;

import lesson6.homework.Brands;

public class PassengerLandTransport extends LandTransport {
    private String typeOfBody;
    private int amountOfPassengers;

    public PassengerLandTransport(int power, int maxSpeed, int weight, Brands brand, int amountOfWheels, int fuelConsumption, String typeOfBody, int amountOfPassengers){
        super(power, maxSpeed, weight, brand, amountOfWheels, fuelConsumption);
        this.typeOfBody = typeOfBody;
        this.amountOfPassengers = amountOfPassengers;
    }


    public String printWorkResults(double time){
        //дистанция, которую проедет авто с макс скоростью за определенное время
        double distance = this.maxSpeed * time;
        //расход бензина
        double actualFuelConsumption = actualFuelConsumption(distance);
        return "За время " + time + ", автомобиль " + brand +" двигаясь с максимальной скоростью " + maxSpeed + "км/ч проедет " + distance + "км и израсходует " +
                actualFuelConsumption + " литров топлива.";
    }

    private double actualFuelConsumption(double distance){
        return (fuelConsumption * distance) / 100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type of body: " + typeOfBody);
        System.out.println("Amount of passengers: " + amountOfPassengers);
    }
}
