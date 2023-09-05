/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg1;

/**
 *
 * @author mapam
 */
public class Segitiga {
    int sisi;
    
    public Segitiga(int sisi){
        this.sisi = sisi;
    }
    
    public int luas(){
        return (sisi * sisi) / 2;
    }
    
    public int keliling(){
        return 3 * sisi;
    }
}
