/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author mapam
 */
public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    
    public BankAccount(String accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public String getAccountName(){
        return accountName;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit uang sebesar " + amount + " ke dalam akun " + accountNumber);
        }else{
            System.out.println("Deposit uang salah. Coba lagi.");
        }
    }
    
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Mengambil " + amount + " dari akun " + accountNumber);
        }else{
            System.out.println("Tidak dapat mengambil uang.");
        }
    }
    
    public void displayInfo(){
        System.out.println("Accout Number : " + accountNumber);
        System.out.println("Account Name : " + accountName);
        System.out.println("Balance : " + balance);
    }
}
