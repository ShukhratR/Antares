package Week2CodingTasks;

public class SwapNumbers {

    // Swap variables value's without using third variable


    public static void SwapNumbers(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        SwapNumbers(10,20);
    }

}
