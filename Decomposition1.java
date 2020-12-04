package by.jonline.grow.algoritmization;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 *
 *                   А * В
 * НОК ( А , В) = ------------
 *                НОД ( А , В)
 *
 */

public class Decomposition1 {

    public static void main(String[] args) {

        int a=0;
        int b=0;

        System.out.println("нок - " + nok(a, b) + "; нод - " + nod(a, b));
    }

    static int nod(int a, int b) {

        if(a<=0||b<=0){
            System.out.println("нельзя вводить значения меньше нуля или нуль");
            return -1;
        }

        int nod = 1;
        int min = a;

        if (a > b) {
            min = b;
        }

        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) nod = i;
        }

        return nod;
    }

    static int nok(int a, int b){

        if(a<=0||b<=0){
            System.out.println("нельзя вводить значения меньше нуля или нуль");
            return -1;
        }

       return a * b / nod(a, b);
    }
}
