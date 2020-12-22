package lesson6.homework;

public class Transport {
    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected Brands brand;

    public Transport(int power, int maxSpeed, int weight, Brands brand){
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    protected double HorspowerToKw(int power){
        return power * 0.74;
    }

    public void printInfo(){
        System.out.println("Power: " + power);
        System.out.println("MaxSpeed: " + maxSpeed);
        System.out.println("Weight: " + weight);
        System.out.println("Brand: " + brand);
        System.out.println("Kw: " + HorspowerToKw(power));
    }
}
