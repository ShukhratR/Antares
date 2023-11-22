package src.week8_Celine;

import java.util.Arrays;
import java.util.Random;

public class Nunique {


    public static int[] solution1(int N){
        int[] result = new int[N];
        int sum = 0;
        for(int i=0; i < N-1; i++) {
            result[i] =i;
            sum += i;
        }
        result[N-1] = -sum;    // n=5[0,1,2,3,-6]
        return result;
    }




    public static int[] solution2(int N){
        int[] result = new int[N];
        Random random=new Random();
        int sum = 0;
        for(int i=0; i < N-1; i++) {
            int num= random.nextInt(16);
            result[i] =num;
            sum += result[i];
        }
        result[N-1] = -sum;
        return result;
    }



    public static int[] solution3(int N){
        int[] result = new int[N];
        int sum = 0;
        Random random=new Random();
        for(int i=0; i < N-1; i++) {
            int num= random.nextInt(50);
            while (isContains(num, result)) {
                num = random.nextInt(100);   //if it contains the num, we are getting a new random number
            }
            result[i]= num;
            sum += result[i];
        }
        result[N-1] = -sum;
        return result;
    }


    public static boolean isContains(int num, int[] arr){
        boolean result=false;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==num){
                result=true;
            }
        }
        return result;
    }






    public static void main(String[] args) {
      int [] arr1= solution1(15);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        int [] arr2= solution2(20);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));



        int [] arr3= solution3(20);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

    }


}
