package by.jonline.grow.algoritmization;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Decomposition2 {
    public static void main(String[] args) {

        int a = 10000;
        int b = 333;
        int c = 313;
        int d = 1123;


        System.out.println("нод - " + nod(a, b, c, d));

    }

    static int nod(int a, int b, int c, int d) {

        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            System.out.println("нельзя вводить значения меньше нуля или нуль");
            return -1;
        }

        int nod = 1;
        int min;

        min = min(a, b, c, d);
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
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
