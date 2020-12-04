package by.jonline.grow.algoritmization;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class ArrOfArr3 {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3, 10}, {6, 7, 8, 9}, {1, 5, 7, 8}};
        int k = 2;
        int p = 2;

        for (int j = 0; j < a[0].length; j++)
            System.out.print(a[k][j] + " ");

        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][p]);
        }

    }
}

