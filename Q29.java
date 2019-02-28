//WAP to show overriding method in inheritence
package Bhavnish;
class a2
{
    int x=30;
    void display()
       {
           System.out.println("class a2 display");
       }
}
class b2 extends a2
{
    void display()
       {
           System.out.println("class b2 display");
       }
}
public class Q29 {

    public static void main(String[] args) {
       b2 obj=new b2();
       obj.display();
    }
    
}
