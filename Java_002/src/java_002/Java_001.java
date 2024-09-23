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
public class Java_001 {

    public static void main(String[] args) {
        // Phương trình bậc nhất by DucSunIT
        Scanner sc = new Scanner(System.in);
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
        }else{
            System.out.println("Nghiệm của phương trình : " + (float)-b/a );
        }

    }
}
