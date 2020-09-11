// This was originally a wrong program, and we
// had to correct it in class

import java.util.Scanner;

public class PrimeFactorErrors {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter an integer:");
      int userNum = input.nextInt();

      boolean isPrime = true;
      for (int factor = 2; factor < userNum; factor++) {
        if (userNum % factor == 0) {
          isPrime = false;
          break;
        }
      }
      // fancy ternary operators
      System.out.println(userNum + " is " + (isPrime ? "" : "not ") + "prime.");
      input.close();
    }
}