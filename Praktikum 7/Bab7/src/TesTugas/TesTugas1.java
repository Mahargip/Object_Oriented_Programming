/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesTugas;
import perbankan.*;
/**
 *
 * @author mapam
 */
public class TesTugas1 {
    public static void main(String[] args){
        Pegawai pegawai1 = new Pegawai(12345, "John Doe");
        Pegawai pegawai2 = new Pegawai(67890);
        Pegawai pegawai3 = new Pegawai(54321, "Jane Smith");

        System.out.println("Pegawai 1 - NIP: " + pegawai1.nip + ", Nama: " + pegawai1.nama);
        System.out.println("Pegawai 2 - NIP: " + pegawai2.nip + ", Nama: " + pegawai2.nama);
        System.out.println("Pegawai 3 - NIP: " + pegawai3.nip + ", Nama: " + pegawai3.nama);
    }
}
