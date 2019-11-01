package HandlingException;

import java.util.Scanner;

class HandlingExceptionProblemOne {

    private Scanner scanner;
    private int x;
    private int y;

    HandlingExceptionProblemOne() {
        scanner = new Scanner(System.in);
    }

    private void setX() {
        System.out.println("Enter a value for x");
        x = scanner.nextInt();
    }

    private void setY() {
        System.out.println("Enter a value for y");
        y = scanner.nextInt();
    }

    void divideXbyY() {

        try {
            setX();
            setY();

            // Divide X by Y
            System.out.println(x/y);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
