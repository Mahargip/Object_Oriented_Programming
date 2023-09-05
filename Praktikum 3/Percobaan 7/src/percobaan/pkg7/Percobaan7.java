/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg7;

/**
 *
 * @author mapam
 */
public class Percobaan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        for(a = 0; a < 2; a++){
            for(b = 0; b < 3; b++){
                if(b == 1)
                    continue;
                System.out.println("a = " + a + "; b = " + b);
            }
        }
    }
    
}
