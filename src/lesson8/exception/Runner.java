package lesson8.exception;

public class Runner {
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        return 10 / 0;
    }
}
