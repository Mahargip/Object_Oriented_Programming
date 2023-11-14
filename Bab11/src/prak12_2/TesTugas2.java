/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak12_2;

/**
 *
 * @author mapam
 */
public class TesTugas2 {
    public static void main(String args[]){
        Kecebong satu = new Kecebong(5, "Froggy");
        Kecebong dua = new Kecebong(2, "Junior Frog", 10);
        
        System.out.println("Umur : " + satu.getUmur() + "\tNama : " + satu.getNama() + "\t\tPanjang Ekor : " + satu.getPanjangEkor() + "\tCara Bergerak : " + satu.caraBergerak());
        System.out.println("Umur : " + dua.getUmur() + "\tNama : " + dua.getNama() + "\tPanjang Ekor : " + dua.getPanjangEkor() + "\tCara Bergerak : " + dua.caraBergerak());
    }
}
