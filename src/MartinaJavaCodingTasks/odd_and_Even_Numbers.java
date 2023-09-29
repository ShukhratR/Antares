package MartinaJavaCodingTasks;

public class odd_and_Even_Numbers {


    public static void main(String[] args) {

        System.out.println(identify(11));

    }

    public static String identify(int number){
        if (number % 2 == 0){
            return "Even";
        }else {
            return "Odd";
        }


    }

}
     /*Write a method which can identifies given number is even or odd;
    ex:
    identify(5) --> "Odd";
    identify(6) --> "Even";
    */



