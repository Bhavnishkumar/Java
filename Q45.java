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

//Q45.Example for multiple inheritence using interface
interface PI1 {

    default void show() {
        System.out.println("Default PI1");
    }
}

interface PI2 {

    default void show() {
        System.out.println("Default PI2");
    }
}

class A5 implements PI1, PI2 {

    public void show() {
        PI1.super.show();
        PI2.super.show();
    }

}

public class Q45 {

    public static void main(String args[]) {
        A5 d = new A5();
        d.show();
    }
}
