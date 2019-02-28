//WAP to show hierarchical inheritence
package Bhavnish;
class super_class
{
    int x=30;
}
class sub1 extends super_class
{
    int y=45;
    void display()
       {
           System.out.println("value of x : "+x);
           System.out.println("value of y : "+y);
       }
}
class sub2 extends super_class
{
    void display2()
       {
           System.out.println("value of x : "+x);
       }
}
public class Q26 {

    public static void main(String[] args) {
       sub1 obj1=new sub1();
       obj1.display();
       sub2 obj2=new sub2();
       obj2.display2();
    }
    
}
