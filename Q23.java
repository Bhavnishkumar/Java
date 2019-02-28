//Q23. Write a Program to Display all Datatype of java
package Bhavnish;

public class Q23 {


    public static void main(String[] args) {
         java.util.Scanner sc=new java.util.Scanner(System.in);
         System.out.print("Enter line : ");
         String s=sc.nextLine();
         System.out.println(s);
         System.out.print("Enter character value : ");
         char z=sc.next().charAt(0);
         System.out.println("value : "+z);
         System.out.print("Enter integer value : ");
         int x=sc.nextInt();
         System.out.println("value : "+x);
         System.out.print("Enter float value : ");
         double y=sc.nextDouble();
         System.out.println("value : "+y);
    }
    
}
