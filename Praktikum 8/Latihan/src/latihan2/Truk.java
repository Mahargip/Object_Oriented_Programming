/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author mapam
 */
public class Truk {
    private double muatan;
    private double muatanmaks;
    
    public Truk(double beratmaks){
        muatanmaks = beratmaks * 9.8;
        muatan = 0;
    }
    
    public double getMuatan(){
        return muatan / 9.8;
    }
    
    public double getMuatanMaks(){
        return muatanmaks / 9.8;
    }
    
    public boolean tambahMuatan(double berat){
        if((berat*9.8) + muatan <= muatanmaks){
            muatan += (berat*9.8);
            return true;
        }else{
            return false;
        }
            
    }
    
    public double newsToKilo(double berat){
        return berat / 9.8;
    }
    
    public double kiloToNewts(double berat){
        return berat * 9.8;
    }
        
}
