/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_001;

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
        System.out.println("Nhập họ tên: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        float diemTrungBinh = sc.nextFloat();
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
                
        
    }
    
}
