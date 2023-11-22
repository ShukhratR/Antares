package week7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Sort_Ascending {

/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */


    public static int[] sortAscending(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] > nums[j]){
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

        System.out.println(Arrays.toString(sortAscending(arr)));

    }

}

/*
public static void main(String[] args) {
    int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

    for (int i = 0; i < arr.length; i++) {

        for (int j = i + 1; j < arr.length; j++) {

            int tmp = 0;

            if (arr[i] > arr[j]) {

                tmp = arr[i];

                arr[i] = arr[j];

                arr[j] = tmp;
            }
        }
    }
}
 */