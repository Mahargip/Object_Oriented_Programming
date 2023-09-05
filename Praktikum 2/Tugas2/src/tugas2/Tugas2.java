/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author mapam
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "minibus", 2000, 7);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "minibus", 2000, 7);
        Mobil mobil4 = new Mobil("Honda", "Merah", "minibus", 2000, 7);
        
        System.out.println("Info Mobil 1 : ");
        mobil1.infoMobil();
        
        System.out.println("Info Mobil 2 : ");
        mobil2.infoMobil();
        
        System.out.println("Info Mobil 3 : ");
        mobil3.infoMobil();
        
        System.out.println("Info Mobil 4 : ");
        mobil4.infoMobil();
    }
    
}
