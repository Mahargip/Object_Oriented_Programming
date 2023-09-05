/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg1;

/**
 *
 * @author mapam
 */
public class Lingkaran {
    int sisi;
    
    public Lingkaran(int sisi){
        this.sisi = sisi;
    }
    
    public int luas(){
        return 22/7 * sisi * sisi;
    }
    
    public int keliling(){
        return 22/7 * (sisi*2);
    }
}
