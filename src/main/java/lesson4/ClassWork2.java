package lesson4;

import java.util.Random;

public class ClassWork2 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
                array[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int multOfDiagonal1 = 1;
        int multOfDiagonal2 = 1;

        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if (i == j){
                    multOfDiagonal1 = multOfDiagonal1 * array[i][j];
                }
            }
        }

        for (int i = 0; i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if (i == array[i].length - j - 1){
                    multOfDiagonal2 = multOfDiagonal2 * array[i][j];
                }
            }
        }

        System.out.println("Multiple of main diagonal: " + multOfDiagonal1);
        System.out.println("Multiple of secondary diagonal: " + multOfDiagonal2);

        if (multOfDiagonal1 > multOfDiagonal2){
            System.out.println("Multiplication of main diagonal is more than second diagonal");
        } else {
            System.out.println("Multiplication of second diagonal is more than main diagonal");
        }
    }
}
