package by.jonline.grow.algoritmization;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Decomposition8 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 1, 3, 4, 2, 5, 6, 4, 3, 5, 10};

        System.out.println(sum(1, 3, arr));
        System.out.println(sum(3, 5, arr));
        System.out.println(sum(4, 6, arr));

    }

    static int sum(int k, int m, int arr[]) {

        int sum = 0;

        for (int i = k; i <= m; i++) {
            sum += arr[i];
        }

        return sum;

    }
}
