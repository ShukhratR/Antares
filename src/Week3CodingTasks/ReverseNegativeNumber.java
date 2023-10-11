package Week3CodingTasks;

public class ReverseNegativeNumber {

//    2. Numbers -- Reverse negative number
//    Write a return method that can reverse negative number and return it as int

    public static int reverseNegativeNumber(int number){

//     int result = Math.abs(number);
//     return result;

        if (number < 0)
            number = -number;

        return number;
    }


    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-99));
    }


}
