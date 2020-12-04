package by.jonline.grow.algoritmization;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Decomposition17 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(raznost(num, numInArr(num), 0));
    }

    static int raznost(int num, int arr[], int count) {
        int sum;

        sum = sum(1, last(arr), arr);
        num -= sum;
        count++;
        if (num == 0) return count;
        else count = raznost(num, numInArr(num), count);

        return count;

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

    static int last(int arr[]) {
        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] != 0) return j;
        }
        return 1;
    }

    static int sum(int k, int m, int arr[]) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += arr[i];
        }
        return sum;
    }

}

