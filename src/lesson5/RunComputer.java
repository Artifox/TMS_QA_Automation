package lesson5;

import java.util.Random;

public class RunComputer {
    public static void main(String[] args) {
        Computer computer = new Computer(2, 6248, 1000, false);
        Random rnd = new Random();

        //после 5 успешных запусков компьютер вырабатывает ресурс и сгорает
        System.out.println("1:");
        computer.turnOn(1);
        computer.turnOff(1);
        System.out.println();
        System.out.println("2:");
        computer.turnOn(1);
        computer.turnOff(1);
        System.out.println();
        System.out.println("3:");
        computer.turnOn(1);
        computer.turnOff(1);
        System.out.println();
        System.out.println("4:");
        computer.turnOn(1);
        computer.turnOff(1);
        System.out.println();
        System.out.println("5:");
        computer.turnOn(1);
        computer.turnOff(1);
        System.out.println();
        System.out.println("6:");
        computer.turnOn(1);
        computer.turnOff(1);

    }
}
