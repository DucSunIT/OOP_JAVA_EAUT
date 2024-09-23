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
public class Java_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int chieuDai = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int chieuRong = sc.nextInt();
        System.out.println("Diện tích: " + chieuDai*chieuRong);
        System.out.println("Chu vi: " + (chieuDai+chieuRong)*2);
        System.out.println("Cạnh nhỏ nhất: " + Math.min(chieuDai, chieuRong));
    }
}
