/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg1;

/**
 *
 * @author mapam
 */
public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai[] = new int[3];
        double rerata = 0;
        
        nilai[0] = 70;
        nilai[1] = 80;
        nilai[2] = 65;
        
        for(int i = 0; i < nilai.length; i ++)
            rerata += nilai[i];
        rerata /= nilai.length;
        
        System.out.println("Nilai rata-rata = " + rerata);
    }
    
}
