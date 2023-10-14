package week1;

import java.util.Scanner;

public class OddAndEvenPractice2 {
    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number:");
            int number = input.nextInt();


            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }

        }
    }
}
