package by.jonline.grow.algoritmization;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Decomposition17 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(raznost(num));
    }

    static int raznost(int num) {
        int sum;
        int[] arr;
        int count = 0;

        arr = toArray(num);
        sum = sum(arr);

        while (num != 0) {
            num -= sum;
            arr = toArray(num);
            sum = sum(arr);
            count++;
        }

        return count;

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

