package by.jonline.grow.algoritmization;

/**
 * Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an .Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai и ai +1 . Если ai > ai + 1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Sort4 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 41, -8, 1, 24, 5, 234, -12, 0, 5, 321, -41, 2, -1, 52, 4, 141};
        int swap;
        boolean q = true;

        while (q) {

            q = false;

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                    q = true;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

