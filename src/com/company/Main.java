package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File(args[0]));
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                System.out.println(A[i] + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be found!");
        } catch (InputMismatchException e) {
            System.out.println("Wrong data in the file!");
        }
    }








}
