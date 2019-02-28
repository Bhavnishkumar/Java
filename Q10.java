package Bhavnish;
//enter array from user and sort them
public class Q10 {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter size of array : ");
        int arraySize=sc.nextInt();
        int num[]=new int[arraySize];
        for(int i=0; i<arraySize; i++)
           {
               System.out.print("Enter num["+i+"] : ");
               num[i]=sc.nextInt();
           }
        java.util.Arrays.sort(num);
        System.out.print("sort array : ");
        for(int tempNum: num)
           {
               System.out.print(tempNum+" ");
           }
        System.out.println("");
    }
    
}
