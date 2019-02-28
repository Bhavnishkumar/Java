//enter a character charcter from user and when he press n then exit
package Bhavnish;

public class Q8 {

    public static void main(String[] args)throws Exception {
        char chr;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        do
         {
             System.out.print("Enter a character   : ");
             chr=sc.next().charAt(0);
             if(chr=='n')
                 break;
             System.out.print("you want to enter again y for YES n for NO : ");
             chr=(char)System.in.read();
         }
        while(chr=='y');
        
    }
    
}
