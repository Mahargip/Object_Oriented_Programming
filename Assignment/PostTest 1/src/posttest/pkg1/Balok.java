/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg1;

/**
 *
 * @author mapam
 */
public class Balok {
    int sisi;
    Persegi persegi;
    
    public Balok(int sisi){
        this.persegi = new Persegi(sisi);
        this.sisi = sisi;
    }
    
    public int luas(){
        int luasPersegi = persegi.luas();
        return luasPersegi * 10;
    }
    
    public int volume(){
        return (2*sisi) * sisi * sisi;
    }
}
