package week3;

public class PrimeNumber {

    //1. Numbers -- Prime Number
    //Write a method that can check if a number is prime or not

    public static boolean primeNumber(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) { //30 //checking if the number is divisible by any number except itself
            if (num % i == 0)
                return false;

        }


        return true;
    }
}
