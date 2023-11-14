/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author mapam
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
    
    public void ambilUang(int jumlah) throws Exception{
        if (saldo < jumlah) throw new Exception("Saldo tidak cukup");
        saldo -= jumlah;
    }
}
