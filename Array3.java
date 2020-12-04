package by.jonline.grow.algoritmization;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

public class Array3 {
    public static void main(String[] args) {

        double[] a = {2.1, 123, 0, 0, -12, -3.8, 0.9, 234, -25};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > 0) {

                positive++;

            } else if (a[i] < 0) {

                negative++;

            } else {

                zero++;

            }
        }

        System.out.println(positive + " - +; " + negative + " - -; " + zero + " - 0.");
    }

}

