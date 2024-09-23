/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_007;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class SinhVien {

    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
    private String hoTen;
    private String gioiTinh;
    private short tuoi;
    private double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String gioiTinh, short tuoi, double diemTrungBinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public short getTuoi() {
        return this.tuoi;
    }

    public double getDiemTrungBinh() {
        return this.diemTrungBinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setTuoi(short tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void menu() {
        int choice;
        do {
            System.out.println("================");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Xuất thông tin");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Sắp xếp danh sách theo điểm trung bình");
            System.out.println("5. Kết thúc");
            System.out.println("================");
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    nhapDanhSach();
                    break;
                }
                case 2: {
                    xuatDanhSach();
                    break;
                }
                case 3: {
                    xoaSinhVien();
                    break;
                }
                case 4: {
                    sapXepSinhVienTheoDiemTrungBinh();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default:
                    System.out.println("Bạn nhập sai !!");
            }
        } while (choice != 5);
    }

    private void nhapDanhSach() {
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập họ tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập giới tính: ");
            String gioiTinh = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            short tuoi = sc.nextShort();
            System.out.println("Nhập điểm trung bình: ");
            double diemTrungBinh = sc.nextDouble();
            sv.add(new SinhVien(name, gioiTinh, tuoi, diemTrungBinh));
            sc.nextLine();

        }

    }

    private void xuatDanhSach() {
        for (SinhVien x : sv) {
            System.out.println("Họ tên: " + x.getHoTen() + ", Giới tính: "
                    + x.getGioiTinh() + ", Tuổi: " + x.getTuoi() + ", Điểm trung bình: " + x.getDiemTrungBinh() + ", Học lực: " + diemTrungBinh(x.getDiemTrungBinh()));
        }
    }

    private String diemTrungBinh(double dtb) {
        if (dtb >= 9) {
            return "Suất Xắc";
        } else if (dtb >= 8) {
            return "Giỏi";
        } else if (dtb >= 7) {
            return "Khá";
        } else if (dtb >= 5) {
            return "Trung Bình";
        } else if (dtb >= 3.5) {
            return "Yếu";
        } else {
            return "Kém";
        }
    }
    
    public boolean xoa(){
        sc.nextLine();
        System.out.println("Nhập tên sinh viên cần xóa: ");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < sv.size(); i++) {
            if (sv.get(i).getHoTen().equals(name)) {
                sv.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }
    private void xoaSinhVien() {
        if(xoa()) System.out.println("Xóa thành công !");
        else {
            System.out.println("Xóa không thành công");
        }
        xuatDanhSach();
    }

    private void sapXepSinhVienTheoDiemTrungBinh() {
        
    }
}
