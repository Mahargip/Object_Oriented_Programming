/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

/**
 *
 * @author mapam
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean status;
        MultiTabungan tabungan = new MultiTabungan(1000000);
        
        tabungan.simpanUang(250000, "idr");
        tabungan.simpanUang(3, "aud");
        tabungan.simpanUang(5, "usd");
        
        status = tabungan.ambilUang(500000, "idr");
        System
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        
        status = tabungan.ambilUang(10, "aud");
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        
        status = tabungan.ambilUang(6, "aud");
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        
        status = tabungan.ambilUang(5, "usd");
        if(status)
            System.out.println("OK");
        else
            System.out.println("Gagal");
        
        System.out.println("Saldo IDR: " + tabungan.getSaldo("IDR"));
        System.out.println("Saldo USD: " + tabungan.getSaldo("USD"));
        System.out.println("Saldo AUD: " + tabungan.getSaldo("AUD"));
    }
    
}
