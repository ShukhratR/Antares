package Week5CoddingTasks;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindUnique {

//    String -- Find the unique
//    Write a return method that can find the unique characters from the String
//    Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String unique(String word){

        String result = "";

        for (int i = 0; i < word.length() ; i++) {
            char each = word.charAt(i);
            if (word.indexOf(each) == word.lastIndexOf(each)){
                result += each;
            }
        }

    return result;
    }

    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));
    }

}
