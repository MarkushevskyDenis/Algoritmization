package by.jonline.grow.algoritmization;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class ArrOfArr10 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 10}, {6, 7, 8, 9}, {1, 5, -7, 8}};
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) System.out.println(arr[i][i]);
        }

    }
}
