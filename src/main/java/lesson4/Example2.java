package lesson4;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random rnd = new Random();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == array[i].length - j - 1){
                    max = array[i][j];
                }
            }
            System.out.println();
        }
    }
}
