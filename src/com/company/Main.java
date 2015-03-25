package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File(args[0]));
            int N = sc.nextInt();
            int[] A = new int[N + 1];
            for (int i = 0; i < (N + 1); i++) {
                A[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            Polynomial polynomial = new Polynomial(A, N);
            writeToFile(args[1], polynomial, x);
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found!");
        } catch (InputMismatchException e) {
            System.out.println("Wrong data in the file!");
        } catch (IOException e) {
            System.out.println("A mistake while writing file!");
        } catch (NoSuchElementException e) {
            System.out.println("Not enough elements in file!");
        }
    }

    /**
     * This function writes the result of calculations to the file.
     * @param name the name of the file.
     * @param polynomial the polynomial which value and differential value it calculates.
     * @param x the point in which the value should be calculated.
     * @throws IOException
     */
    public static void writeToFile (String name, Polynomial polynomial, int x) throws IOException {
        FileWriter out = new FileWriter(name, false);
        int value = polynomial.calculatePolynomialValue(x);
        int difValue = polynomial.calculatePolynomialDiffValue(x);
        out.write("The value of the polynomial in the point x = " + x + ": " + value + ".\n");
        out.write("The value of the polynomial differential in the point x = " + x + ": " + difValue + ".\n");
        out.flush();
    }
}
