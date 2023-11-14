/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak12_1;

/**
 *
 * @author mapam
 */
public class Dosen extends Orang{
    private int nip;

    public Dosen(String nama) {
        super(nama);
    }
    
    public Dosen(String nama, int nip){
        super(nama);
        this.nip = nip;
    }
    
    public Dosen(String nama, int nip, int umur){
        super(nama, umur);
        this.nip = nip;
    }
    
    public void Info(){
        System.out.println("Nama : " + getNama() + "\nNIP : " + getNip() + "\nUmur : " + getUmur());
    }

    public int getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}
