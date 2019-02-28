//Write a program to show multi level inheritence
package Bhavnish;
class x
{
    int x=30;
}
class y extends x
{
    void display()
       {
           System.out.println(x);
       }
}
class z extends y
{
    void display2()
       {
           System.out.println(x);
       }
}
public class Q25 {

    public static void main(String[] args) {
       z obj=new z();
       obj.display2();
    }
    
}
