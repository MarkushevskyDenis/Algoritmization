package by.jonline.grow.algoritmization;

/**
 *  Сортировка вставками. Дана последовательность чисел a 1 , a2 ,... , an . Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a 1, a2 ,..., ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <= ... <= an . Берется следующее число ai +1 и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Sort5 {
    public static void main(String[] args) {

        int arr[] = {-10,10,100,0,-45};
        int ind;
        int swap;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                ind = binSearch(arr, 0, i + 1, arr[i + 1]);

                for (int j = i + 1; j > ind; j--) {
                    swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int binSearch(int arr[], int left, int length, int key) {
        int k;

        if (length == 0) {
            return left;
        }

        if (key < arr[length / 2 + left]) {

            if (length / 2 == 0) {
                return left;
            }

            k = binSearch(arr, left, length / 2, key);

        } else if (key > arr[length / 2 + left]) {

            if (length / 2 == 0) {
                return left + length;
            }

            k = binSearch(arr, left + length / 2 + 1, length - length / 2 - 1, key);

        } else {
            return length / 2 + left;
        }

        return k;
    }

}

