package lesson3;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(100);
        System.out.println("i = " + i);

        int[] arrRnd = new int[5];
        for (int j = 0; j < arrRnd.length; j++) {
            arrRnd[j] = rnd.nextInt(100);
        }
         for(int k = 0; k < arrRnd.length;k++){
             System.out.print(arrRnd[k] + " ");
         }
    }
}
