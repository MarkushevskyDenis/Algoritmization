package by.jonline.grow.algoritmization;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *  1   1  1 ... 1 1 1
 *  2   2  2 ... 2 2 0
 *  3   3  3 ... 3 0 0
 *  .   .  . ... . . .
 *  .   .  . ... . . .
 *  .   .  . ... . . .
 * n-1 n-1 0 ... 0 0 0
 *  n   0  0 ... 0 0 0
 */

public class ArrOfArr5 {
    public static void main(String[] args) {
        int n = 7;
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                arr[i][j] = i + 1;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}

