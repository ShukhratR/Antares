package src.Week2;

public class week2_JavaTasks_divisibleBy3_5_15 {
    /*
    Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99   */

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
