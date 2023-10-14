package week4;

import java.util.Arrays;

public class SameLetters {

/*
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

    public static boolean areAnagrams(String str1, String str2) {
      // Remove spaces and convert both strings to lowercase (if case-insensitive comparison is needed)
      str1 = str1.replaceAll("\\s", "").toLowerCase();
      str2 = str2.replaceAll("\\s", "").toLowerCase();

      // Check if the sorted strings are the same
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
      String str1 = "abc";
      String str2 = "cab";

      boolean result = areAnagrams(str1, str2);

      if (result) {
        System.out.println(str1 + " and " + str2 + " are anagrams.");
      } else {
        System.out.println(str1 + " and " + str2 + " are not anagrams.");
      }
    }
  }



