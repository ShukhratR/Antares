package Week3CodingTasks;

public class ReverseNegativeNumber {

//    2. Numbers -- Reverse negative number
//    Write a return method that can reverse negative number and return it as int

    public static int reverseNegativeNumber(int number){

        int rev_num = 0;

        while(number > 0){
            rev_num = rev_num * 10 + number % 10;
            number = number / 10;
        }
        return rev_num;
    }


    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(1234));
    }


}
