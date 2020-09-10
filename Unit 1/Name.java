import java.util.Scanner;

public class Name {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);

        // Name
        System.out.println("Please enter your name.");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");

        // Quadratic
        System.out.println("Please enter a");
        int a = scan.nextInt();
        System.out.println("Please enter b");
        int b = scan.nextInt();
        System.out.println("Please enter c");
        int c = scan.nextInt();

        double solOne = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        double solTwo = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        System.out.println("The solutions are: " + solOne + " and " + solTwo);

        // Smallest to Largest
        System.out.println("Please enter the first number.");
        int w = scan.nextInt();
        System.out.println("Please enter the second number.");
        int x = scan.nextInt();
        System.out.println("Please enter the third number.");
        int y = scan.nextInt();
        System.out.println("Please enter the fourth number.");
        int z = scan.nextInt();

        if (w > x || x > y || y > z) System.out.println("You didn't enter the numbers in the correct order.");
        System.out.println("You entered the numbers in the correct order.");
        scan.close();
    }
}