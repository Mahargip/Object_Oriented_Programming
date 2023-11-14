
package jframe;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;


public class Main {
    private ArrayList<String> history = new ArrayList<String>();
    private JFrame frame;
    private String currentFrameName;
    private String previousFrameName;
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.frame1("Frame ke-1");
        });
    }
    
    public ArrayList<String> getHistory() {
        return history;
    }

    public JFrame getMainFrame() {
        return frame;
    }
    
    public void addHistory(String history) {
        this.history.add(history);
    }
    
    public void frame1(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame1(this);
        windowsPop();
    }
    
    public void frame2(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame2(this);
        windowsPop();
    }
    public void frame3(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame3(this);
        windowsPop();
    }
    public void frame4(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame4(this);
        windowsPop();
    }
    public void frame5(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame5(this);
        windowsPop();
    }
    public void frame6(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame6(this);
        windowsPop();
    }
    public void frame7(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame7(this);
        windowsPop();
    }
    public void frame8(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame8(this);
        windowsPop();
    }
    public void frame9(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame9(this);
        windowsPop();
    }
    public void frame10(String previousFrameName) {
        this.previousFrameName = previousFrameName;
        this.frame = new Frame10(this);
        windowsPop();
    }
    
    public String getPreviousFrameName() {
        return previousFrameName;
    }
    
    private void windowsPop() {
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
    }

}



    