/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak12_1;

/**
 *
 * @author mapam
 */
public class MySomeOne {
    public static void main(String args[]){
        MyChild MyChi = new MyChild(10, 20, 30);
        MyParent MyPar = new MyParent(10, 20);
        int x = MyChi.addMe(10, 20, 30);
        int y = MyChi.addMe(MyChi);
        int z = MyPar.addMe(MyPar);
        System.out.println(x + y + z);
    }
}
