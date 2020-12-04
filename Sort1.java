package by.jonline.grow.algoritmization;

import java.util.Arrays;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

public class Sort1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int arr1[] = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int k=5;
        int size = arr.length;
        int swap;

        arr = Arrays.copyOf(arr, arr.length + arr1.length);
        System.arraycopy(arr1, 0, arr, size, arr1.length);

        for (int j = 0; j < arr.length - size; j++)
            for (int i = size + j; i > k + j + 1; i--) {
                swap = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = swap;
            }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

