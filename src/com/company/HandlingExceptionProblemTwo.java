package com.company;

import java.util.Scanner;

class HandlingExceptionProblemTwo {
    private Scanner scanner;
    private int n;
    private int p;

    HandlingExceptionProblemTwo() {
        scanner = new Scanner(System.in);
    }

    private void setN() {
        System.out.println("Enter a value for n");
        n = scanner.nextInt();
    }

    private void setP() {
        System.out.println("Enter a value for p");
        p = scanner.nextInt();
    }

    void nToThePowerOfP() {
        try {
            setN();
            setP();
            if ((n == 0 && p == 0) || ((n < 0 || p < 0))) {
                throw new Exception();
            }
            System.out.println(Math.pow(n, p));
        } catch (Exception e) {
            if (n == 0 && p == 0) {
                System.out.print(e + ": n and p should not be zero.");
            } else if (n < 0 || p < 0) {
                System.out.print(e + ": n or p should not be negative.");
            }
        }
    }
}
