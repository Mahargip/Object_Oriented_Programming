/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan.pkg2;
import java.util.Scanner;
/**
 *
 * @author mapam
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Masukkan jumlah deret Fibonacci : ");
        n = scanner.nextInt();
        
        Fibonacci fibonacci = new Fibonacci(n);
        fibonacci.print();
        
        scanner.close();
    }
    
}
