package by.jonline.grow.algoritmization;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Decomposition6 {
    public static void main(String[] args) {

        int a = 4;
        int b = 56;
        int c = 2;

        if (nod(a, b, c) == 1) {

            System.out.println(true);

        } else {

            System.out.println(false);

        }

    }

    static int nod(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("нельзя вводить значения меньше нуля или нуль");
            return -1;
        }

        int nod = 1;
        int min;

        min = min(a, b, c);

        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;
            }
        }

        return nod;
    }

    static int min(int... arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;

    }


}
