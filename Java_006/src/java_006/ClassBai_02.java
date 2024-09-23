/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class ClassBai_02 {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> ds = new ArrayList<String>();

    public void menu() {
        int choice;
        do {
            System.out.println("================");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp danh sách giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");
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
                    xuatDanhSachNgauNhien();
                    break;
                }
                case 4: {
                    sapXepDanhSachGiamDan();
                    break;
                }
                case 5: {
                    timVaXoaHoTen();
                    break;
                }
                case 6:{
                    System.exit(0);
                }
                default:
                    System.out.println("Bạn nhập sai !!");
            }
        } while (choice != 6);
    }

    public void nhapDanhSach() {
        System.out.println("Nhập danh sách họ tên (nhấn dấu cách để kết thúc)");
        sc.nextLine();
        while(true){
            System.out.println("Họ tên: ");
            String fullName = sc.nextLine();
            ds.add(fullName);
            if(" ".equals(fullName)){
                break;
            }
        }
        
    }

    public void xuatDanhSach() {
        for (String x : ds) {
            System.out.println(x);
        }
    }

    public void xuatDanhSachNgauNhien() {
        Collections.shuffle(ds);
        xuatDanhSach();
    }

    public void sapXepDanhSachGiamDan() {
        Collections.sort(ds, Collections.reverseOrder());
        xuatDanhSach();
    }
    
    public boolean xoa(){
        sc.nextLine();
        System.out.println("Nhập họ tên cần xóa: ");
        String name = sc.nextLine();
        for(String x:ds){
            if(x.equalsIgnoreCase(name)){
                return ds.remove(x);
            }
        }
        return false;
    }

    public void timVaXoaHoTen() {
        if(xoa()){
            System.out.println("Xóa thành công !");
        }else{
            System.out.println("Xóa không thành công !");
        }
        System.out.println("Danh sách sau khi xóa: ");
        xuatDanhSach();
    }
}
