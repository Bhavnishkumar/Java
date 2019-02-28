//WAP to show use of super() to call explicit constructer of super class in inheritence
package Bhavnish;
class a1
{
    int x=30;
    a1(int x)
       {
           System.out.println("class a1 parameter constructer called");
       }
}
class b1 extends a1
{
    int x=45;  
    b1()
       {
           super(12);
           System.out.println("class b1 default constructer called");
       }
    void display()
       {
           System.out.println("class n value of x : "+x);
       }
}
public class Q28 {

    public static void main(String[] args) {
       b1 obj=new b1();
       obj.display();
    }
    
}
