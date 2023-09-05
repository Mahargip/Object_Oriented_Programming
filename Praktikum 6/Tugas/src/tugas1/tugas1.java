/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author mapam
 */
public class tugas1 {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("W3576PB", "Maha", 1000);
        BankAccount account2 = new BankAccount("B9742LS", "Ezra", 2000);
        
        account1.displayInfo();
        account2.displayInfo();
        
        System.out.println();
        
        account1.deposit(500);
        account2.withdraw(800);
        
        System.out.println();
        
        account1.displayInfo();
        account2.displayInfo();
    }
}
