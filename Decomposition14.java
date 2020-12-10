package by.jonline.grow.algoritmization;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */

public class Decomposition14 {
    public static void main(String[] args) {

        int k = 10000;
        int arr[];
        int sum;

        for (int i = 1; i <= k; i++) {

            arr = toArray(i);

            sum = sum(arr);

            if (sum == i){
                System.out.println(i);
            }

        }
    }

    static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], arr.length);
        }
        return sum;
    }

    static int[] toArray(int num){
        int count;
        int i = 0;
        int n[];

        count = count(num);
        n = new int[count];

        for (; count > 0; count--) {
            if (i != 0) {
                num = num - n[i - 1] * (int) Math.pow(10, count);
            }
            int b = (int) Math.pow(10, count - 1);
            n[i] = num / b;
            i++;
        }

        return n;

    }

    static int count(int num){
        int i = 0;

        do {
            i++;
        } while (num / (int) Math.pow(10, i) != 0);

        return i;

    }
}
