
package jframe;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;


public class Main {
    private ArrayList<String> history = new ArrayList<String>();
    private JFrame frame;
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Main app = new Main();
            app.frame1();
        });
    }
    
    public ArrayList<String> getHistory() {
        return history;
    }
    
    public void addHistory(String history) {
        this.history.add(history);
    }
    
    public void frame1() {
        this.frame = new Frame1(this);
        windowsPop();
    }
    
    public void frame2() {
        this.frame = new Frame2(this);
        windowsPop();
    }
    public void frame3() {
        this.frame = new Frame3(this);
        windowsPop();
    }
    public void frame4() {
        this.frame = new Frame4(this);
        windowsPop();
    }
    public void frame5() {
        this.frame = new Frame5(this);
        windowsPop();
    }
    public void frame6() {
        this.frame = new Frame6(this);
        windowsPop();
    }
    public void frame7() {
        this.frame = new Frame7(this);
        windowsPop();
    }
    public void frame8() {
        this.frame = new Frame8(this);
        windowsPop();
    }
    public void frame9() {
        this.frame = new Frame9(this);
        windowsPop();
    }
    public void frame10() {
        this.frame = new Frame10(this);
        windowsPop();
    }
    
    private void windowsPop() {
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
    }

}



    