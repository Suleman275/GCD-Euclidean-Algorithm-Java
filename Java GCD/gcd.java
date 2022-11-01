import java.util.Scanner;

public class gcd {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the first number");
      int num1 = scan.nextInt();

      System.out.println("Enter the second number");
      int num2 = scan.nextInt();
      
      int r = 0;

      while (num2 != 0) {
         r = num1 % num2;
         num1 = num2;
         num2 = r;
      }

      System.out.println("Your greatest common divisor is: " + num1);
   }
}