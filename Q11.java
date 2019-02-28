//enter two matrix from user and multiply them
package Bhavnish;

public class Q11 {

    public static void main(String[] args) {
        int matrix1[][],matrix2[][],result[][],sum=0;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter row and col of matrix1 : ");
        int rowCol=sc.nextInt();
        matrix1=new int[rowCol][rowCol];
        
        System.out.println("Enter valurs : ");
        for(int i=0; i<rowCol; i++)
           {
               for(int j=0; j<rowCol; j++)
                  {
                      System.out.print("matrix1["+i+"]["+j+"] : ");
                      matrix1[i][j]=sc.nextInt();
                  }
           }
        System.out.print("Enter row and col of matrix2 : ");
        rowCol=sc.nextInt();
        matrix2=new int[rowCol][rowCol];
        System.out.println("Enter valurs : ");
        for(int i=0; i<rowCol; i++)
           {
               for(int j=0; j<rowCol; j++)
                  {
                      System.out.print("matrix2["+i+"]["+j+"] : ");
                      matrix2[i][j]=sc.nextInt();
                  }
           }
        result=new int[rowCol][rowCol];
        //multiply matrix
        for(int i=0; i<rowCol; i++)
           {
               for(int j=0; j<rowCol; j++)
                  {   sum=0;
                      for(int k=0; k<rowCol; k++)
                         {
                             sum=sum+matrix1[i][k]*matrix2[k][j];
                             result[i][j]=sum;
                           
                         }
                  }
           }
        System.out.println("output : ");
        for(int i=0; i<rowCol; i++)
           {
               for(int j=0; j<rowCol; j++)
                  {
                      System.out.print(result[i][j]+" ");
                  }
               System.out.println("");
           }
        
    }
    
}
