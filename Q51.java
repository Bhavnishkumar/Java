/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bhavnish;

/**
 *
 * @author Cripson
 */
//Q51.Showing the Example of Scanner class
public class Q51 {
    public static void main(String args[])
    {
        java.util.Scanner n=new java.util.Scanner(System.in);
        System.out.println("Enter 1st Intger value");
        int x=n.nextInt();
         System.out.println("Enter 2nd Intger value");
        int y=n.nextInt();
        int sum=x+y;
        System.out.println("sum of "+x+" and "+y+" : "+sum);
        
        
        
    }
}
