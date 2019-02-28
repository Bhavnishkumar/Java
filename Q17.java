//reference object example
package Bhavnish;
class reference
{
   
    int y=20;
    void display()
       {
           System.out.println("Y value is:"+y);
       }
}
public class Q17 {
    public static void main(String[] args) {
     reference obj=new reference();
      obj.display();
      reference obj2; //references object
      obj2=obj;
      obj2.y=100;
      obj.display();

    } 
}
