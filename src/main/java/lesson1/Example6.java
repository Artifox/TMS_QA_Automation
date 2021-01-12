package lesson1;

public class Example6 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        /*if(a + b <= c){
            System.out.println("Not exist");
        } else if (a + c <= b){
            System.out.println("Not exist");
        } else if (b + c <= a){
            System.out.println("Not Exist");
        } else {
            System.out.println("Exist");
        }*/

        if(a + b <= c || a + c <= b || b + c <= a ){
            System.out.println("Not Exist");
        } else {
            System.out.println("Exist");
        }
    }
}
