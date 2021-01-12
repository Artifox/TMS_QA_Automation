package lesson2;

public class ClassWork1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 99){
            if ((count % 2) != 0){
                sum = sum + count;
            }
            count++;
        }
        System.out.println("Sum = " + sum);
    }
}
