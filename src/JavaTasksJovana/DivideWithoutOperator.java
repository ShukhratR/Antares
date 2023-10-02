package JavaTasksJovana;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        int number1=60;
        int number2= 20;
        int result=0;
        while(number1>=number2){
            number1-=number2;
         result++;}
        System.out.println(result);
    }
}
