//enter the relationship of your family
package Bhavnish;

public class Q13 {

    public static void main(String[] args) {
    String names[][]=new String[3][];
    names[0]=new String[1];
    names[1]=new String[2];
    names[2]=new String[4];
   
    
    names[0][0]="Bhavnish";
    
    names[1][0]="Deepak";
    names[1][1]="Sanjey";
    
    names[2][0]="Karan";
    names[2][1]="Ajay";
    names[2][2]="Avneet";
    names[2][3]="Jyoti";
    
    
   
   
    for(int i=0; i<names.length; i++)
       {
           for(int j=0; j<names[i].length; j++)
              {
                  if(j>0)
                      System.out.println(" |- "+names[i][j]);
                  else
                      System.out.println(names[i][j]);
              }
           
       }
    
    }
    
}
 