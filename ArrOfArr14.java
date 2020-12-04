package by.jonline.grow.algoritmization;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class ArrOfArr14 {
    public static void main(String[] args) {

        int m = 5;
        int n = 3;

        int arr[][] = new int[m][n];
        int count = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {

                if (j >= m - i + count) {
                    arr[i][j] = 1;
                    continue;
                }

                if (count >= j) {
                    break;
                }

                arr[i][j] = (int) (Math.random() * 2);
                if (arr[i][j] == 1) {
                    count++;
                }

            }
            count = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

