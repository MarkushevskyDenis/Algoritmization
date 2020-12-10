package by.jonline.grow.algoritmization;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Decomposition4 {
    public static void main(String[] args) {

        int x[] = {1, 5, 3, -7, 9, 0, -4, 2, 4, 1, -23, 5, 4, 0, 5};
        int y[] = {1, 3, 5, 1, 4, 13, 0, 6, 31, 4, -1, 14, -4, -101, 2};
        int indI = 0;
        int indJ = 0;
        double max = 0;
        double length;


        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {

                length = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));

                if (length > max) {
                    max = length;
                    indI = i;
                    indJ = j;
                }

            }
        }

        System.out.println("length = " + max + "; x1 = " + x[indI] + "; y1 = " + y[indI] + "; x2 = " + x[indJ] + "; y2 = " + y[indJ]);
    }

}
