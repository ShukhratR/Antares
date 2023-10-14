package week4;

public class RemoveDuplicates {

    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from
    //String Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String [] args){

        String str = "aabbbcccc";

        String result = "";

        for (int i = 0; i < str.length(); i++){

            char each = str.charAt(i);

            if(!result.contains("" + each)) {
                result +=each;
            }
        }

        System.out.println(result);

    }
}



