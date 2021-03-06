package com.company;

/**
 * Created by annyrtd on 23.03.15.
 * Class that describes a polynomial.
 */
public class Polynomial {
    /** An array with polynomial coefficients. */
    private double[] array;

    /** Polynomial degree. */
    private int N;

    /** Default constructor. */
    public Polynomial () {
    }

    /**
     * Constructor with parameters.
     * @param array an array that should be added.
     * @param n polynomial degree.
     */
    public Polynomial(double[] array, int n) {
        this.array = array;
        N = n;
    }

    /**
     * This function calculates value of the polynomial in a point x.
     * @param x the point in which the value should be calculated.
     * @return the function value.
     */
    public double calculatePolynomialValue(double x) {
        double temp = 0;
        for  (int i = 0; i <= N; i++) {
            temp += array[i] * java.lang.Math.pow(x, i);
        }
        return temp;
    }

    /**
     * This function calculates value of the polynomial differential in a point x.
     * @param x the point in which the value should be calculated.
     * @return the differential value.
     */
    public  double calculatePolynomialDiffValue(double x) {
        double temp = 0;
        for  (int i = 1; i <= N; i++) {
            temp += array[i] * i *  java.lang.Math.pow(x, i - 1);
        }
        return temp;
    }

}
