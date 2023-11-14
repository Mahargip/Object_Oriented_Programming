/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak13_3;

/**
 *
 * @author mapam
 */
public class Manajer extends Pegawai{
    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    
    public int infoGaji(){
        return gaji;
    }
    
    public int infoTunjangan(){
        return tunjangan;
    }
}
