package by.jonline.grow.algoritmization;

/**
 *  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class ArrOfArr12 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 0, 10}, {8, 7, 1, 9}, {1, 9, 3, 8}};

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                sort(-1, arr[i]);                //k==1 по убыванию; k==1 по возрастанию

            } else {

                sort(1, arr[i]);

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }

    static void sort(int k, int... arr) {
        int i = 1;
        int j = 2;
        int t;

        while (i < arr.length) {

            if (k * arr[i - 1] > k * arr[i]) {
                t = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = t;

                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            } else {
                i = j;
                j++;
            }

        }
    }
}
