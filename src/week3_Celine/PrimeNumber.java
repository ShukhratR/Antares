package src.week3_Celine;

public class PrimeNumber {

    public static void main(String[] args) {

//        prime number  :   Any natural number greater than 1 divisible only by itself and 1

        System.out.println("primeNumber(13) = " + primeNumber(13));
    }




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
