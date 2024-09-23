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
public class Java_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh lập phương: ");
        double a = sc.nextInt();
        System.out.println("Thể tích lập phương: " + Math.pow(a,3));
    }
}
