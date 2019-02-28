/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bhavnish;

/**
 *
 * @author Cripson
 */

//Q55.Showing the Example of fileInputStream class
import java.io.*;


public class Q55 {

    public static void main(String args[]) throws IOException {
        FileInputStream fin = new FileInputStream("file.txt");
        System.out.println("FileContents :");
        int ch;
        while ((ch = fin.read()) != -1) {
            System.out.print((char) ch);
        }
        fin.close();
    }
}
