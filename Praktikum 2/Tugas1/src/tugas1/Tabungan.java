/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author mapam
 */
public class Tabungan {
    int saldo;
    
    public Tabungan(int initSaldo){
        saldo = initSaldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public int simpanUang(int jumlah){
        saldo = saldo + jumlah;
        return saldo;
    }
    
    public boolean ambilUang(int jumlah){
        if (saldo - jumlah >= 0) {
            saldo = saldo - jumlah;
            return true;
        } else {
            return false;
        }
    }
}
