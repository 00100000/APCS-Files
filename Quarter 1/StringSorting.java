import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // user input
        System.out.println("Please enter the first word.");
        String a = scan.nextLine();
        System.out.println("Please enter the second word.");
        String b = scan.nextLine();
        System.out.println("Please enter the third word.");
        String c = scan.nextLine();
        scan.close();

        // 3 items can only have 6 different possibilities, so I can just
        // manually type them out instead of doing something like bubble sort
        // sorry for lazy solution
        if (a.charAt(0) > b.charAt(0) && a.charAt(0) > c.charAt(0)) {
            if (b.charAt(0) > c.charAt(0)) {
                System.out.println(c + ", " + b + ", " + a);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        }
        if (b.charAt(0) > c.charAt(0) && b.charAt(0) > c.charAt(0)) {
            if (a.charAt(0) > c.charAt(0)) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                System.out.println(a + ", " + c + ", " + b);
            }
        }
        if (c.charAt(0) > a.charAt(0) && c.charAt(0) > b.charAt(0)) {
            if (a.charAt(0) > b.charAt(0)) {
                System.out.println(b + ", " + a + ", " + c);
            } else {
                System.out.println(a + ", " + b + ", " + c);
            }
        }
    }
}