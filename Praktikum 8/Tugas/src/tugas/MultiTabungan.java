/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author mapam
 */
public class MultiTabungan {
    private int idr;
    private int aud;
    private int usd;
    
    private final int kursAUD = 10000;
    private final int kursUSD = 9000;
    
    public MultiTabungan(int idr){
        this.idr = idr;
        this.aud = 0;
        this.usd = 0;
    }
    
    public int getSaldo(String mataUang){
        switch(mataUang.toLowerCase()){
            case "idr":
                return idr;
            case "aud":
                return aud;
            case "usd":
                return usd;
            default:
                return 0;
        }
    }
    
    public void simpanUang(int jumlah, String mataUang){
        switch(mataUang.toLowerCase()){
            case "idr":
                idr += jumlah;
                break;
            case "aud":
                aud += jumlah;
                break;
            case "usd":
                usd += jumlah;
                break;
        }
    }
    
    public boolean ambilUang(int jumlah, String mataUang){
        switch(mataUang.toLowerCase()){
            case "idr":
                if(idr >= jumlah){
                    idr -= jumlah;
                    return true;
                }
                break;
            case "aud":
                if(aud >= jumlah * kursAUD){
                    aud -= jumlah * kursAUD;
                    return true;
                }
                break;
            case "usd":
                if(usd >= jumlah * kursUSD){
                    usd -= jumlah * kursUSD;
                    return true;
                }
                break;
        }
        return false;
    }
}
