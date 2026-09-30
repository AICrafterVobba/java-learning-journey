
package vobba;

import java.util.Random;
public class random_number {
    public static void main(String[] args){
          Random random = new Random();

        System.out.println("5 Random Numbers between 100 and 200:");

        for (int i = 1; i <= 5; i++) {
            int number = random.nextInt(101) + 100;
            System.out.println(number);
        }
    }
}
