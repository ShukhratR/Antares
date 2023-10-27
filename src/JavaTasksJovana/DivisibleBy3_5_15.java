package JavaTasksJovana;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {
        int number=100;
        String divisibleBy3="";
        String divisibleBy5="";
        String divisibleBy15="";


            for (int i = 1; i <=number; i++) {
                if (i % 15 == 0) {
                    divisibleBy15+=i+",";
                } else if (i % 3 == 0) {
                 divisibleBy3+=i+",";
                } else if (i% 5 == 0 ) {
                   divisibleBy5+=i+",";

                }
            }
        System.out.println("Numbers divisible by 3: "+divisibleBy3);
        System.out.println("Numbers divisible by 5: "+divisibleBy5);
        System.out.println("Numbers divisible by 15: "+divisibleBy15);
        }







    }





