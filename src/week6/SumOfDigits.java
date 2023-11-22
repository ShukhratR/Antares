package week6;

public class SumOfDigits {

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
*/

    public static int sumOfDigitsInString(String digits){

        int sum=0;

        for(int i=0; i< digits.length(); i++) {

            char temp = digits.charAt(i);

            if (Character.isDigit(temp)) {
                int nums = Integer.parseInt(String.valueOf(temp));
                sum = sum + nums;
            }
        }

        return sum;
    }


    public static void main(String[] args) {

        System.out.println(sumOfDigitsInString("1234"));
    }


}
