package com.company;

public class HandlingExceptionsMain {

    /**
     * Exception handling Problems & Solutions
     *
     * Problem 1:
     * We have the following problem:
     * You will be given two integers x and y as input, you have to compute x/y.
     * If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it.
     *
     * Problem 2:
     * You are required to compute the power of a number by implementing a calculator.
     * Create a class which consists of a single method long power(int, int).
     * This method takes two integers, n and p, as parameters and finds n^P.
     * If either n or p is negative, then the method must throw an exception.
     * Also, if both n and p are zero, then the method must throw an exception.
     *
     */
    protected static void main(String[] args) {
        HandlingExceptionProblemOne handlingOne = new HandlingExceptionProblemOne();
        handlingOne.divideXbyY();

        HandlingExceptionProblemTwo handlingTwo = new HandlingExceptionProblemTwo();
        handlingTwo.nToThePowerOfP();
    }
    /**
     * Console results:
     *                                          HandlingExceptionProblemOne *
     * Test 1:
     * Enter a value for x
     * 10
     * Enter a value for y
     * 3
     * 3
     *
     * Test 2:
     * Enter a value for x
     * 10
     * Enter a value for y
     * Hello
     * java.util.InputMismatchException
     *
     * Test 3:
     * Enter a value for x
     * 23.33
     * java.util.InputMismatchException
     *
     *                                          HandlingExceptionProblemTwo *
     * Test 1:
     * Enter a value for n
     * 0
     * Enter a value for p
     * 0
     * java.lang.Exception: n and p should not be zero.
     *
     * Test2:
     * Enter a value for n
     * -3
     * Enter a value for p
     * -1
     * java.lang.Exception: n or p should not be negative.
     *
     * Test3:
     * Enter a value for n
     * 5
     * Enter a value for p
     * 3
     * 125.0
     */
}
