package Week5CoddingTasks;

public class ReverseTask {

//    String -- Reverse
//    Write a return method that can reverse String
//    Ex: Reverse("ABCD"); ==> DCBA



    public static String reverse(String word){
        String result = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            result += word.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
    }
}
