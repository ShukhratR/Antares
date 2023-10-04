package src.Week2;

public class week2_JavaTasks_swap2Num {

    public static void main(String[] args) {


        //  Solution 1:  I want to make a=20, b=10
         // assign new value
//        int a = 10;
//        int b = 20;
//        a = a + b;   //  a=30 assigned new value to 'a', new value is sum of 2 variables
//        b = a - b;    // b= 30-20=10     'a' is 30,  assigned  a new value to b. new value is 30-b (this is old 'a', new b)
//        a = a - b;   //  a= 30-10=20     b is old 'a' for now, b=10 and  a=30, a new value of 'a' is 30-10
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


        int a=20;
        int b=10;



        b= b+a-( a = b );    //  b=  30-(10)   a=b=>  a=10
       System.out.println("a : " + a);
        System.out.println("b : " +b);




//        ArrayList<Integer> list= new ArrayList<>();
//        list.add(5);
//        list.add(10);
//        System.out.println("list = " + list);   // 5,10
//        list.add(1,list.get(1));  //       5,10,10
//        list.set(2, list.get(0));     //5,10,5
//        list.remove(0);          //10,5
//        System.out.println("list after swap = " + list);







/*Solution 2:
        int x = 10;
        int y = 20;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);   */






    }


}