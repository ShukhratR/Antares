package src.week8_Celine;

import java.util.Arrays;
import java.util.Random;

public class NuniqueElements {
    public static int[] solution1(int N){
        int[] result = new int[N];       //n=4
        int sum = 0;

        for(int i=0; i < N-1; i++) {     //0 1 2 3
            result[i] = i;             // result[0]=0   result[1]=1  result[2]=2
            sum += i;                  //sum= 0+1+2= 3
        }
        result[N-1] = -sum;             // result[3]= -3
        return result;
    }






    public static int[] solution2(int N){
        int[] result = new int[N];
        int sum = 0;
        Random random=new Random();
        for(int i=0; i < N-1; i++) {
            int num= random.nextInt(20);
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

       System.out.println("Arrays.toString(solution2(8)) = " + Arrays.toString(solution2(8)));
       int[] arr = solution1(10);
       System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }




}
