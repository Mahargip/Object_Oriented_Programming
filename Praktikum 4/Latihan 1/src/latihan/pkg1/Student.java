/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pkg1;

/**
 *
 * @author mapam
 */
public class Student {
    int nrp;
    String nama;
    int rpl;
    int bd;
    int pbo;
    
    public Student(int nrp, String nama, int rpl, int bd, int pbo){
        this.nrp = nrp;
        this.nama = nama;
        this.rpl = rpl;
        this.bd = bd;
        this.pbo = pbo;
    }
    
    public double calculateAverage(){
        return (rpl + bd + pbo) / 3;
    }
    
    public String toPrint(){
        return "NRP: " + nrp + ", Nama: " + nama + ", RPL: " + rpl + ", BD: " + bd + ", PBO: " + pbo;
    }
}
