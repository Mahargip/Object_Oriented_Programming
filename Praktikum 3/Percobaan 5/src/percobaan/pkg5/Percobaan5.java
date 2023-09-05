/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg5;

/**
 *
 * @author mapam
 */
public class Percobaan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 1;
        int i = 0;
        while (i < 9){
            int j = 0;
            while (j < i+1){
                System.out.print(count);
                j++;
            }
            count++;
            System.out.println();
            i++;
        }
    }
    
}
