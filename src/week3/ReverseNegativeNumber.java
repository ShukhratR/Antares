package week3;

public class ReverseNegativeNumber {

    //2. Numbers -- Reverse negative number
    //Write a return method that can reverse negative number and return it as int
    public static int reverseNumber(int number) {
        boolean isNegative = number < 0 ? true : false;   //true

        if(isNegative){   //if it is negative
            number = number * -1;   // -48 ->  48
        }


        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10;  //   48/10=4  remainder= 8
            reverse = reverse * 10 + lastDigit;  // 0*10 + 8 =8      //8*10 +4 =84
            number = number / 10;  // 4/10= 0  remainder=4
        }
        return isNegative == true? reverse*-1 : reverse;

    }
}
