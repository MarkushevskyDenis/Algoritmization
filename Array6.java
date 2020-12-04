package by.jonline.grow.algoritmization;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Array6 {
    public static void main(String[] args) {

        double[] N = {12.653, 3.12, .123, 63.13, .3241, 34.6763, -213.412, -213.2312, -452.4352};
        double sum = 0.0;
        boolean q = true;

        for (int i = 2; i < N.length; i++) {
            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    q = false;
                    break;
                }

            }

            if (q) {
                System.out.println(i);
                sum += N[i];
            }

            q = true;

        }

        System.out.println(sum);
    }
}
