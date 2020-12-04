package by.jonline.grow.algoritmization;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Decomposition7 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 9; i += 2) {
            sum += fact(i);
        }

        System.out.println(sum);

    }

    static int fact(int num) {

        int pr = 1;

        for (int i = 2; i <= num; i++) {
            pr *= i;
        }

        return pr;
    }

}
