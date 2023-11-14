/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak12_1;

import java.awt.Point;

/**
 *
 * @author mapam
 */
public class SegiEmpat {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public void buatSegiEmpat(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void buatSegiEmpat(Point topLeft, Point bottomRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
    }
    
    public void buatSegiEmpat(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
    }
    
    void cetakSegiEmpat(){
        System.out.print("Segiempat: <" + x1 + ", " + y1);
        System.out.println(", " + x2 + ", " + y2 + ">");
    }
    
//    public static void main(String[] args) {
//        SegiEmpat rect = new SegiEmpat();
//        System.out.println("Buat segiempat dengan koordinat (25,25) dan (50,50)");
//        rect.buatSegiEmpat(25, 25, 50, 50);
//        rect.cetakSegiEmpat();
//        System.out.println();
//        System.out.println("Buat segiempat dengan point (10,10) dan point (20,20) : ");
//        
//        rect.buatSegiempat(new Point(10,10), new Point(20,20));
//        rect.cetakSegiempat();
//        System.out.println();
//    }
}
