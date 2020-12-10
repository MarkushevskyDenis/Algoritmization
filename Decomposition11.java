package by.jonline.grow.algoritmization;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Decomposition11 {
    public static void main(String[] args) {

        int num = 453244;
        int num1 = 1244576333;
        int length;
        int length1;

        length = count(num);
        length1 = count(num1);

        if (length == length1){
            System.out.println("==");
        }
        else if (length > length1){
            System.out.println("length>length1");
        }
        else{
            System.out.println("length<length1");
        }
    }

    static int count(int num){

        int i = 0;

        do {
            i++;
        } while (num / (int) Math.pow(10, i) != 0);

        return i;

    }

}

