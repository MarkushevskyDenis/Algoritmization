package by.jonline.grow.algoritmization;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class ArrOfArr2 {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {6, 7, 8}, {1, 5, 7}};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][i]);
        }

    }
}
