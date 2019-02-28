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
//Q34.Write a program to show the final member function in class
class Bike {

    final void disrun() {
        System.out.println("running");
    }
}

class Honda extends Bike {

    
}

public class Q34 {

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.disrun();
    }
}
