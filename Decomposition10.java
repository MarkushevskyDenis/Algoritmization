package by.jonline.grow.algoritmization;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */

public class Decomposition10 {

    public static void main(String[] args) {

        int num = 539;
        int n[];

        n = toArray(num);

        for (int j = 0; j < n.length; j++){
            System.out.println(n[j]);
        }

    }

    static int[] toArray(int num){
        int count;
        int i = 0;
        int n[];

        count = count(num);
        n = new int[count];

        for (; count > 0; count--) {
            if (i != 0) {
                num = num - n[i - 1] * (int) Math.pow(10, count);
            }
            int b = (int) Math.pow(10, count - 1);
            n[i] = num / b;
            i++;
        }

        return n;

    }

    static int count(int num){
        int i = 0;

        do {
            i++;
        } while (num / (int) Math.pow(10, i) != 0);

        return i;

    }
}


