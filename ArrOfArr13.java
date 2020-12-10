package by.jonline.grow.algoritmization;

/**
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class ArrOfArr13 {
    public static void main(String[] args) {           //сначала транспонируется матрица, затем сортируется строка и после матрица снова транспонируется

        int[][] arr = {{1, 2, 3, 10}, {6, 7, 8, 9}, {1, 5, 7, 8}};


        arr = transp(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sort(-1, arr[i]);                //k==1 по убыванию; k==1 по возрастанию
            } else {
                sort(1, arr[i]);
            }
        }

        arr = transp(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }


    static int[][] transp(int[][] arr) {

        int[][] swap = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                swap[j][i] = arr[i][j];
            }
        }
        return swap;
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
