package week4CoddingTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SameLetters {

    /*
    String -- Same letters
    Write a return method that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true
                same("abc", "abb"); -> false
     */

    public static boolean sameLetters(String str1,String str2){

        char [] first = str1.toCharArray();
        char [] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first,second)){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));

    }


}
