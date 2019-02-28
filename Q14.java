//create class and each type of access specifier
package Bhavnish;
class access
{
    private int x=10;
    int y=20;
    protected int z=30;
    public int a=40;   
}
public class Q14 {
    public static void main(String[] args) {
      access obj=new access();
        //System.out.println(obj.x); private member of class cannot access outside the class
        System.out.println("value of default access specifier : "+obj.y);
        System.out.println("value of protected access specifier : "+obj.z);
        System.out.println("value of public access specifier : "+obj.a);
    } 
}
