//use parametert constructer
package Bhavnish;
class parameterConstructerDemo
{
    int y=20;
    parameterConstructerDemo(int x)
       {
           System.out.println("Parameter constructer called");
           y=x;
       }
    void display()
       {
           System.out.println("value of y : "+y);
       }
}
public class Q19 {
    public static void main(String[] args) {
      parameterConstructerDemo obj=new parameterConstructerDemo(12);
      obj.display();
    } 
}

