package by.jonline.grow.algoritmization;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */

public class Decomposition13 {
    public static void main(String[] args) {

        int n = 100;
        int primeNum;

        for (int i = n; i <= 2 * n; i++) {

            primeNum = primeNum(i);

            if (primeNum == -1) {
                continue;
            }

            if (primeNum(primeNum + 2) != -1) {
                System.out.println(primeNum + " - " + (primeNum + 2));
            }

        }

    }

    static int primeNum(int num) {
        boolean q;
        q = true;
        for (int j = 2; j <= num / j; j++) {
            if (num % j == 0) {
                q = false;
                break;
            }
        }
        if (q) return num;
        else return -1;

    }
}
