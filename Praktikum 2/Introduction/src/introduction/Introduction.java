/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduction;

/**
 *
 * @author mapam
 */

import java.util.Scanner;

public class Introduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Siswa anak = new Siswa();
        anak.setNrp(5);
        anak.setNama("Maha");
        System.out.println(anak.nama);
        System.out.println(anak.nrp);
    }
    
}
