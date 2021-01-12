package lesson3;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lesson3HomeWork {
    public static void main(String[] args) {
        /*System.out.println("Task1: ");
        task1();
        System.out.println();
        System.out.println("Task2: ");
        task2();
        System.out.println();
        System.out.println("Task3: ");
        task3();
        System.out.println();
        System.out.println("Task4: ");
        task4();
        System.out.println();
        System.out.println("Task5: ");
        task5();
        System.out.println();
        System.out.println("Task6: ");
        task6();
        System.out.println();
        System.out.println("Task7: ");
        task7();
        System.out.println();
        System.out.println("Task8: ");
        task8();
        task9();*/
    }

    public static void task1() {
        int[] array = new int[10];
        int counter = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                array[counter] = i;
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }
    }

    public static void task2() {
        // вопрос: если не инициализировать int counter = 0, почему 0 не присваивается по умолчанию?
        int amountOfNumbers = 0;
        int counter = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                amountOfNumbers++;
            }
        }

        int[] array = new int[amountOfNumbers];
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                array[counter] = i;
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }

    }

    public static void task3() {
        int[] array = new int[15];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = " + array[i] + " ");
        }

        System.out.println();
        int countOfEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNumbers++;
            }
        }
        System.out.println("Count of even numbers: " + countOfEvenNumbers);
    }

    public static void task4() {
        int[] array = new int[20];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(21);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                array[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void task5() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random rnd = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(16);
            array2[i] = rnd.nextInt(16);
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }

        double average1 = 0;
        double average2 = 0;
        for (int i = 0; i < array1.length; i++) {
            average1 = average1 + array1[i];
            average2 = average2 + array2[i];
        }
        average1 = average1 / array1.length;
        average2 = average2 / array2.length;

        System.out.println();
        if (average1 > average2) {
            System.out.println("Average of array 1: " + average1 + " > Average of array 2: " + average2);
        } else {
            System.out.println("Average of array 1: " + average1 + " < Average of array 2: " + average2);
        }
    }

    public static void task6() {
        int[] array = new int[4];
        int count = 0;
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11);
        }

        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] < array[j + 1]) {
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        if (count == array.length - 1) {
            System.out.println("Является строго возрастающей последовательностью");
        } else {
            System.out.println("Не является строго возрастающей последовательностью");
        }
    }

    public static void task7() {
        int[] array = new int[12];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(16);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("max= " + max);
        System.out.println("index= " + index);

    }

    public static void task8() {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        Random rnd = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = 1 + rnd.nextInt(9);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 1 + rnd.nextInt(9);
        }

        for (int i = 0; i < array3.length; i++) {
            array3[i] = (double) array1[i] / array2[i];
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            String formattedDouble = new DecimalFormat("#0.00").format(array3[i]);
            System.out.print(formattedDouble + ", ");
        }
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива(целове положительное число): ");
        int amount = sc.nextInt();
        int[] array = new int[amount];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(16);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < Math.floor((double) array.length / 2); i++) {
            sum1 = sum1 + array[i];
        }
        for (int i = array.length - 1; i >= Math.floor((double) array.length / 2); i--) {
            sum2 = sum2 + array[i];
        }

        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);

        if (sum1 == sum2){
            System.out.println("суммы половин массивов равны");
        } else if(sum1 > sum2){
            System.out.println("сумма левой половины массива больше правой");
        } else {
            System.out.println("сумма правой половины массива больше левой");
        }
    }
}
