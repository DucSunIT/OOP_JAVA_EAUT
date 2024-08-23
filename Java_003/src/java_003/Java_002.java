/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_003;

/**
 *
 * @author ducsunit
 */
public class Java_002 {
    public static void main(String[] args) {
        // Bảng cửu chương by DucSunIT
        bangCuuChuong();
    }
    
    public static void bangCuuChuong(){
        for(int i=2; i<10; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("----------");
        }
            
    }
}
