package by.jonline.grow.algoritmization;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Decomposition11 {
    public static void main(String[] args) {

        int num1 = 45324;
        int num = 12333;
        int length;
        int length1;

        length = first(numInArr(num));
        length1 = first(numInArr(num1));

        if (length == length1) System.out.println("==");
        else if (length > length1) System.out.println("length>length1");
        else System.out.println("length<length1");
    }

    static int[] numInArr(int num) {

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

        return n;

    }

    static int first(int arr[]) {
        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] != 0) return j;
        }
        return 1;
    }//возвращает индекс первой цифры

}

