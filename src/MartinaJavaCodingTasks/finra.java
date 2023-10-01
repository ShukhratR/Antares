package MartinaJavaCodingTasks;

public class finra {


    public static void main(String[] args) {
        printFinra();

    }
    public static void printFinra(){

        for (int num = 1; num <= 30; num++){

            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("FINRA");
            } else if (num % 3 == 0) {
                System.out.println("FIN");
            } else if (num % 5 == 0){
                System.out.println("RA");
            } else {
                System.out.println(num);
            }
        }

    }


}









/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */