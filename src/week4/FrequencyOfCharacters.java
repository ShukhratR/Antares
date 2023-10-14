package week4;

public class FrequencyOfCharacters {
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public static void main(String[] args) {
    String str = "aabbbcccc";
    char ch = 'c';

    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch){
            count++;
        }

    }
    System.out.println(count);

}
}


