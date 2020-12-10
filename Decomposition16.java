package by.jonline.grow.algoritmization;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Decomposition16 {
    public static void main(String[] args) {

        int n = 2;
        int sum = 0;
        int[] arr;

        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

            arr = toArray(i);

            if (countOddDigits(arr) == n) {
                sum += i;
            }

        }

        System.out.println("сумма: " + sum);
        System.out.println("число четных цифр: " + (count(sum) - countOddDigits(toArray(sum))));
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

    static int countOddDigits(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

}
