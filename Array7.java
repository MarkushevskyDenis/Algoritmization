package by.jonline.grow.algoritmization;

/**
 *  Даны действительные числа a 1, a2 ,..., an . Найти
 * max( a 1 + a2n , a2 + a2n −1, ... , an + an +1 ) .
 */

public class Array7 {
    public static void main(String[] args) {

        int N = 10;
        int max;
        int sum;

        max = a(1) + a(2 * N);

        for (int n = 2; n <= N; n++) {

            sum = a(n) + a(2 * N - n + 1);

            if (sum > max) {
                max = sum;
            }

        }

        System.out.println(max);

    }

    static int a(int n) {
        return (int) (n * Math.pow(-1, n));
    }

}

