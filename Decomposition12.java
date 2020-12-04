package by.jonline.grow.algoritmization;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Decomposition12 {
    public static void main(String[] args) {

        int k = 10;
        int n = 100;

        int[] arr;
        int[] res = new int[n];
        int sum;

        for (int i = 0, m = 0; i < n; i++) {

            arr = numInArr(i);

            sum = sum(1, last(arr), arr);

            if (sum == k) {
                res[m] = arrInNum(arr);
                m++;
            }
        }

        for (int i = 0; i < res.length; i++) System.out.println(res[i]);
    }

    static int last(int arr[]) {
        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] != 0) return j;
        }
        return 1;
    }

    static int arrInNum(int arr[]) {
        int sum = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] * Math.pow(10, i - 1);
        }
        return sum;
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

    static int sum(int k, int m, int arr[]) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
