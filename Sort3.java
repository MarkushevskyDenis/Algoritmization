package by.jonline.grow.algoritmization;

/**
 * Сортировка выбором. Дана последовательность чисел a 1 <= a2 <= ... <= an .Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

public class Sort3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int max;
        int maxInd;

        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            maxInd = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxInd = j;
                }
            }

            arr[maxInd] = arr[i];
            arr[i] = max;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}

