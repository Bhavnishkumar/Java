
package Bhavnish;

/**
 *
 * @author Cripson
 */
//Q32.Write a program to show the example of Abstract class without abstract fucntion
abstract class Shape1 {

    public void msgDisplay() {
        System.out.println("Hello Editor");
    }
}

class Rectangle1 extends Shape1 {

}

class Circle2 extends Shape1 {

}

public class Q32 {

    public static void main(String args[]) {
        Shape1 s = new Circle2();

        s.msgDisplay();
    }
}
