/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;
import java. util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai3_tinhhieucua2so {
    public static void main(String[] args) {
        System.out.println("phep tinh co ban");
        Scanner sc = new Scanner (System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        
        int tong = a + b;
        System.out.println("tong = " + tong);
        
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        
        double thuong = (double) a/b;
        System.out.println(a + " / " + b + " = " + thuong);
   
   }
    private static int tong ( int a, int b){
        return a + b ; 
    }
    private static int hieu ( int a, int b){
        return a - b ; 
    }
    private static int tich ( int a, int b){
        return a * b ;
    }
    private static int thuong (int a, int b){
        if (b == 0)(
            return " khong the chia cho 0";
    } else (
    return Double.toString ((doube) a / b );{
    }
    
     
}   
} 