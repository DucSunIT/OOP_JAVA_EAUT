/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_005;

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
        SanPham sp1 = new SanPham();
        System.out.println("Nhập tên sản phẩm: ");
        sp1.setTenSanPham(sc.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        sp1.setGia(sc.nextDouble());
        System.out.println("Nhập giảm giá sản phẩm: ");
        sp1.setGiamGia(sc.nextDouble());
        System.out.println("Tên sản phẩm: " + sp1.getTenSanPham() + ", Giá: " + sp1.getGia() + ", Giảm giá: " + sp1.getGiamGia());        
        


        // bai 3 
        SanPham sp2 = new SanPham("Sản Phẩm 2", 20, 10);
        sp2.thongTinSanPham();
        SanPham sp3 = new SanPham("Sản phẩm 3", 40);
        sp3.thongTinSanPham();
    }

}
