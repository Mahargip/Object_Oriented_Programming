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
    
    public Pegawai(int nip_pegawai){
        this(nip_pegawai, "NoName");
    }
    
    public Pegawai(int nip_pegawai, String nama_pegawai){
        this.nip = nip_pegawai;
        this.nama = nama_pegawai;
    }
}

