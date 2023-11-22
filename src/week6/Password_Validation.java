package week6;

import java.util.Arrays;

public class Password_Validation {



    /*
    String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not. requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean passwordVerification(String password){

        char [] chars = password.toCharArray();




        if (chars.length >= 6){

            for (int i = 0; i < chars.length; i++) {

                if (Character.isDigit(chars[i]) && Character.isLetter(chars[i]) && Character.isUpperCase(chars[i]) && Character.isLowerCase(chars[i]) && !(Character.isLetterOrDigit(chars[i]))){

                }
            }
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(passwordVerification("bcdef@"));

    }


}
