/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change So_B2 license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit So_B2 template
 */
package java_004;

import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class So_B2_Static {
    private static int numberOne;
    private static int numberTwo;
    
    public So_B2_Static(){}
    
    // method
    public static void nhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        So_B2_Static.numberOne = sc.nextInt();
        System.out.println("Nhập số thứ 2: ");
        So_B2_Static.numberTwo = sc.nextInt();
    }
    
    public static int Cong(){
        return So_B2_Static.numberOne + So_B2_Static.numberTwo;
    }
    
    public static int Tru(){
        return So_B2_Static.numberOne - So_B2_Static.numberTwo;
    }
    
    public static int Nhan(){
        return So_B2_Static.numberOne*So_B2_Static.numberTwo;
    }
    
    public static float Chia(){
        return ((float)So_B2_Static.numberOne / So_B2_Static.numberTwo);
    }
}
