package by.jonline.grow.algoritmization;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */

public class Decomposition10 {

    public static void main(String[] args) {

        int num = 123441;
        int i = 0;
        int n[] = new int[12];

        do {
            i++;
        } while (num / (int) Math.pow(10, i) != 0);

        for (; i > 0; i--) {
            num = num - n[i + 1] * (int) Math.pow(10, i);
            int b = (int) Math.pow(10, i - 1);
            n[i] = num / b;
        }

        for (int j = first(n); j > 0; j--) System.out.println(n[j]);

    }

    static int first(int arr[]) {
        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] != 0) return j;
        }
        return 1;
    }//возвращает индекс первой цифры

}


