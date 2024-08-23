/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_003;

import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class Java_004 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Sinh viên by DucSunIT
        System.out.println("Nhập số lượng phần tử mảng: ");
        int n = sc.nextInt();
        String[] arrName = new String[n];
        double[] arrDiem = new double[n];
        sc.nextLine();
        nhapSinhVien(arrName, arrDiem, n);
        System.out.println("Thông tin sinh viên: ");
        kiemTraHocLuc(arrName, arrDiem, n);
        System.out.println("------------------------");
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        sapXepSinhVien(arrDiem, n);
        kiemTraHocLuc(arrName, arrDiem, n);
    }

    // nhập sinh viên
    public static void nhapSinhVien(String[] arr, double[] arrDiem, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập họ tên sinh viên thứ " + i);
            arr[i] = sc.nextLine();
            System.out.println("Nhập điểm tên sinh viên thứ " + i);
            arrDiem[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    // xuất sinh viên 
    public static void xuatSinhVien(String[] arr, double[] arrDiem, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", " + arrDiem[i]);
        }
    }

    // kiểm tra học lực và xuất thông tin sinh viên
    public static void kiemTraHocLuc(String[] arr, double[] arrDiem, int n) {
        for (int i = 0; i < n; i++) {
            if (arrDiem[i] < 5) {
                System.out.println(arr[i] + ", " + arrDiem[i] + " học lực yếu");
            } else if (arrDiem[i] >= 5 && arrDiem[i] < 6.5) {
                System.out.println(arr[i] + ", " + arrDiem[i] + " học lực trung bình");
            } else if (arrDiem[i] >= 6.5 && arrDiem[i] < 7.5) {
                System.out.println(arr[i] + ", " + arrDiem[i] + " học lực khá");
            } else if (arrDiem[i] >= 7.5 && arrDiem[i] < 9) {
                System.out.println(arr[i] + ", " + arrDiem[i]+ " học lực giỏi");
            } else {
                System.out.println(arr[i] + ", " + arrDiem[i]+" học lực xuất sắc");
            }
        }
    }
    
    // sắp xếp sinh viên tăng dần 
    public static void sapXepSinhVien(double[] arrDiem, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arrDiem[i] > arrDiem[j]){
                    double temp = arrDiem[i];
                    arrDiem[i] = arrDiem[j];
                    arrDiem[j] = temp;
                }
            }
        }
    }

}
