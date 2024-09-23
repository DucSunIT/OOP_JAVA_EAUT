/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_006;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ducsunit
 */
public class Bai_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> ar = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử: ");
        float sum=0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            ar.add(sc.nextFloat());
        }
        System.out.print("Danh sách vừa nhập là: ");
        for(float x:ar){
            System.out.print(x + " ");
        }
        for(float x:ar){
            sum+=x;
        }
        System.out.println("\nTổng: " + sum);
    }
    
}
