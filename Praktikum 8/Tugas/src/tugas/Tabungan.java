/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author mapam
 */
public class Tabungan {
    private int saldo;
    private String mataUang;
    
    public Tabungan(int initsaldo, String mataUang){
        this.saldo = initsaldo;
        this.mataUang = mataUang;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        if((saldo-jumlah) >= 0){
            saldo -= jumlah;
            return true;
        }else{
            return false;
        }
    }
}
