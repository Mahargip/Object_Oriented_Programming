/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertion;

import java.util.Scanner;

/**
 *
 * @author mapam
 */

class Calculate{
    Scanner scan;
    int num;
    void getNum(){
        scan = new Scanner(System.in);
        System.out.println("Masukkan angka desimal : ");
        num = Integer.parseInt(scan.nextLine());
    }
    void convert(){
        String hexa = Integer.toHexString(num);
        System.out.println("Hasil Heksadesimal : " + hexa);
        String binary = Integer.toBinaryString(num);
        System.out.println("Hasil Biner : " + binary);
    }
}

public class Convertion {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.getNum();
        obj.convert();
    }    
}
