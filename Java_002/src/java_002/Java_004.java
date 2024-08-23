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
public class Java_004 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Menu by DucSunIT
        int choice;
        do{
            System.out.println("============DucSunIT=============");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("0. Thoát chương trình !");
            System.out.println("=================================");
            System.out.println("Mời bạn nhập lựa chọn : ");
            choice = sc.nextInt();
            switch(choice){
                case 0:{
                    System.exit(0);
                    break;
                }
                case 1:{
                    phuongTrinhBacNhat();
                    break;
                }
                case 2:{
                    phuongTrinhBacHai();
                    break;
                }
                case 3:{
                    tinhTienDien();
                    break;
                }
                default: 
                    System.out.println("Bạn nhập sai !!");
            }
        }while(choice!=0);
    }

    public static void phuongTrinhBacNhat() {
        // Phương trình bậc nhất by DucSunIT
        int a, b;
        System.out.println("Nhập hệ số a: ");
        a = sc.nextInt();
        System.out.println("Nhập hệ số b: ");
        b = sc.nextInt();
        if (a == 0) {
            if (b != 0) {
                System.out.println("Phương trình vô nghiệm !");
            } else {
                System.out.println("Phương trình vô số nghiệm !");
            }
        } else {
            System.out.println("Nghiệm của phương trình : " + (float) -b / a);
        }
    }
    
    public static void phuongTrinhBacHai(){
        int a, b, c;
        System.out.println("Nhập hệ số a: ");
        a = sc.nextInt();
        System.out.println("Nhập hệ số b: ");
        b = sc.nextInt();
        System.out.println("Nhập hệ số c: ");
        c = sc.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt x1 = " + x1 + "; x2 = " + x2);
        }
    }
    
    public static void tinhTienDien(){
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
