package lesson3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int i = sc.nextInt();
        System.out.println("Number: " + i);

        int[] arr = new int[5];
        for (int j = 0; j < arr.length; j++){
            System.out.println("Input array element " + "[" + j + "]");
            arr[j] = sc.nextInt();
        }

        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
