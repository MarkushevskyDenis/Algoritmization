package by.jonline.grow.algoritmization;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class ArrOfArr11 {
    public static void main(String[] args) {

        int arr[][] = new int[10][20];
        int count[] = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {

                arr[i][j] = (int) (Math.random() * 16);

                if (arr[i][j] == 5){
                    count[i]++;
                }

            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {

            if (count[i] >= 3) {
                System.out.println(i);
            }

        }

    }
}
