/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import jframe.*;
import javax.swing.*;

/**
 *
 * @author mapam
 */
public class MainFrame {
    private JFrame mainFrame;
    
    public static void main(String[] args){
        MainFrame app = new MainFrame();
        app.showFrame0();
    }
    
    public MainFrame() {
        mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(false);
        windowsPop();
    }
    
    public JFrame getMainFrame(){
        return mainFrame;
    }
    
    public void showFrame0() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame0(this);
        windowsPop();
    }

    public void showFrame1() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame1(this);
        windowsPop();
    }
    
    public void showFrame2() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame2(this);
        windowsPop();
    }
    
    public void showFrame3() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame3(this);
        windowsPop();
    }
    
    public void showFrame4() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame4(this);
        windowsPop();
    }
    
    public void showFrame5() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame5(this);
        windowsPop();
    }
    
    public void showFrame6() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame6(this);
        windowsPop();
    }
    
    public void showFrame7() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame7(this);
        windowsPop();
    }
    
    public void showFrame8() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame8(this);
        windowsPop();
    }
    
    public void showFrame9() {
        //mainFrame.setVisible(false);
        mainFrame = new Frame9(this);
        windowsPop();
    }
     
    private void windowsPop() {
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
    
    public String nameFrame(){
        String className = getMainFrame().getClass().getSimpleName();
        return className;
    }
    
}



