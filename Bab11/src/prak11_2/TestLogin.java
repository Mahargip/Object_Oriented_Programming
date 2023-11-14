/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak11_2;

/**
 *
 * @author mapam
 */
public class TestLogin {
    public static void main(String args[]) {
        Mahasiswa fadilah = new Mahasiswa("fadilah", "123456", "083853501388");
//        fadilah.setUsername("fadilah");
//        fadilah.setPassword("123456");
//        fadilah.setPhone("083853501388");
        boolean result = fadilah.login("083853501388", "123456");
        System.out.println(result ? "Login berhasil" : "Login gagal");

        Dosen fahrul = new Dosen("fahrul", "123456", "19990129");
//        fahrul.setKey("19990129");
        result = fahrul.login("fahrul", "123456", "19990129");
        System.out.println(result ? "Login berhasil" : "Login gagal");
    }
}
