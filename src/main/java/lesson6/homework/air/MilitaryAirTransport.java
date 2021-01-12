package lesson6.homework.air;

import lesson6.homework.Brands;

public class MilitaryAirTransport extends AirTransport {
    private boolean isСatapultPresence;
    private int amountOfRockets;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, Brands brand, boolean isСatapultPresence, int amountOfRockets) {
        super(power, maxSpeed, weight, brand);
        this.isСatapultPresence = isСatapultPresence;
        this.amountOfRockets = amountOfRockets;
    }

    public void shoot(){
        if (this.amountOfRockets >= 0){
            System.out.println("Рокета пошла!");
        } else if (amountOfRockets <= 0){
            System.out.println("Боеприпасы отсутствуют!");
        }
    }

    public void catapulte(){
        if (isСatapultPresence){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы!");
        }
    }
}
