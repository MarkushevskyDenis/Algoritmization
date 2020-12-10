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
        int[] res = new int[10];
        int sum;

        for (int i = 0, m = 0; i < n; i++) {

            arr = toArray(i);

            sum = sum(arr);

            if (sum == k) {
                res[m] = i;
                m++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    static int[] toArray(int num) {
        int count;
        int i = 0;
        int n[];

        count = count(num);
        n = new int[count];

        for (; count > 0; count--) {
            if (i != 0) {
                num = num - n[i - 1] * (int) Math.pow(10, count);
            }
            n[i] = num / ((int) Math.pow(10, count - 1));
            i++;
        }

        return n;

    }

    static int count(int num) {
        int i = 0;

        do {
            i++;
        } while (num / (int) Math.pow(10, i) != 0);

        return i;

    }

    static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
