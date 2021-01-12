package lesson4;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] array = new int[3][4];
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                array[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
