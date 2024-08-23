/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_004;

import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class Bai_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Nhân viên by DucSunIT
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        NhanVien_B1[] nv = new NhanVien_B1[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + i);
            nv[i] = new NhanVien_B1();
            nv[i].nhapThongTin();
        }
        
        for(NhanVien_B1 nhanVien:nv){
            nhanVien.xuatThongTin();
        }
       
    }

}
