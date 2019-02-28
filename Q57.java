/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bhavnish;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Cripson
 */
//Q57.Showing the Example of fileReader class
public class Q57 {

    public static void main(String[] args) throws IOException {

        int ch;

        FileReader fr = null;
        try {
            fr = new FileReader("file4.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}
