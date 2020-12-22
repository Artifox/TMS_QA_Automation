package lesson6.homework.air;

import lesson6.homework.Brands;

public class СivilAirTransport extends AirTransport {
    private int amountOfPassengers;
    private boolean isBusinessClassPresence;

    public СivilAirTransport(int power, int maxSpeed, int weight, Brands brand, int amountOfPassengers, boolean isBusinessClassPresence) {
        super(power, maxSpeed, weight, brand);
        this.amountOfPassengers = amountOfPassengers;
        this.isBusinessClassPresence = isBusinessClassPresence;
    }

    public void isFullOfPassengers(int amountOfPassengers){
        if (amountOfPassengers > this.amountOfPassengers){
            System.out.println("Нужен самолет побольше!");
        } else {
            System.out.println("Самолет заполнен!");
        }
    }
}
