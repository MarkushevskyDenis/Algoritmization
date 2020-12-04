package by.jonline.grow.algoritmization;

/**
 * Дана последовательность целых чисел a 1 , a2 ,..., an . Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min( a 1 , a2 ,..., an ) .
 */

public class Array8 {
    public static void main(String[] args) {

        int[] a = {1, 5, 1, 2, 5, 671, 2, 53, 6, 1, 45, 8, 1, 2, 1, 1, 1, 7, 4, 2, 1, 3, 34};
        int[] result;
        int min = a[0];
        int length = a.length;

        out(a);

        for (int i = 0; i < length; i++) {

            if (a[i] < min) {
                min = a[i];
            }

        }

        for (int i = 0; i < length; i++) {

            if (a[i] == min) {

                for (int j = i; j < length - 1; j++) {
                    a[j] = a[j + 1];
                }

                length--;
                i--;

            }

        }

        result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[i];
        }

        out(result);

    }

    static void out(int[] arr) {

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
