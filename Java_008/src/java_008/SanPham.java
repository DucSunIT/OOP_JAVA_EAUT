/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_008;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class SanPham {

    Scanner sc = new Scanner(System.in);
    ArrayList<SanPham> sp = new ArrayList<SanPham>();
    private String tenSanPham;
    private double giaSanPham;
    private String hangSanPham;

    public SanPham() {
    }

    public SanPham(String tenSanPham, double giaSanPham, String hangSanPham) {
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
        this.hangSanPham = hangSanPham;
    }

    // get and set
    public String getTenSanPham() {
        return this.tenSanPham;
    }

    public double getGiaSanPham() {
        return this.giaSanPham;
    }

    public String getHangSanPham() {
        return this.hangSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public void setHangSanPham(String hangSanPham) {
        this.hangSanPham = hangSanPham;
    }

    public void nhap() {
        System.out.println("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + i);
            System.out.println("Nhập tên sản phẩm: ");
            String ten = sc.nextLine();
            System.out.println("Nhập giá sản phẩm: ");
            double gia = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập hãng sản phẩm: ");
            String hang = sc.nextLine();
            sp.add(new SanPham(ten, gia, hang));

            System.out.println("----------------------");
        }
    }

    public void xuat() {
        System.out.println("SẢN PHẨM VỪA NHẬP: ");
        for (SanPham x : sp) {
            System.out.println("Tên sản phẩm: " + x.getTenSanPham()
                    + ", Giá sản phẩm: " + x.getGiaSanPham() + ", Hãng sản phẩm: " + x.getHangSanPham());
        }
    }

    public void xuatSanPhamTheoHang() {
        System.out.println("--------------------------");
        System.out.println("Nhập vào hãng: ");
        String hang = sc.nextLine();
        System.out.println("SẢN PHẨM CÓ HÃNG " + hang.toUpperCase());
        for (int i = 0; i < sp.size(); i++) {
            if (hang.equalsIgnoreCase(sp.get(i).getHangSanPham())) {
                System.out.println("Tên sản phẩm: " + sp.get(i).getTenSanPham()
                    + ", Giá sản phẩm: " + sp.get(i).getGiaSanPham() + ", Hãng sản phẩm: " + sp.get(i).getHangSanPham());
            }
        }
    }
}
