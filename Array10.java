package by.jonline.grow.algoritmization;

/**
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Array10 {
    public static void main(String[] args) {

        int[] a = {1, 24, 4, 21, 44, 6, 1, 3, 4, 5, 2, 31, 3, 41, 43, 41, 32, 4};
        boolean q = false;

        out(a);

        for (int i = 1; i < a.length; i++) {

            if (i % 2 != 0 && q == false) {

                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }

                a[a.length - 1] = 0;
                q = true;

            }

            if (i % 2 == 0 && q == true) {

                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }

                q = false;

            }

        }

        out(a);

    }

    static void out(int[] arr) {

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

