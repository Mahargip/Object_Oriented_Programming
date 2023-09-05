/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg2;
import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Masukkan tahun (1900 - 2005) : ");
        n = scanner.nextInt();
        if(n < 1900)
            System.out.println("Maaf, tahun input dibawah 1900");
        else if(n > 2005)
            System.out.println("Maaf, tahun input diatas 2005");
        else if(n % 4 == 0)
            System.out.println(n + " adalah tahun kabisat");
        else
            System.out.println(n + " bukan tahun kabisat");
    }
    
}
