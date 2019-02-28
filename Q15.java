//use of static member and member function
package Bhavnish;
class staticDemo
{
  
    static int y=20;
    static void display()
       {
           System.out.println("value of static data member : "+y);
       }
       
}
public class Q15 {
    public static void main(String[] args) {
      staticDemo.y=50;
      staticDemo.display();  
    } 
}
