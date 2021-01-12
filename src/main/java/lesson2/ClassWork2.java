package lesson2;

public class ClassWork2 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;

        while (counter <= 256) {
            sum+=counter;
            counter*=2;
        }
        System.out.println("Sum = " + sum);
    }
}
