/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg8;

/**
 *
 * @author mapam
 */
public class Percobaan8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        Mulai:
        for(a = 0; a < 2; a++){
            for(b = 0; b < 3; b++){
                if(b == 1)
                    break Mulai;
                System.out.println("a = " + a + "; b = " + b);
            }
        }
    }
    
}
