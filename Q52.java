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
import java.io.*;
//Q52.Showing the Example of dataInputStream class
public class Q52 {


  public static void main(String args[]) throws IOException
  {
    DataInputStream dis = new DataInputStream(System.in);
    System.out.println("Enter your name: ");
    String str1 = dis.readLine();
    System.out.println("Your Name is: " + str1);
    dis.close();
  }
}
