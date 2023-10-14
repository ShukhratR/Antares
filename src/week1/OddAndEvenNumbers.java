package week1;

public class OddAndEvenNumbers {
    public static void main (String [] args){


        int number = 6;

        boolean isEven = number % 2 ==0;

     //   boolean isOdd = number % 2 != 0;

       boolean isOdd = !isEven;


        System.out.println(number+ " is positive number: " + isEven);
        System.out.println(number + " is negative number: " + isOdd);
    }


}
