//enter a marks of 5 subjects and calculate average
package Bhavnish;

public class Q6 {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        double total=0,marks[]=new double[5];
        String sub[]=new String[]{"hindi","english","math","punjabi","drawing"};
        System.out.println("Enter marks : ");
        for(int i=0; i<sub.length; i++)
           {
               System.out.print(sub[i]+" : ");
               marks[i]=sc.nextDouble();
               total=total+marks[i];
           }
        System.out.println("Average marks : "+(total/5));
    }
    
}
