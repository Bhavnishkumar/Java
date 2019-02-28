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
//Q46.Example for Varibale in Interface
interface temp {
    int max = 10;
}

class A32 implements temp {
    public void getMax() {
        System.out.println(max);
    }
}

public class Q46 {

    public static void main(String args[]) {
        A32 ob = new A32();
        ob.getMax();
       
    }
}
