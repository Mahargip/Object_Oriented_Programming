/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pkg2;

/**
 *
 * @author mapam
 */
public class Fibonacci {
    int jumlah;
    
    public Fibonacci(int n){
        jumlah = n;
    }
    
    public int rekursi(int i){
        if(i == 0)
            return 0;
        else if(i == 1)
            return 1;
        else
            return rekursi(i-1) + rekursi(i - 2);
    }
    
    public void print(){
        for(int i = 0; i < jumlah; i++){
            System.out.print(rekursi(i) + " ");
        }
        System.out.println();
    }
}
