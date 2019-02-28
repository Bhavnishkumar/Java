//enter a number from user and display 1 to that number
package Bhavnish;

public class Q7 {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter ma number : ");
        int num=sc.nextInt();
        if(num>1)
           {
               for(int i=1; i<=num; i++)
                  System.out.print(i+" ");
           }
        else
           {
               for(int i=1; i>=num; i--)
                 System.out.print(i+" ");
           }
        System.out.println("");
        }   
}
