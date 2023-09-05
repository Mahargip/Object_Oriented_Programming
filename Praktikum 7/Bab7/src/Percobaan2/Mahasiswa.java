/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan2;

/**
 *
 * @author mapam
 */
public class Mahasiswa {
    private int nrp;
    private String nama;
   
    public Mahasiswa(){
        this(0, "");
    }
    
    public Mahasiswa(String nama){
        this(0, nama);
    }
    
    public Mahasiswa(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }
    
    public void cetak(){
        System.out.println("Nama : " + nama);
        System.out.println("NRP : " + nrp);
    }
}
