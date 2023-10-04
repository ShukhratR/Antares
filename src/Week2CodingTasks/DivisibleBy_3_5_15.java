package Week2CodingTasks;

public class DivisibleBy_3_5_15 {


    public static void Divisible3_5_15(int number){

        String divisibleBy_15= "";
        String divisibleBy_5= "";
        String divisibleBy_3= "";

        for (int i = 1; i <= number ; i++) {
            if (i % 3 == 0 && i % 15 != 0){
                divisibleBy_3 += i+" ";

            } else if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy_5 += i +" ";

            } else if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ) {
                divisibleBy_15 += i +" ";
            }
        }

        System.out.println("divisibleBy_3 = " + divisibleBy_3);
        System.out.println("divisibleBy_5 = " + divisibleBy_5);
        System.out.println("divisibleBy_15 = " + divisibleBy_15);
    }


    public static void main(String[] args) {

        Divisible3_5_15(100);

    }

}
