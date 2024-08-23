/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_008;

import java.util.regex.Pattern;

/**
 *
 * @author ducsunit
 */
public class KiemTraDuLieu {

    public boolean checkEmail(String str) {
        String checkValueEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(checkValueEmail);
    }

    public boolean checkSDT(String str) {
        String checkValueDienThoai = "0\\d{9}";
        return str.matches(checkValueDienThoai);
    }

    public boolean checkCCCD(String str) {
        String checkValueCCCD = "\\d{12}";
        return str.matches(checkValueCCCD);
    }
    
    public boolean checkBienSoXe(String str){
        String checkValueBienSo = "17-B[1-9]{1}-[0-9]{3}\\.[0-9]{2}";
        return str.matches(checkValueBienSo);
    }
}
