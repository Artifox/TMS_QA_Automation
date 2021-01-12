package lesson6.homework.air;

import lesson6.homework.Brands;
import lesson6.homework.Transport;

public class AirTransport extends Transport {
    private int wingspan;
    private int minRunwaySize;

    public AirTransport(int power, int maxSpeed, int weight, Brands brand) {
        super(power, maxSpeed, weight, brand);
    }
}
