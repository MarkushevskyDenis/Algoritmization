package by.jonline.grow.algoritmization;

/**
 *            p1 p2       pn
 * Даны дроби -, -, ... , - ( p i , qi - натуральные). Составить программу, которая приводит эти дроби к общему
 *            q1 q2      qn
 * знаменателю и упорядочивает их в порядке возрастания.
 */

public class Sort8 {
    public static void main(String[] args) {

        int numerator[] =   {1, 5, -12};
        int denominator[] = {1, 4,   1};
        int copy;
        int pr = 1;
        int sum = 0;

        for (int i = 0; i < numerator.length; i++) {

            copy = numerator[i];

            for (int j = 0; j < denominator.length; j++) {
                if (i != j) {
                    numerator[i] *= denominator[j];
                }
            }
            sum += numerator[i];

            numerator[i] = copy;

            pr *= denominator[i];
        }

        System.out.println(sum + "\n-------\n" + pr);

        sort(numerator, denominator);

        for (int i = 0; i < numerator.length; i++) {
            System.out.println(numerator[i] + "\n-\n" + denominator[i] + "\n");
        }

    }

    static void sort(int num[], int denom[]) {
        int i = 1;
        int j = 2;
        int t;

        while (i < num.length) {

            if (num[i - 1] * denom[i] - num[i] * denom[i - 1] > 0) {

                t = num[i - 1];
                num[i - 1] = num[i];
                num[i] = t;

                t = denom[i - 1];
                denom[i - 1] = denom[i];
                denom[i] = t;

                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            } else {
                i = j;
                j++;
            }

        }
    }

}

