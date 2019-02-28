//garbage collection using of finalize block
package Bhavnish;
class garbage
{
    void display()
       {
           System.out.println("display");
       }
}
public class Q21 {

    public static void main(String[] args)
       {
     garbage g=new garbage();   
     g=null;
     garbage a=new garbage();   
     garbage b=new garbage();   
     a=b;
     System.gc();
       }
    protected void finalize() throws Exception
       {
           System.out.println("garbage collected");        
       }
    
}
