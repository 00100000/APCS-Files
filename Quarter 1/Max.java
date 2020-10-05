import java.util.Scanner;

public class Max {
  //Returns the largest of its four arguments.
  public static int max(int a, int b, int c, int d) {
    //To be implemented by student
    int[] arr = {a, b, c, d};
    int largest = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 4 integers, separated by spaces: ");
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    int n3 = input.nextInt();
    int n4 = input.nextInt();
    input.close();
    System.out.println("Largest is " + max(n1, n2, n3, n4));
  }
}