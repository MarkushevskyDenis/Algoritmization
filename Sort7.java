package by.jonline.grow.algoritmization;

/**
 * Пусть даны две неубывающие последовательности действительных чисел a 1 <= a2 <= ... <= an и b 1 <= b2 <= ... <= bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b 1 <= b2 <= ... <= b m в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Sort7 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int arr1[] = {4, 8, 10, 11, 24, 25, 26, 27, 28, 29, 30};
        int ind;

        System.out.println("arr <----- arr1");

        for (int i = 0; i < arr1.length; i++) {
            ind = binSearch(arr, 0, arr.length, arr1[i]);
            System.out.println(ind + "-" + (ind + 1) + " <----- " + i);
        }

    }

    static int binSearch(int arr[], int left, int length, int key) {
        int k;

        if (length == 0) {
            return left;
        }

        if (key < arr[length / 2 + left]) {

            if (length / 2 == 0) {
                return left;
            }

            k = binSearch(arr, left, length / 2, key);

        } else if (key > arr[length / 2 + left]) {

            if (length / 2 == 0) {
                return left + length;
            }

            k = binSearch(arr, left + length / 2 + 1, length - length / 2 - 1, key);

        } else {
            return length / 2 + left;
        }

        return k;
    }

}
