/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg4;

/**
 *
 * @author mapam
 */
public class Percobaan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 1;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
    
}
