/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak13_3;

/**
 *
 * @author mapam
 */
public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    public int infoGaji(){
        return gaji;
    }
    
    public int infoBonus(){
        return bonus;
    }
}
