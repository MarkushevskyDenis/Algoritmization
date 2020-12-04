package by.jonline.grow.algoritmization;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */

public class Array9 {
    public static void main(String[] args) {

        int[] a = {1, 34, 123, 45, 12321, 324, 123,1, 1, 1, 1, 1, 1, 3, 21, 3, 1, 1, 1, 1, 3, 24, 35, 3, 43, 5, 3, 4, 3, 4, 3, 3, 3, 3, 3};
        int[] count = new int[a.length];
        int maxOfCount;
        int minOfNum;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    count[i]++;
                }

            }
        }

        maxOfCount = count[0];

        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxOfCount) {
                maxOfCount = count[i];
            }
        }

        minOfNum = a[a.length - 1];

        for (int i = 0; i < a.length - 1; i++) {
            if (count[i] == maxOfCount) {
                if (a[i] < minOfNum) {

                    minOfNum = a[i];

                }
            }
        }

        System.out.println(minOfNum);

    }

}

