
package vobba;
import java.util.Scanner;

public class Max {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int maximum;

        if (num1 >= num2 && num1 >= num3) {
            maximum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maximum = num2;
        } else {
            maximum = num3;
        }

        System.out.println("Maximum value = " + maximum);
    }
}
