package JavaTasksJovana;

public class UniqueElement {

    public static void main(String[] args) {

//aabbccd
        System.out.println(unique("abvgddggsjak"));

    }

    public static String unique(String str){

        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char eachLetter=str.charAt(i);

            if(str.indexOf(eachLetter)==str.lastIndexOf(eachLetter)){
             result+=eachLetter;
            }
        }
        return result;

    }
}
