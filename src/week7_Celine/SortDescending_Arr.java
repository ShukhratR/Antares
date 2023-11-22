package src.week7_Celine;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDescending_Arr {
    public static void main(String[] args) {
        int[] arr = {5, 7, 33, 56, 78, -9, -56, 12345};
        int[] arrNew = sortInDescending(arr);
        System.out.println(Arrays.toString(arrNew));

    }


    public static int[] sortInDescending(int[] sorted) {
        for (int i = 0; i < sorted.length; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {    // (i=0 j=1) 25>1 true     i=0 j=2       i=1 j=0  25>1 true    i=1 j=1
                    Integer temp = sorted[i];   //           temp=25        1>5 false      temp=25
                    sorted[i] = sorted[j];     //            arr= 1,1,5                     arr=1,1,5
                    sorted[j] = temp;           //           arr=1,25,5                     arr=25,1,5
                }
            }

        }
        return sorted;
    }


    public static int[] sortDescending(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int each : arr)
            list.add(each);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = findMax(list);
            list.remove(Integer.valueOf(arr[i]));
        }
        return arr;
    }

    public static int findMax(ArrayList<Integer> a) {
        int max = Integer.MIN_VALUE;
        for (int each : a)
            if (each > max)
                max = each;
        return max;
    }


    public static int[] solution(int[] array) {              //  arr= 25,100,50

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = 0;               // i=0 j=1  25>100 false   i=0 j=2 25>50 false
                if (array[i] > array[j]) {   //   i=1 j=0  100>25 true       i=1 j=2 25>50 false  i=2 j=0 false  i=2 j=1 true
                    temp = array[i];              // temp=100                                                    temp=50
                    array[i] = array[j];          // array=25,25,50                                           array=100, 25,25
                    array[j] = temp;              //100,25,50                                                  array=100,50,25
                }
            }


        }

        return array;
    }

}
/*
    public static void SortingArrayDesc(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for (int each : arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

    }

 */


