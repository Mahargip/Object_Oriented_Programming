/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg1;



/**
 *
 * @author mapam
 */
public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char firstInitial = 'a';
        System.out.println("Masukkan huruf awal nama anda: ");
        try{
            firstInitial = (char)System.in.read();
        } catch (Exception e){
            System.out.println("Error : " + e.toString());
        }
        
        if(firstInitial == 'a')
            System.out.println("Nama anda pasti Asep!");
        else if(firstInitial == 'b')
            System.out.println("Nama anda pasti Brodin!");
        else if(firstInitial == 'c')
            System.out.println("Nama anda pasti Cecep!");
        else
            System.out.println("Nama anda tidak terkenal!");
    }
    
}
