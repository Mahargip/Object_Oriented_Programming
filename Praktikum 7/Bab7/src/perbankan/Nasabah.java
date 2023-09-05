/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author mapam
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public String getNamaAwal(){
        return namaAwal;
    }
    
    public String getNamaAkhir(){
        return namaAkhir;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
    public Tabungan getTabungan(){
        return tabungan;
    }
}
