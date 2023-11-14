/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak12_1;

/**
 *
 * @author mapam
 */
public class MyChild extends MyParent{
    int z;

    public MyChild(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public int addMe(int x, int y, int z){
        return this.x + x + this.y + y + this.z + z;
    }
    
    public int addMe(MyChild MyChi){
        return addMe(MyChi.x, MyChi.y, MyChi.z);
    }
    
    public int addMe(int x, int y){
        return this.x + x + this.y + y;
    }
}
