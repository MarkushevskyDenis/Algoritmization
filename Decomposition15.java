package by.jonline.grow.algoritmization;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Decomposition15 {
    public static void main(String[] args) {

        int n = 4;
        int[] arr;
        boolean q = true;

        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

            arr = toArray(i);

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] + 1 != arr[j + 1] ) {
                    q = false;
                    break;
                }
            }

            if (q) {
                System.out.println(i);
            }
            q = true;

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


}
