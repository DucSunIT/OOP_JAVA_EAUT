/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change TamGiac license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit TamGiac template
 */
package java_004;

import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class TamGiac_Static {

    public static int canh1;
    public static int canh2;
    public static int canh3;

    public TamGiac_Static() {
    }

    public static void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập canh 1: ");
        TamGiac_Static.canh1 = sc.nextInt();
        System.out.println("Nhập canh 2: ");
        TamGiac_Static.canh2 = sc.nextInt();
        System.out.println("Nhập canh 3: ");
        TamGiac_Static.canh3 = sc.nextInt();
    }
    
    public static int chuVi(){
        return TamGiac_Static.canh1 + TamGiac_Static.canh2 + TamGiac_Static.canh3;
    }
    
    public static double dienTich(){
        double p = (TamGiac_Static.canh1 + TamGiac_Static.canh2 + TamGiac_Static.canh3)/2;
        return Math.sqrt(p*(p-TamGiac_Static.canh1)*(p-TamGiac_Static.canh2)*(p-TamGiac_Static.canh3));
        
    }
}
