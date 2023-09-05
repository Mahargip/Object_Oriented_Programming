/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1;
import java.util.Scanner;
/**
 *
 * @author mapam
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Masukkan berapa deret Fibonacci : ");
        n = scanner.nextInt();
        System.out.print(n + " deret Fibonacci = ");
        for(int i = 1; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int i){
        if(i == 0)
            return 0;
        else if(i == 1)
            return 1;
        else
            return fibonacci(i - 1) + fibonacci(i - 2);
    }
    
}
