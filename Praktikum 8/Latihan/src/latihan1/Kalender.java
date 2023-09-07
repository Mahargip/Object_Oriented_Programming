/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author mapam
 */
public class Kalender {
    public int tanggal;
    public int bulan;
    public int tahun;
    
    public Kalender(int tanggal){
        this.tanggal = tanggal;
        bulan = 1;
        tahun = 2000;
    }
    
    public Kalender(int bulan, int tahun){
        this.bulan = bulan;
        this.tahun = tahun;
        tanggal = 1;
    }
    
    public Kalender(int tanggal, int bulan, int tahun){
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public int getTanggal(){
        return tanggal;
    }
    
    public int getBulan(){
        return bulan;
    }
    
    public int getTahun(){
        return tahun;
    }
    
    public void setTanggal(int tanggal){
        this.tanggal = tanggal;
    }
    
    public void setBulan(int bulan){
        this.bulan = bulan;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    
}
