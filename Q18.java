//Q18.use default constructer
package Bhavnish;
class defaultConstructerDemo
{
    int y=20;
    defaultConstructerDemo()
       {
           System.out.println("Default constructer called");
           y=40;
       }
    void display()
       {
           System.out.println("value of y : "+y);
       }
}
public class Q18 {
    public static void main(String[] args) {
      defaultConstructerDemo obj=new defaultConstructerDemo();
      obj.display();
    } 
}

