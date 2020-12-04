package by.jonline.grow.algoritmization;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */

public class Decomposition14 {
    public static void main(String[] args) {

        int k = 1000;
        int arr[];
        int sum;

        for (int i = 1, j; i <= k; i++) {

            arr = numInArr(i);
            j = last(arr);
            sum = sum(1, j, arr, j);

            if (sum == i) System.out.println(i);
        }
    }

    static int sum(int k, int m, int arr[], int e) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += Math.pow(arr[i], e);
        }
        return sum;
    }

    static int last(int arr[]) {
        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] != 0) return j;
        }
        return 1;
    }

    static int[] numInArr(int num) {

        int i = 0;
        int n[] = new int[12];

        do {
            i++;
        } while (num / (int) Math.pow(10, i) != 0);

        for (; i > 0; i--) {
            num = num - n[i + 1] * (int) Math.pow(10, i);
            int b = (int) Math.pow(10, i - 1);
            n[i] = num / b;
        }

        return n;

    }

}
