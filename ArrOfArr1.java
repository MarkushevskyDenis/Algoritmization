package by.jonline.grow.algoritmization;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class ArrOfArr1 {
    public static void main(String[] args) {

        int[][] a = {{2, 8, 8, 10}, {6, 7, 8, 9}, {1, 5, 7, 8}};

        for (int j = 0; j < a[0].length; j++) {

            if (j % 2 == 0) {
                if (a[0][j] > a[a.length - 1][j]) {

                    for (int k = 0; k < a.length; k++) {
                        System.out.println(a[k][j]);
                    }

                }
            }

        }
    }
}
