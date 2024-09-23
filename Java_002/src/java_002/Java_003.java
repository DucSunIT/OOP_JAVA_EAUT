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
public class Java_003 {

    public static void main(String[] args) {
        // Tính tiền điện by DucSunIT
        Scanner sc = new Scanner(System.in);
        int soDien;
        double tienDien;
        // nếu người dùng nhập số điện <0 nhập lại
        do {
            System.out.println("Nhập số điện sử dụng : ");
            soDien = sc.nextInt();
        } while (soDien < 0);
        if (soDien > 0 && soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50*1000 + (soDien-50)*1200;
        }
        System.out.println("Số tiền điện là: " + tienDien);
    }
}
