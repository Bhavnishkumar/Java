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
//Q38.Write a program to Displaying the Functionality of All public function of StringBuffer class
public class Q38 {

    public static void main(String[] args) {

        java.lang.StringBuffer h = new java.lang.StringBuffer("Bhavnish Kumar");
        h.append("is Programmer");
        System.out.println(h);
        h.insert(25, "is Student");
        System.out.println(h);
        h.replace(1, 5, "BCA");
        System.out.println(h);
        h.reverse();
        System.out.println(h);
        h.reverse();
        System.out.println("Capacity is: "+String.valueOf(h.capacity()));
        

    }
}
