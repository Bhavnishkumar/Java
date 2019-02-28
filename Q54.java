package Bhavnish;

import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cripson
 */
public class Q54 {

    public static void main(String args[]) {
        File f = new File("Bhavnish.txt");
        System.out.println(f.canRead());
        System.out.println("File name : " + f.getName());
        System.out.println("Size of File in bytes: " + f.getTotalSpace());
        System.out.println("Absolute path:" + f.getAbsoluteFile());
        

    }
}
