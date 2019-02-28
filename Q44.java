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

//Q44.Example for Creating a User defined interface 
interface owninterface {

    int x = 34;

    void display();
}

class b implements owninterface {

    @Override
    public void display() {
        System.out.println("value of x is " + x);
    }

}

public class Q44 {

    public static void main(String args[]) {
        b obj = new b();
        obj.display();
    }
}
