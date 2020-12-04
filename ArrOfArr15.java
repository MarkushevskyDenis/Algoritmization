package by.jonline.grow.algoritmization;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class ArrOfArr15 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 10}, {6, 7, 8, 9}, {1, 5, 7, 8}};
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max){
                    max = arr[i][j];
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 != 0){
                    arr[i][j] = max;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}