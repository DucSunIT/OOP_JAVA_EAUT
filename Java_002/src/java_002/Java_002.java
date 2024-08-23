/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_002;

import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class Java_002 {

    public static void main(String[] args) {
        // phương trình bậc hai by DucSunIT
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhập hệ số a: ");
        a = sc.nextInt();
        System.out.println("Nhập hệ số b: ");
        b = sc.nextInt();
        System.out.println("Nhập hệ số c: ");
        c = sc.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt x1 = " + x1 + "; x2 = " + x2);
        }
    }
}
