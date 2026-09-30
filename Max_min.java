
package vobba;

import java.util.Scanner;
public class Max_min {
      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        // Find maximum value
        double maximum = Math.max(num1, Math.max(num2, num3));

        // Find minimum value
        double minimum = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum value = " + maximum);
        System.out.println("Minimum value = " + minimum);
      }
}
