package Week1CodingTasks;

public class DivideWithoutOperator {

    /*
            Write a method that can divide two numbers without / operator
     */


    public static void Divide( int num1, int num2){
        int count = 0;

        if (num2 <= 0){
            System.err.println("Invalid entry can not be Zero or negative");
            System.exit(1);
        }

        while (num1 >= num2){
            count++;
           num1 -= num2;
        }
        System.out.println("result = " + count + " reminder = " +num1 );
    }


    public static void main(String[] args) {
        Divide(6,2);
    }

}
