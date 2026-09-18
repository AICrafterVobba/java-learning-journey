
package vobba;

import java.util.Scanner;
public class Practice {
        
        public static void main(String[] args){
            Scanner input= new Scanner(System.in);
            
            double base,height;
            System.out.println("enter base:");
            base= input.nextDouble();
            
            System.out.println("enter height: ");
            height=input.nextDouble();
            
            double area;
            area=0.5*base*height;
            
            System.out.print("the final arrea result is : "+area);
        }
    
}
