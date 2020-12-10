package by.jonline.grow.algoritmization;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Decomposition9 {
    public static void main(String[] args) {

        int x = 4;
        int y = 4;
        int z = 2;
        int t = 6;
        double a;
        double s = 0;

        a = Math.sqrt(x * x + y * y);

        s += sTr(x, y, a);
        s += sTr(z, t, a);
        System.out.println("s = " + s);
    }

    static double sTr(double a, double b, double c) {

        double p;

        p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

}
