/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_001;

import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class Java_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = sc.nextInt();
        double delta = Math.sqrt(b*b - 4*a*c);
        System.out.println("Delta : " + delta);
        
    }
}
