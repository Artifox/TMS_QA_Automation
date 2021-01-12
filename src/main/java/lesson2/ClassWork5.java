package lesson2;

public class ClassWork5 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
            //a = a + a;
        }
        System.out.println("Result:" + result);
    }
}
