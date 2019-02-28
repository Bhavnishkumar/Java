//enter date from user and check it is valid or not
package Bhavnish;

public class Q12 {

    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int days=0;
        System.out.print("Enter date : ");
        int date=sc.nextInt();
        System.out.print("Enter month : ");
        int month=sc.nextInt();
        System.out.print("Enter year : ");
        int year=sc.nextInt();
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                days=28;
                break;
            default:
                System.out.println("month not valid");
        }
        
        if((1<=date&&date<=days)&&(1<=month&&month<=12)&&(1997<=year&&year<=2018))
            System.out.println("valid date");
        else
            System.out.println("not valid date ");
        
    }
    
}
