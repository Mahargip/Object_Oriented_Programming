/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan3;

/**
 *
 * @author mapam
 */
public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;
    
    public Kelas(int kode, String nama){
        this.kodekelas = kode;
        this.namakelas = nama;
    }
    
    public void setMhs(Mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}
