/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest.pkg1;
import java.util.Scanner;

/**
 *
 * @author mapam
 */
public class PostTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int limit;
        
        System.out.print("Masukkan index : ");
        limit = scan.nextInt();
        
        Persegi persegi[] = new Persegi[limit];
        Segitiga segitiga[] = new Segitiga[limit];
        Lingkaran lingkaran[] = new Lingkaran[limit];
        Jajar jajar[] = new Jajar[limit];
        Balok balok[] = new Balok[limit];
        Kubus kubus[] = new Kubus[limit];
        
        for(int i = 0; i < limit; i++){
            persegi[i] = new Persegi(i+1);
            System.out.println("Persegi ke-" + (i+1));
            System.out.println("Luas : " + persegi[i].luas());
            System.out.println("Keliling : " + persegi[i].keliling());
            System.out.println();
        }
        
        for(int i = 0; i < limit; i++){
            segitiga[i] = new Segitiga(i+1);
            System.out.println("Segitiga ke-" + (i+1));
            System.out.println("Luas : " + segitiga[i].luas());
            System.out.println("Keliling : " + segitiga[i].keliling());
            System.out.println();
        }
        
        for(int i = 0; i < limit; i++){
            lingkaran[i] = new Lingkaran(i+1);
            System.out.println("Lingkaran ke-" + (i+1));
            System.out.println("Luas : " + lingkaran[i].luas());
            System.out.println("Keliling : " + lingkaran[i].keliling());
            System.out.println();
        }
        
        for(int i = 0; i < limit; i++){
            jajar[i] = new Jajar(i+1);
            System.out.println("Jajar Genang ke-" + (i+1));
            System.out.println("Luas : " + jajar[i].luas());
            System.out.println("Keliling : " + jajar[i].keliling());
            System.out.println();
        }
        
        for(int i = 0; i < limit; i++){
            balok[i] = new Balok(i+1);
            System.out.println("Balok ke-" + (i+1));
            System.out.println("Luas : " + balok[i].luas());
            System.out.println("Volume : " + balok[i].volume());
            System.out.println();
        }
        
        for(int i = 0; i < limit; i++){
            kubus[i] = new Kubus(i+1);
            System.out.println("Kubus ke-" + (i+1));
            System.out.println("Luas : " + kubus[i].luas());
            System.out.println("Volume : " + kubus[i].volume());
            System.out.println();
        }
        
        
    }
    
}
