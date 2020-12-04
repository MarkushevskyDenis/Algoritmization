package by.jonline.grow.algoritmization;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Array5 {
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 7, 1, 3, 6, 2, 21, 65, -54, 0, -54, -6, 1, 32};

        for (int i = 0; i < a.length; i++) {

            if (a[i] > i) System.out.println(a[i]);

        }

    }
}
