package by.jonline.grow.algoritmization;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */

public class Decomposition13 {
    public static void main(String[] args) {

        int n = 40;

        for (int i = n; i <= 2 * n; i++) {

            if (!primeNum(i)) {
                continue;
            }

            if (primeNum(i + 2)) {
                System.out.println(i + " - " + (i + 2));
            }

        }

    }

    static boolean primeNum(int num) {

        for (int j = 2; j <= num / j; j++) {
            if (num % j == 0) {
                return false;
            }
        }

        return true;

    }
}
