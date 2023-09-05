/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathapp;

/**
 *
 * @author mapam
 */
public class Prima {
    int jumlah;
    
    public Prima(int n){
        jumlah = n;
    }
    
    public boolean isPrima(int num){
        if(num <= 1)
            return false;
        
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0)
                return false;
        }
        
        return true;
    }
    
    public void print(){
        int count = 0;
        int num = 2;
        
        while(count < jumlah){
            if(isPrima(num)){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
