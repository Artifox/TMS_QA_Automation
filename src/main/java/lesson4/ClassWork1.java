package lesson4;

import java.util.Random;

public class ClassWork1 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random rnd = new Random();

        for (int i =0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = rnd.nextInt(11);
            }
        }

        for (int i =0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if ((i == j) && (array[i][j] % 2 == 0)){
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println();

        System.out.println("Sum: " + sum);
    }
}
