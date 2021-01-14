//
// QuadraticFormula.java
// Author: Aidan Din
// Finds the roots of quadratic equations given the coefficients
//

import java.util.Scanner;

public class QuadraticFormula {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        // user unput
        System.out.println("Please enter a.");
        double a = scan.nextDouble();
        System.out.println("Please enter b.");
        double b = scan.nextDouble();
        System.out.println("Please enter c.");
        double c = scan.nextDouble();
        scan.close();
        // special cases
        if ((Math.pow(b, 2) - 4 * a * c) == 0) {
            System.out.println("The root is: " + -b / 2 * a);
            return;
        }
        if ((Math.pow(b, 2) - 4 * a * c) < 0) {
            System.out.println("Non-real roots");
            return;
        }
        // discriminant > 0
        double solOne = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        double solTwo = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        System.out.printf("The roots are: " + solOne + " and " + solTwo);
    }
}