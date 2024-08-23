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
public class Java_003 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Mảng by DucSunIT
        System.out.println("Nhập số lượng phần tử mảng: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        nhapMang(arr, n);
        System.out.println("Mảng là: ");
        xuatMang(arr, n);
        System.out.println();
        System.out.println("Mảng tăng dần: ");
        sapXepTangDan(arr, n);
        xuatMang(arr, n);
        System.out.println();
        System.out.println("Phần tử nhỏ nhất của mảng là: " + phanTuNN(arr, n));
        System.out.println("Trung bình cộng các số chi hết cho 3 : " + trungBinhCong(arr, n));
    }
    // Nhập mảng
    public static void nhapMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần thứ ar[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    // xuất mảng
    public static void xuatMang(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // sắp xếp mảng tăng dần
    public static void sapXepTangDan(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // phần tử có giá trị nhỏ nhất
    public static int phanTuNN(int[] arr, int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Trung bình cộng các phần tử chia hết cho 3
    public static double trungBinhCong(int[] arr, int n) {
        double count = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                ++count;
            }
        }
        return sum / count;
    }
}
