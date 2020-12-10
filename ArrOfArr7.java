package by.jonline.grow.algoritmization;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 *
 *             i^2-j^2
 * A[i,j]=sin(--------)
 *                N
 *
 *  и подсчитать количество положительных элементов в ней.
 */

public class ArrOfArr7 {
    public static void main(String[] args) {

        int n = 4;
        double arr[][] = new double[n][n];
        int positive = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = Math.sin((double) (i * i - j * j) / n);
                if (arr[i][j] > 0){
                    positive++;

                }

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("positive = " + positive);

    }

}
