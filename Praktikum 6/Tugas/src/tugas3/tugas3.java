/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author mapam
 */
public class tugas3 {
    public static void main(String[] args){
        Product product1 = new Product("M1012", "Mouse", 500, 3);
        Product product2 = new Product("L9481", "Laptop", 1000, 1);
        
        product1.displayInfo();
        product2.displayInfo();
        
        System.out.println();
        
        product1.sell(2);
        product2.sell(1);
        
        System.out.println();
        
        product1.displayInfo();
        product2.displayInfo();
        
        
    }
}
