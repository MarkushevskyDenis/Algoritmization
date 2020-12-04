package by.jonline.grow.algoritmization;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1 1 1 ... 1 1 1
 * 0 1 1 ... 1 1 0
 * 0 0 1 ... 1 0 0
 * . . . .   . . .
 * . . .  .  . . .
 * . . .    .. . .
 * 0 1 1 ... 1 1 0
 * 1 1 1 ... 1 1 1
 */
public class ArrOfArr6 {
    public static void main(String[] args) {

        int n = 7;
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            if (i < n / 2) {

                for (int j = i; j < n - i; j++) {
                    arr[i][j] = 1;
                }

            } else {

                for (int j = n - i - 1; j < i + 1; j++) {
                    arr[i][j] = 1;
                }

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
