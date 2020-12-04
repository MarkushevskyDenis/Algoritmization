package by.jonline.grow.algoritmization;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Decomposition16 {
    public static void main(String[] args) {

        int n = 2;
        int sum;
        int count;

        sum = sum(n);
        count = evenNum(sum);

        System.out.println(sum);
        System.out.println(count);
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

    static int sum(int n) {

        int arr[];
        boolean q = true;
        int sum = 0;

        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

            arr = numInArr(i);

            int max = last(arr);
            for (int j = 1; j <= max; j++) {
                if (arr[j] % 2 == 0) {
                    q = false;
                    break;
                }
            }

            if (q) {
                System.out.println(arrInNum(arr));
                sum += arrInNum(arr);
            }
            q = true;

        }

        return sum;
    }

    static int evenNum(int num) {

        int[] arr = numInArr(num);
        int max;
        int count = 0;

        max = last(arr);

        for (int j = 1; j <= max; j++) {
            if (arr[j] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

}
