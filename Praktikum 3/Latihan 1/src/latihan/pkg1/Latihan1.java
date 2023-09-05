/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.pkg1;
import java.util.Scanner;

/**
 *
 * @author mapam
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n;
        int faktorial;
        
        System.out.print("Masukkan bilangan faktorial: ");
        n = scanner.nextInt();
        faktorial = 1;
        System.out.println("n \t n!");
        System.out.println("-----------------------------");
        for(int i = 1; i <= n; i++){
            faktorial *= i;
            System.out.println(i + " \t " + faktorial);
        }
        System.out.println("-----------------------------");
                 
        
    }
    
}
