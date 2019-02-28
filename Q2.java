//enter password from user and display as star
package Bhavnish;

import java.io.Console;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

      Console console = System.console();
        char[] password = console.readPassword();
        for(int i=0;i<password.length;i++)
        {
            System.out.print("*");
        }
       
     
       // System.out.println("Password entered by user: " + new String(password));
        
                
    }
    
}
