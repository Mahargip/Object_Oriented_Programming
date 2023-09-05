/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author mapam
 */
public class Mobil {
    String merk;
    String warna;
    String jenis;
    int harga;
    int kapasitas;
    
    public Mobil(String merk, String warna, String jenis, int harga, int kapasitas){
        this.merk = merk;
        this.warna = warna;
        this.jenis = jenis;
        this.harga = harga;
        this.kapasitas = kapasitas;
    }
    
    public void infoMobil(){
        System.out.println("Merek : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Jenis : " + jenis);
        System.out.println("Harga : " + harga);
        System.out.println("Kapasitas : " + kapasitas);
        System.out.println();
    }
}
