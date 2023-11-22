package week6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMaximum {

    /*
    Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */


    public static int findMax(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }


    public static void main(String[] args) {

        int[] nums = {100,90,1};

        System.out.println(findMax(nums));

    }


}
