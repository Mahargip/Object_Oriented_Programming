/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertion;



/**
 *
 * @author mapam
 */

import java.util.Scanner;

public class Traditional {
    
    public static void main(String[] args){        
        int menu = menu();
        Scanner num = new Scanner(System.in);
        System.out.println("Masukkan angka yang akan dikonversi : ");
        int getNum = num.nextInt();
        if(menu == 1){
            String biner = binary(getNum);
            System.out.println("Hasil konversi ke biner : " + biner);
        } else if(menu == 2){
            String hexa = hexadecimal(getNum);
            System.out.println("Hasil konversi ke hexadesimal : " + hexa);
        }
    }
    
    public static int menu(){
        Scanner menu = new Scanner(System.in);
        System.out.println("MENU KONVERSI ANGKA");
        System.out.println("1. Desimal ke Biner");
        System.out.println("2. Desimal ke Heksadesimal");
        System.out.println("Masukkan pilihan (1/2) : ");
        int getMenu = menu.nextInt();
        return getMenu;
    }
    
    public static String binary(int decimal){
        String resultBinary = "";
        while (decimal > 0){
            int modul = decimal % 2;
            resultBinary = modul + resultBinary;
            decimal = decimal / 2;
        }
        return resultBinary;
    }
    
    public static String hexadecimal(int decimal){
        if (decimal == 0) {
            return "0";
        }
        char[] hexChar = "0123456789ABCDEF".toCharArray();
        String resultHexa = "";
        while (decimal > 0) {
            int modul = decimal % 16;
            resultHexa = hexChar[modul] + resultHexa;
            decimal = decimal / 16;
        }
        return resultHexa;
    }
}