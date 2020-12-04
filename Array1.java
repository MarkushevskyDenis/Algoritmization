package by.jonline.grow.algoritmization;

/**
 *  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Array1 {

    public static void main(String[] args) {

        int k = 4;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % k == 0){
                sum += a[i];
            }

        }

        System.out.println(sum);
    }
}
