package by.jonline.grow.algoritmization;

/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class ArrOfArr9 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 10}, {6, 7, 8, 9}, {1, 5, 7, 8}};
        int sum[] = new int[arr[0].length];
        int max;
        int maxInd;

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sum[j] += arr[i][j];
            }
        }

        max = sum[0];
        maxInd = 0;

        for (int i = 1; i < sum.length; i++)
            if (sum[i] > max) {
                max = sum[i];
                maxInd = i;
            }

        System.out.println(max + " ind = " + maxInd);
    }
}

