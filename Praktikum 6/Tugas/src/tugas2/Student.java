/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author mapam
 */
public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private double score;
    
    public Student(String studentId, String studentName, int age, double score){
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.score = score;
    }
    
    public String getStudentId(){
        return studentId;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getScore(){
        return score;
    }
    
    public void study(){
        System.out.println(studentName + " sedang belajar di perpustakaan");
    }
    
    public void displayInfo(){
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Age : " + age);
        System.out.println("Score : " + score);
    }
}
