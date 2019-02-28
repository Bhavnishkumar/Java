//WAP to show dynamic method dispatch in inheritence
package Bhavnish;
class a3
{
    int x=30;
    void display()
       {
           System.out.println("class a2 display");
       }
}
class b3 extends a3
{
    void display()
       {
           System.out.println("class b2 display");
       }
}
public class Q30 {

    public static void main(String[] args) {
       a3 obj=new b3();
       obj.display();
    }
    
}
