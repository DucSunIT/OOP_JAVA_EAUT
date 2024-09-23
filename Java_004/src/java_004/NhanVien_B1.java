/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_004;

import java.util.Scanner;


/**
 *
 * @author ducsunit
 */
public class NhanVien_B1 {
    public String hoTen;
    public String diaChi;
    public int tuoi;
    
    public NhanVien_B1(){}
    public NhanVien_B1(String hoTen, String diaChi, int tuoi){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }
    
    // method
    // Nhập thông tin
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diaChi = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.tuoi = sc.nextInt();
    }
    
    // Xuất thông tin 
    public void xuatThongTin(){
        System.out.println("Họ tên: " + this.hoTen + ", Địa chỉ: " + this.diaChi + ", Tuổi: " + this.tuoi);
    }
}
