//WAP to show use of super in inheritence
package Bhavnish;
class m
{
    int x=30;
    void display()
       {
           System.out.println("class m k x ki value : "+x);
       }
}
class n extends m
{
    int x=45;    
    void display2()
       {
           System.out.println("class m value of x : "+super.x);
           System.out.println("class n value of x : "+x);
       }
}
public class Q27 {

    public static void main(String[] args) {
       n obj=new n();
       obj.display2();
    }
    
}
