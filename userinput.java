
package vobba;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int number;
        System.out.print("enter any number: ");
        number= input.nextInt();
        
        System.out.println("number= "+number);
    }
}
