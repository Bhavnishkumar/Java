//WAP to show single level inheritence
package Bhavnish;
class a5
{
    int x=30;
}
class b5 extends a5
{
    void display()
       {
           System.out.println(x);
       }
}
public class Q24 {

    public static void main(String[] args) {
       b5 obj=new b5();
       obj.display();
    }
    
}
