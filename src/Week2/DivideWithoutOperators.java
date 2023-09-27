package Week2;

public class DivideWithoutOperators {
    public static void main(String[] args) {

        int n1=60;
        int n2=20;
        int result=0;

        while(n1>=n2){
            result++;
            n1-=n2;
        }
        System.out.println("Result is: "+ result);
    }
}
