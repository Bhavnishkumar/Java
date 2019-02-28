//how to create object
package Bhavnish;
class objectDemo
{
   
    int y=20;
    void display()
       {
           System.out.println(y);
       }
    
}
public class Q16 {
    public static void main(String[] args) {
      objectDemo obj; //references object
      obj=new objectDemo(); //references assign 
      obj.display();
      objectDemo obj2=new objectDemo(); //initialization
      obj2.display();
    } 
}
