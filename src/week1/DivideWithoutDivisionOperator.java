package week1;

public class DivideWithoutDivisionOperator {

//Solution 1:
        public static void main(String[] args) {
            String divBy15 ="";
            String divBy5 ="";
            String divBy3="";
            int[] arr = new int[100];
            for(int i=0; i < arr.length; i++)
                arr[i] = i+1;

            for(int each: arr) {
                if(each %15==0 )
                    divBy15+= each+" ";
                if(each %5==0 && each % 15!=0)
                    divBy5 += each+" ";
                if(each%3==0 && each %15!=0)
                    divBy3 += each+" ";
            }
            System.out.println("Divisible By 15: "+divBy15);
            System.out.println("Divisible By 5: "+divBy5);
            System.out.println("Divisible By 3: "+divBy3);



/*


//Solution 2:

String divby15 ="";
String divby5 ="";
String divby3="";
List<Integer> list = new ArrayList<Integer>();
for(int i=0; i < 100; i++)
list.add(i+1);

for(int each: list) {
if(each %15==0 && each %3==0)
divby15+= each+" ";
if(each %5==0 && each % 15!=0)
divby5 += each+" ";
if(each%3==0 && each %15!=0)
divby3 += each+" ";
}
System.out.println("second solution: "+divby15);
System.out.println("second solution: "+divby5);
System.out.println("second solution: "+divby3);


*/




//Solution 3:
/*

List<Integer> list2 = new ArrayList<Integer>();
for(int i=0; i < 100; i++)
list2.add(i+1);

System.out.print("Divisible By 15: ");
list2.forEach( p -> { if(p%15==0 && p%3==0) System.out.print(p+" "); } ) ;
System.out.print("\nDivisible By 5: ");
list2.forEach( p -> { if(p%5==0 && p%15!=0) System.out.print(p+" "); } ) ;
System.out.print("\nDivisible By 3: ");
list2.forEach( p -> { if(p%3==0 && p%15!=0) System.out.print(p+" "); } ) ;



*/


        }


    }


