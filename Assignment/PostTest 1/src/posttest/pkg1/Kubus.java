/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg1;

/**
 *
 * @author mapam
 */
public class Kubus {
    int sisi;
    Persegi persegi;
    
    public Kubus(int sisi){
        this.persegi = new Persegi(sisi);
        this.sisi = sisi;
    }
    
    public int luas(){
        int luasPersegi = persegi.luas();
        return luasPersegi * 6;
    }
    
    public int volume(){
        return sisi * sisi * sisi;
    }
}
