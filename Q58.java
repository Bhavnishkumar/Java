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
//Q58.Showing the Example of fileWriter class
import java.io.FileWriter; 
import java.io.IOException; 


public class Q58 
{ 
    public static void main(String[] args) throws IOException 
    { 
        String str = "Example of FileWrite:\n"+"Bhavnish"; 
        FileWriter fw=new FileWriter("file4.txt"); 
        for (int i = 0; i < str.length(); i++) 
            fw.write(str.charAt(i)); 
  
        //close the file 
        fw.close(); 
    } 
} 
