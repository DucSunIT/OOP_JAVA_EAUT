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
public class SinhVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
    KiemTraDuLieu kt = new KiemTraDuLieu();
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String chungMinhThu;
    private String bienSoXe;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String email, String soDienThoai, String chungMinhThu, String bienSoXe) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.chungMinhThu = chungMinhThu;
        this.bienSoXe = bienSoXe;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSoDienThoai() {
        return this.soDienThoai;
    }

    public String getChungMinhThu() {
        return this.chungMinhThu;
    }

    public String getBienSoXe() {
        return this.bienSoXe;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setChungMinhThu(String chungMinhThu) {
        this.chungMinhThu = chungMinhThu;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public void nhap() {
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        String ten = null;
        String email = null;
        String so = null;
        String cccd = null;
        String bien = null;
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Nhập tên sinh viên: ");
                ten = sc.nextLine();
                if (!ten.equals(" ")) {
                    break;
                } else {
                    System.err.println("Họ tên không được để trống !");
                }
            } while (true);

            do {
                System.out.println("Nhập email: ");
                email = sc.nextLine();
                if (kt.checkEmail(email)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng !!!");
                }
            } while (true);
            do {
                System.out.println("Nhập số điện thoại: ");
                so = sc.nextLine();
                if (kt.checkSDT(so)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng !!!");
                }
            } while (true);

            do {
                System.out.println("Nhập số chứng minh: ");
                cccd = sc.nextLine();
                if (kt.checkCCCD(cccd)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng !!!");
                }
            } while (true);
            do {
                System.out.println("Nhập biển số xe: ");
                bien = sc.nextLine();
                if (kt.checkBienSoXe(bien)) {
                    break;
                } else {
                    System.err.println("Nhập sai định dạng !!!");
                }
            } while (true);
            sv.add(new SinhVien(ten, email, so, cccd, bien));
        }
    }

    public void xuat() {
        for (SinhVien x : sv) {
            System.out.println("Họ tên: " + x.getHoTen() + ", Email: "
                    + x.email + ", Số điện thoại: " + x.getSoDienThoai() + ", CCCD: " 
                    + x.getChungMinhThu() + ", Biển số xe: " + x.getBienSoXe());
        }
    }
}
