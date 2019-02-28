//use copy constructer
package Bhavnish;
class copyConstructerDemo
{
    int y=20;
    copyConstructerDemo(int x)
       {
           System.out.println("Parameter constructer called");
           y=x;
       }
    copyConstructerDemo(copyConstructerDemo obj)
       {
           System.out.println("copy constructer called");
           y=obj.y;
       }
    void display()
       {
           System.out.println("value of y : "+y);
       }
}
public class Q20 {
    public static void main(String[] args) {
      copyConstructerDemo obj=new copyConstructerDemo(12);
      obj.display();
      copyConstructerDemo obj2=new copyConstructerDemo(obj);
      obj2.display();
    } 
}

