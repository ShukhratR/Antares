package Week2CodingTasks;

public class ConsecutiveNumber {


    public static void consecutiveNumber(int N){

        for (int i = 1; i <= N; i++) {
            String result = "";
            if (i % 2 == 0 && i % 3 != 0 && i % 5 != 0){
                result = "Codility";
                System.out.println(result);

            } else if (i % 3 == 0 && i % 2 != 0 && i % 5 != 0) {
                result = "Test";
                System.out.println(result);

            } else if (i % 5 == 0 && i % 3 != 0 && i % 2 != 0) {
                result = "Coders";
                System.out.println(result);

            } else if (i % 2 == 0 && i % 3 == 0 && i % 5 != 0) {
                result = "CodilityTest";
                System.out.println(result);

            } else if (i % 2 == 0 && i % 5 == 0 && i % 3 != 0) {
                result = "CodilityCoders";
                System.out.println(result);

            } else if (i % 3 == 0 && i % 5 == 0 && i % 2 != 0) {
                result = "TestCoders";
                System.out.println(result);
            }else {
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {
        consecutiveNumber(17);
    }


}
