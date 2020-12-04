package by.jonline.grow.algoritmization;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Array4 {
    public static void main(String[] args) {

        double[] a = {123, 435.42, 14.352, -123, 0, 123.324, 56.34, -2343.324, 0};
        double min = a[0];
        double max = a[0];
        double swap;

        int min_ind = 0;
        int max_ind = 0;


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
                max_ind = i;
                continue;
            }

            if (a[i] < min) {
                min = a[i];
                min_ind = i;
            }

        }

        swap = a[min_ind];
        a[min_ind] = a[max_ind];
        a[max_ind] = swap;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}

