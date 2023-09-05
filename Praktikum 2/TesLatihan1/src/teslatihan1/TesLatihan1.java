/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslatihan1;

/**
 *
 * @author mapam
 */
public class TesLatihan1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo akhir : " + tabungan.saldo);    
    }
}
