package lesson2;

public class ClassWork6 {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        classWork6_2();
    }

    public static void classWork6_2() {
        int i = 0;
        while(i <= 4){
            int j = 0;
            while (j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        int k = 4;
        while(k >= 0){
            int l = 4;
            while(l > k){
                System.out.print("*");
                l--;
            }
            System.out.println();
            k--;
        }
    }
}
