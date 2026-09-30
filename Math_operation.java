
package vobba;

import java.util.Scanner;
public class Math_operation {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.println("Powers of 2 from 2^0 to 2^" + n + ":");

        for (int i = 0; i <= n; i++) {
            double result = Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
     }
}
