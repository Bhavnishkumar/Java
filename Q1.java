//Q1.name character in new line with blinking
package Bhavnish;

import static java.lang.Thread.sleep;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) throws Exception {
        String str = "";
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        str = s.next();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(str.charAt(i));
                sleep(500);
                System.out.print("\b");
                sleep(500);

            }

            System.out.println(str.charAt(i));
        }
    }

}
