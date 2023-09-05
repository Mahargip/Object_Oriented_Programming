/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author mapam
 */
public class Shape {
    double width;
    double length;
    double height;
    double volume;
    
    public Shape(double length, double width, double height){
        this.width = width;
        this.length = length;
        this.height = height;
        this.volume = calculateVolume();
    }
    
    
    public double compareTo(Shape shape){
        double volumeThis = this.volume;
        double volumeOther = shape.volume;
        return Math.abs(volumeThis - volumeOther);
    }
    
    private double calculateVolume(){
        return length * width * height;
    }
    
    public void cetak(){
        System.out.println("Panjangxlebarxtinggi = " + length + "x" + width + "x" + height);
        System.out.println("Volume = " + volume);
    }
}
