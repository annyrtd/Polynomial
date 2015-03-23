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
            File myFile = new File(args[1]);
            if (myFile.exists()) {
                myFile.delete();
                myFile.createNewFile();
            }
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1], true)));
            out.write("The value of polynomial in point x = " + x + ": "
                    + polynomial.calculatePolynomialValue(x) + ".\n");
            out.write("The value of polynomial differential in point x = " + x + ": "
                    + polynomial.calculatePolynomialDiffValue(x) + ".\n");
            out.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found!");
        } catch (InputMismatchException e) {
            System.out.println("Wrong data in the file!");
        } catch (IOException e) {
            System.out.println("A mistake while writing file!");
        } catch (NoSuchElementException e) {
            System.out.println("No such element in file!");
        }
    }








}
