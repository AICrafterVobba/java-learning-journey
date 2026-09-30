
package vobba;
import java.util.Scanner;
public class absolute_floor_celi {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        System.out.println("Absolute value = " + Math.abs(num));
        System.out.println("Floor value = " + Math.floor(num));
        System.out.println("Ceil value = " + Math.ceil(num));
        System.out.println("Round value = " + Math.round(num));

        if (num >= 0) {
            System.out.println("Square root = " + Math.sqrt(num));
        } else {
            System.out.println("Square root = Not possible for a negative number.");
        }
    }
}
