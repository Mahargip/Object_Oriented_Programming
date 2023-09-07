/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author mapam
 */
public class latihan2 {
    public static void main(String[] args){
        boolean status;
        
        Truk truk = new Truk(900);
        System.out.println("Muatan maksimal = " + truk.getMuatanMaks());
        status = truk.tambahMuatan(500);
        System.out.println("Tambah muatan : 500");
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        
        status = truk.tambahMuatan(300);
        System.out.println("Tambah muatan : 300");
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        
        status = truk.tambahMuatan(150);
        System.out.println("Tambah muatan : 150");
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        
        status = truk.tambahMuatan(50);
        System.out.println("Tambah muatan : 50");
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        System.out.println("Muatan sekarang = " + truk.getMuatan());
            
    }
}
