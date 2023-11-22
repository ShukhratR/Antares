package week4CoddingTasks;

import jdk.jfr.Frequency;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.Collections;

public class FrequancyOfCharacters {


//    String -- Frequency of Characters
//    Write a return method that can find the frequency of characters
//    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


    public static String frequancy(String word) {

        String result = "";
        for (int i = 0; i < word.length() ; i++) {
            int count = 0;
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }

            if (!(result.contains(""+word.charAt(i)))){
                result += "" + word.charAt(i);
                result += count;
            }

        }
       return result;
    }




    public static void main(String[] args) {
        System.out.println("frequancy(\"AABB\") = " + frequancy("AABB"));
    }

}
