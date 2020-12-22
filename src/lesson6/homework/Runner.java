package lesson6.homework;

import lesson6.homework.air.MilitaryAirTransport;
import lesson6.homework.air.СivilAirTransport;
import lesson6.homework.land.FreightLandTransport;
import lesson6.homework.land.PassengerLandTransport;

public class Runner {
    public static void main(String[] args) {
        double travelTime = 2.5;
        //легковая машина
        PassengerLandTransport passengerCar = new PassengerLandTransport(123,220,2100, Brands.RENAULT, 4,10, "Sedan", 6);
        //грузовая машина
        FreightLandTransport freightCar = new FreightLandTransport(500,120,10000, Brands.BELAZ, 8,50, 10000);
        //Гражданский воздушный транспорт
        СivilAirTransport civilAirTransport = new СivilAirTransport(700, 933,183500, Brands.BOEING,320,true);
        // Военный воздушный транспорт
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(1500,1500, 20000, Brands.LOCKHEED, true, 10);


        System.out.println(passengerCar.printWorkResults(travelTime));
        freightCar.isItPossibleToLoadCargo(9000);
        civilAirTransport.isFullOfPassengers(322);
        militaryAirTransport.shoot();
        militaryAirTransport.catapulte();
    }
}
