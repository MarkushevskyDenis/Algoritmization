package by.jonline.grow.algoritmization;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Decomposition5 {
    public static void main(String[] args) {

        int[] arr = {-1000, -10, -2, 0, -10, 0, -10};
        int max;

        max = max(arr);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == max) {

                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }

            }
        }

        System.out.println(max(arr));

    }

    static int max(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
