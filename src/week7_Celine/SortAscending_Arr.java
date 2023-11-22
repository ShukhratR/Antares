package src.week7_Celine;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending_Arr {
    /*
    Write a return method that can sort an int array in Ascending order without using the sort method
of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        int [] arr= {10,20,-5,-5,30,30,556,-124,9999};
        int [] newArr= sortInAscending(arr);
        System.out.println(Arrays.toString(newArr));


       // int [] arr2= sort1(arr);
        //System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
    }

    public static int[] sortInAscending(int [] arr) {
        int[] sorted = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if (sorted[i] < sorted[j]) {
                    Integer temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }

        }
        return sorted;
    }







    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            if(each < min)
                min = each;
        return min;
    }

    public static int[] sort1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr)
            list.add(each);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = findMin(list);
            list.remove(Integer.valueOf(arr[i]));
        }
        return arr;
    }




    public static void sortingArrayDescending(int[] arr) {
        ArrayList<Integer> list = new ArrayList();    // {5,20,100}
        for (int each : arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));


                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);


        }
    }


}