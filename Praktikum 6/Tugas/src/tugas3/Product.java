/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author mapam
 */
public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    
    public Product(String productId, String productName, double price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void sell(int amount){
        if(amount <= quantity){
            quantity -= amount;
            System.out.println(amount + " " + productName + " telah dibeli.");
        }else{
            System.out.println("Jumlah " + productName + " telah habis.");
        }
    }
    
    public void displayInfo(){
        System.out.println("Product Id : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println();
    }
}
