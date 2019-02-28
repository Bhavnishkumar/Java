//Q31.WAP to show abstract class with abstract function in inheritence
package Bhavnish;
abstract class a4
{
    int x=30;
    abstract void get();
    abstract void display();

}
class b4 extends a4
{
    void get()
       {
           System.out.println("get method called");
       }
    void display()
       {
           System.out.println("value of x : "+x);
       }
}
public class Q31 {

    public static void main(String[] args) {
       b4 obj=new b4();
       obj.get();
       obj.display();
    }
    
}
