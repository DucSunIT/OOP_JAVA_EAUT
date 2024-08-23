/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_003;

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
        // Kiểm tra số nguyên tố by DucSunIT
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        if(kiemTraSNT(n)){
            System.out.println(n + " là số nguyên tố");
        }else{
            System.out.println(n + " không phải là số nguyên tố");
        }
        
    }
    public static boolean kiemTraSNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
