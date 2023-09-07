/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author mapam
 */
public class Pegawai {
    public int nip;
    public String nama;
    
    public Pegawai(int nip){
       this.nip = nip;
       nama = "Noname";
    }
    
    public Pegawai(int nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
}

