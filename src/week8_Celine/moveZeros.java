package src.week8_Celine;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZeros {


    public static int[] moveZeros(int[] arr) {
        //int[] arr={0,12,4,0,0,5,7};
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for (int each : arr) {                                   // list= [0,12,4,0,0,5,7]
            list.add(each);
            countZero += (each == 0) ? 1 : 0;
        }
        list.removeAll(Arrays.asList(0));                    // list=[12,4,5,7]
        arr = new int[arr.length];
        for (int i = 0; i < arr.length - countZero; i++) {
            arr[i] = list.get(i);                            // arr={12,4,5,7]  adds default value '0',   'countzero' times
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {0, 12, 4, 0, 0, 5, 7};
       // System.out.println("Arrays.toString(moveZeros(arr)) = " + Arrays.toString(moveZeros(arr)));
        System.out.println("Arrays.toString((moveZeros2(arr))) = " + Arrays.toString((moveZeros2(arr))));




    }


    public static int[] moveZeros2(int[] arr) {
        int[] numbers = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] result = new int[numbers.length];
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {//i0 i1 i2 i3 i4 i5 i6 i7

            if (numbers[i] != 0) { //1 0 2 0 3 0 4 0
                result[j++] = numbers[i];//j=0  result[0]=1 -- j=1, result[1]=2  --  j=2, result[2]=3,result[3]=4
            }

        }

return result;
    }


}
