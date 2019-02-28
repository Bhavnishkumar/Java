//method overloading
package Bhavnish;
class methodOverloadingDemo
{
    void add()
       {
           System.out.println(6+4);
       }
     void add(int x, int y)
       {
           System.out.println(x+y);
       }
       
}
public class Q22 {

    public static void main(String[] args) {
     methodOverloadingDemo obj1=new methodOverloadingDemo();
     obj1.add();
     obj1.add(34,34);
    }
    
}
