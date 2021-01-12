package lesson2;

public class Example4 {
    public static void main(String[] args) {
        for (int a = 0; a < 10; a++){
            if (a == 5){
                //break;
                continue;
            }
            System.out.println("a = " + a);
        }
    }
}
