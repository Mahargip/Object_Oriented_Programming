/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author mapam
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean status;
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.getSaldo());
        
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        
        status = tabungan.ambilUang(6000);
        System.out.println("Jumlah uang yang diambil : 6000");
        
        if(status)
            System.out.println("Berhasil!");
        else
            System.out.println("Gagal.");
        
        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        
        status = tabungan.ambilUang(4000);
        System.out.println("Jumlah uang yang diambil : 4000");
        
        if(status)
            System.out.println("Berhasil!");
        else
            System.out.println("Gagal.");
        
        status = tabungan.ambilUang(1600);
        System.out.println("Jumlah uang yang diambil : 1600");
        
        if(status)
            System.out.println("Berhasil!");
        else
            System.out.println("Gagal.");
        
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        System.out.println("Saldo sekarang = " + tabungan.getSaldo());
                
    }
    
}
