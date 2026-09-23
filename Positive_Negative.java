
package vobba;
import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number:");
        int number = input.nextInt();
        if(number >0)
        {
            System.out.println("this number is positive number");
        }
        
        else if ( number <0)
        {
            System.out.println("this number is negative");
        }
        else
        {
            System.out.println("this number is zero ");
        }
    }
}
