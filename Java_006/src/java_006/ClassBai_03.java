/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_006;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class ClassBai_03 {

    Scanner sc = new Scanner(System.in);
    private String tenSanPham;
    private double giaSanPham;

    public ClassBai_03() {
    }

    public ClassBai_03(String tenSanPham, double giaSanPham) {
        this.tenSanPham = tenSanPham;
        this.giaSanPham = giaSanPham;
    }
    ArrayList<ClassBai_03> ds = new ArrayList<ClassBai_03>();

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public void menu() {
        int choice;
        do {
            System.out.println("================");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và in ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Giá trung bình các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.println("================");
            System.out.println("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    nhapDanhSach();
                    xuatDanhSach();
                    break;
                }
                case 2: {
                    xapXepGiaGiamDan();
                    break;
                }
                case 3: {
                    xoaSanPhamTheoTen();
                    break;
                }
                case 4: {
                    giaTrungBinhCacSanPham();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default:
                    System.out.println("Bạn nhập sai !!");
            }
        } while (choice != 6);
    }

    public void nhapDanhSach() {
        System.out.println("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên sản phẩm thứ: " + i + ": ");
            String tenSanPham = sc.nextLine();
            System.out.println("Nhập giá sản phẩm thứ " + i + ": ");
            double giaSanPham = sc.nextDouble();
            ds.add(new ClassBai_03(tenSanPham, giaSanPham));
            sc.nextLine();
        }

    }

    public void xuatDanhSach() {
        for (ClassBai_03 x : ds) {
            System.out.println("Tên sản phẩm: " + x.getTenSanPham() + ", Giá sản phẩm: " + x.getGiaSanPham());
        }
    }

    public void xapXepGiaGiamDan() {
        Comparator compe = new Comparator<ClassBai_03>() {
            @Override
            public int compare(ClassBai_03 o1, ClassBai_03 o2) {
                return Double.compare(o1.getGiaSanPham(), o2.giaSanPham);
            }
        };
        Collections.sort(ds, compe);
    }

    public boolean xoa() {
        sc.nextLine();
        System.out.println("Nhập tên sản phẩm cần xóa: ");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getTenSanPham().equals(name)) {
                ds.remove(i);
                check = true;
                break;
            }
        }
        return check;
    }

    public void xoaSanPhamTheoTen() {
        if (xoa()) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa không thành công ");
        }
        xuatDanhSach();
    }

    public void giaTrungBinhCacSanPham() {
        double sum=0;
        for(int i=0; i<ds.size(); i++){
            sum+= ds.get(i).getGiaSanPham();
        }
        System.out.println("Giá trung bình các sản phẩm: " + sum/ds.size());
    }
    
    
}
