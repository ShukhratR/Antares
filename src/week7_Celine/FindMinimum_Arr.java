package src.week7_Celine;

import java.util.Arrays;

public class FindMinimum_Arr  {


    public static int findMinimum( int[]  arr ) {
        int min =  arr [0];
        for(int each: arr)
            if(each < min)
                min = each;

        return min;
    }

    public static int findMin(int [] arr) {
        Arrays.sort(arr);
        return arr[0];

    }

    public static void main(String[] args) {
        int [] arr= {-5,1,7,123};
        System.out.println("findMin(arr) = " + findMin(arr));
      //  System.out.println("findMinimum(arr) = " + findMinimum(arr));
    }








}
