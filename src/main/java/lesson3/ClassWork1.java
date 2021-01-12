package lesson3;

public class ClassWork1 {
    public static void main(String[] args) {
        /*int[] arr1 = new int[10];

        //заполняю массив
        int b = -1;
        for (int i = 1; i < 21; i++) {
            if ( i % 2 == 0){
                arr1[++b] = i;
            }
        }
        System.out.println(arr1[9]);

        for (int el : arr1) {
            System.out.print(el + " ");
        }

        System.out.println();

        for (int el1 : arr1) {
            System.out.println(el1);
        }
        System.out.println();*/

        //решение препродавателя
        int[] ar = new int[10];

        int j = 0;
        for (int i = 2; i <=20; i++){
            if (i % 2 == 0){
                ar[j] = i;
                j++;
            }
        }

        for (int elem : ar){
            System.out.print(elem + " ");
        }
    }
}
