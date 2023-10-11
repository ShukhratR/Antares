package Week3CodingTasks;

public class PrimeNumbers {

//    1. Numbers -- Prime Number
//    Write a method that can check if a number is prime or not


    public static boolean isPrimeNumber(int number){

        if (number < 2){
            return false;
        }

        for (int i = 2; i < number ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("isPrimeNumber(53) = " + isPrimeNumber(53));
        System.out.println("isPrimeNumber(64) = " + isPrimeNumber(64));
    }

}
