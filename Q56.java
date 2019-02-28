/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bhavnish;

import java.io.FileOutputStream;

/**
 *
 * @author Cripson
 */
//Q56.Showing the Example of fileOutputStream class
public class Q56 {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("file1.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
