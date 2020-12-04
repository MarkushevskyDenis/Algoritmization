package by.jonline.grow.algoritmization;

/**
 * Дана последовательность действительных чисел а 1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */

public class Array2 {
    public static void main(String[] args) {

        int z = 10;
        double[] a = {1, 32.43, 12.53, 12.563, 21, 356, 12, 54.32, 0};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
            System.out.print(a[i] + " ");
        }

        System.out.println("число замен" + count);
    }

}
