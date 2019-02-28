//enter number from user and round off it
package Bhavnish;
public class Q5 {

    public static void main(String[] args) throws Exception{
        System.out.print("Enter a number : ");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        double num=sc.nextDouble();
        System.out.println("Round off : "+Math.round(num));
    }
    
}
