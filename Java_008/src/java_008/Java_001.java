/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_008;

import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class Java_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String name = sc.nextLine();
        String ho = name.substring(0, name.indexOf(" "));
        String hoDem = name.substring(name.indexOf(" "), name.lastIndexOf(" "));
        String ten = name.substring(name.lastIndexOf(" "));
        System.out.println("Họ: " + ho.toUpperCase());
        System.out.println("Họ đệm: " + hoDem);
        System.out.println("Tên: " + ten.toUpperCase());
    }
    
}
