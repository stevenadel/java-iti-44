package com.jets.day3;

public class Roots {
    public static void main(String[] args) {
        double A = 1;
        double B = -3;
        double C = 2;

        quadraticFunction rootsFormula = (double a, double b, double c) -> {
            double discriminant = Math.sqrt(b * b - 4 * a * c);

            double root1 = (-b + discriminant) / (2 * a);
            double root2 = (-b - discriminant) / (2 * a);

            double[] roots = new double[2];
            roots[0] = root1;
            roots[1] = root2;
            return roots;
        };

        double[] roots = findRoots(rootsFormula, A, B, C);
        System.out.println("Root 1: " + roots[0]);
        System.out.println("Root 2: " + roots[1]);
    }

    interface quadraticFunction {
        double[] get(double a, double b, double c);
    }

    static double[] findRoots(quadraticFunction equation, double a, double b, double c) {
        return equation.get(a, b, c);
    }
}