/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg2;
import java.text.NumberFormat;
/**
 *
 * @author mapam
 */
public class Percobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3);
        
        int nilai[][] = new int[2][3];
        nilai[0][0] = 85;
        nilai[0][1] = 81;
        nilai[0][2] = 78;
        nilai[1][0] = 65;
        nilai[1][1] = 73;
        nilai[1][2] = 71;
        
        String MK[] = {"RPL", "PBO"};
        double ratarataMK[] = new double[nilai.length];
        
        for (int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai[0].length; j++){
                ratarataMK[i] += nilai[i][j];
            }
            ratarataMK[i] /= nilai[0].length;
        }
        
        System.out.println("\tNilai Mata Kuliah");
        System.out.println("MK\tMinggu1\tMinggu2\tMinggu3\tRata-Rata");
        
        for(int i = 0; i < nilai.length; i++){
            System.out.print(MK[i] + "\t");
            for(int j = 0; j < nilai[0].length; j++){
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.print(nf.format(ratarataMK[i]) + "\n");
        }
    }
    
}
