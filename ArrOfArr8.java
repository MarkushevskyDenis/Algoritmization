package by.jonline.grow.algoritmization;

import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class ArrOfArr8 {
    public static void main(String[] args) {

        int a;
        int b;
        int[][] arr = {{1, 2, 3, 10}, {6, 7, 8, 9}, {1, 5, 7, 8}};

        int swap;

        do {
            a = in("введите первый столбец");
        } while (a < 0 || a >= arr[0].length);

        do {
            b = in("введите второй столбец");
        } while (b < 0 || b >= arr[0].length);

        for (int i = 0; i < arr.length; i++) {
            swap = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = swap;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int in(String str) {

        Scanner read = new Scanner(System.in);

        System.out.println(str);
        while (!read.hasNextInt()) {
            System.out.println("ошибка ввода");
            read.next();
        }

        return read.nextInt();
    }

}
