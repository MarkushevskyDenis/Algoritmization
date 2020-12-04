package by.jonline.grow.algoritmization;

import java.util.Arrays;

/**
 * Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm . Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Sort2 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int arr1[] = {4, 8, 10, 11, 24, 25, 26, 27, 28, 29, 30};
        int size = arr.length;

        arr = Arrays.copyOf(arr, arr.length + arr1.length);
        System.arraycopy(arr1, 0, arr, size, arr1.length);

        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int... arr) {
        int i = 1;
        int j = 2;
        int t;

        while (i < arr.length) {

            if (arr[i - 1] > arr[i]) {
                t = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = t;

                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            } else {
                i = j;
                j++;
            }

        }
    }

}
