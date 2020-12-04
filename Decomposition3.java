package by.jonline.grow.algoritmization;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */

public class Decomposition3 {
    public static void main(String[] args) {

        int a = 10;

        System.out.println(6 * s(a, a, a));

    }

    static double s(double a, double b, double c) {

        double p;

        p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}
