package by.jonline.grow.algoritmization;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Decomposition2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 0;


        System.out.println("нод - " + nod(a, b, c, d));

    }

    static int nod(int a, int b, int c, int d) {

        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            System.out.println("нельзя вводить значения меньше нуля или нуль");
            return -1;
        }

        int nod = 1;

        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) nod = i;
        }

        return nod;

    }

}
