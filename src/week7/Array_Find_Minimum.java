package week7;

public class Array_Find_Minimum {
    /*
            Question1: Array - Find Minimum
            Write a method that can find the maximum number from an int Array
     */

    public static int minNumber(int[] numbers){

        int min = 15;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
            return min;
    }


    public static void main(String[] args) {

        int[] nums = {3,4,5,6};

        System.out.println(minNumber(nums));
    }


}
