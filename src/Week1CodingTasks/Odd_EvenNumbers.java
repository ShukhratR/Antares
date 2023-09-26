package Week1CodingTasks;

public class Odd_EvenNumbers {
    /*
        Write a method which can identifies ven numbers is even or odd:
            Ex:
                    identify(5) -> Odd;
                    identify(6) -> Even;
     */

    public static String identify(int number){

        if (number % 2 == 0){
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {

        System.out.println(identify(6));
    }
}
