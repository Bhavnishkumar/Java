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

//Q48.Example for Dynamic method Dispatch through interface
interface temp1 {

    int x = 34;

    void show();
}

class B1 implements temp1{

    public void show() {
        System.out.println("In B. x : " + x);
    }
}

class C1 implements temp1 {

    public void show() {
        System.out.println("In C. x : " + x);
    }
}

public class Q48 {

    public static void main(String args[]) {
        temp1 obj = new B1();
        obj.show();
        obj = new C1();
        obj.show();
    }
}
