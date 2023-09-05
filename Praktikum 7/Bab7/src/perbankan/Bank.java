/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author mapam
 */
public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;
    
    public Bank(){
        nasabah = new Nasabah[100];
        jumlahNasabah = 0;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir){
        Nasabah newNasabah = new Nasabah(namaAwal, namaAkhir);
        nasabah[jumlahNasabah] = newNasabah;
        jumlahNasabah++;
    }
    
    public int getJumlahNasabah(){
        return jumlahNasabah;
    }
    
    public Nasabah getNasabah(int indeks){
        return nasabah[indeks];
    }
}
