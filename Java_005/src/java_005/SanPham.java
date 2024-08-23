/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_005;

/**
 *
 * @author ducsunit
 */
public class SanPham {

    private String tenSanPham;
    private double gia;
    private double giamGia;

    // constructor
    public SanPham() {
    }

    public SanPham(String tenSanPham, double gia, double giamGia) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSanPham, double gia) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
    }

    // get and set 
    public String getTenSanPham() {
        return this.tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return this.gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Method
    private double tinhThue() {
        return (this.gia - this.giamGia) * ((double) 10 / 100);
    }

    public void thongTinSanPham() {
        System.out.println("Tên sản phẩm: " + this.tenSanPham
                + ", Đơn giá: " + this.gia + ", Giảm giá: " + this.giamGia
                + ", Thuế nhập khẩu: " + this.tinhThue());
    }

}
