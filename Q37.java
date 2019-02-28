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
//Q37.Write a program to Displaying the Functionality of All public function of String class
public class Q37 {

    public static void main(String args[]) {

        String Str = new String(" Bhavnish ");

        System.out.println("Uppercase: " + Str.toUpperCase());
        System.out.println("Lowercase" + Str.toLowerCase());
        System.out.println("toString: " + Str.toString());

        System.out.println("Trim String: " + Str.trim());
        System.out.println("substring:" + Str.substring(5, 8));
        System.out.println("Match condition:" + Str.matches("Hello"));
        System.out.println("Replace first: " + Str.replaceFirst("Bhavnish", "Program"));
        System.out.println("Length of String: " + Str.length());
        System.out.println("indexof : " + Str.indexOf("a"));
        String b1 = new String("Hello");
        System.out.println("equal condtion: " + Str.equals(b1));

        char result = Str.charAt(8);
        System.out.println("CharAt: " + result);

        double d = 102939939.939;
        boolean b = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(arr));
    }
}
