/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author mapam
 */
public class tugas2 {
    public static void main(String[] args){
        Student student1 = new Student("12", "Maha", 20, 3.8);
        Student student2 = new Student("16", "Ezra", 19, 3.5);
        
        student1.displayInfo();
        student1.study();
        
        System.out.println();
        
        student2.displayInfo();
        student2.study();
        
        
    }
}
