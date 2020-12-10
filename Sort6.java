package by.jonline.grow.algoritmization;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента a i и ai +1 . Если a i <= a i+ 1 , то продвигаются
 * на один элемент вперед. Если ai > ai+ 1 , то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */

public class Sort6 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 41, -8, 1, 24, 5, 234, -12};
        int swap;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                swap = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = swap;

                if (i != 0) {
                    i -= 2;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

