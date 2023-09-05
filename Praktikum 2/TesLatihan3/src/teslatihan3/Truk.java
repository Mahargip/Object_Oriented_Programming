/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslatihan3;

/**
 *
 * @author mapam
 */
public class Truk {
    double muatan = 0;
    double muatanmaks;
    
    public Truk(double beratmaks){
        muatanmaks = beratmaks;
    }
    
    public double getMuatan(){
        return muatan;
    }
    
    public double getMuatanMaks(){
        return muatanmaks;
    }
    
    public double tambahMuatan(double berat){
        if(muatan + berat < muatanmaks){
            muatan = muatan + berat;
        } 
        return muatan;
    }
}
