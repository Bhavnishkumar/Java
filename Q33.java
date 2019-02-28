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
//Q33.Write a program to show the final data member in class
class Bike9 {

    final int speedlimit = 40;

    void disrun() {
        System.out.println(speedlimit);
    }

}

public class Q33 {

    public static void main(String args[]) {
        Bike9 obj = new Bike9();
        obj.disrun();
    }
}
