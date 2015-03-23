package com.company;

/**
 * Created by annyrtd on 23.03.15.
 */
public class Polynomial {
    /** An array with polynomial coefficients. */
    private int[] array;

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
    public Polynomial(int[] array, int n) {
        this.array = array;
        N = n;
    }

    /**
     * This function calculates value of the polynomial in a point x.
     * @param x the point in which value should be calculated.
     * @return the function value.
     */
    public int calculatePolynomialValue(int x) {
        int temp = 0;
        for  (int i = 0; i <= N; i++) {
            temp += array[i] * java.lang.Math.pow(x, i);
        }
        return temp;
    }

    public  int calculatePolynomialDiffValue(int x) {
        int temp = 0;
        for  (int i = 1; i <= N; i++) {
            temp += array[i] * i *  java.lang.Math.pow(x, i - 1);
        }
        return temp;
    }

}
