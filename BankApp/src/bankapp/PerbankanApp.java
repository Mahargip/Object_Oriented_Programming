/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankapp;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.*;
import perbankan.Bank;
/**
 *
 * @author mapam
 */
public class PerbankanApp {
    private JFrame app;
    private Bank bank;
    public int currentUser;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatNordIJTheme() );
        } catch(Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        SwingUtilities.invokeLater(() -> {
            PerbankanApp app = new PerbankanApp();
            app.bank.tambahNasabah("test", "test");
            app.showLoginView();
        });
    }
    
    public PerbankanApp(){
        this.app = new JFrame("BankApp");
        this.bank = new Bank();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 470);
        app.setVisible(true);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }
    
    public Bank getBank() {
        return this.bank;
    }
    
    public void showAdminHomeView() {
        changeView(new AdminHomeView(this));
        app.setSize(800, 500);
    }
    
    public void showLoginView() {
        changeView(new LoginView(this));
        app.setSize(350, 470);
    }
    
    public void showRegisterView() {
        changeView(new RegisterView(this));
        app.setSize(350, 470);
    }
    
    public void showHomeView() {
        changeView(new HomeView(this));
        app.setSize(350, 500);
    }
    
    public void showTopUpView() {
        changeView(new TopUpView(this));
        app.setSize(350, 350);
    }
    
    public void showAmbilView() {
        changeView(new AmbilView(this));
        app.setSize(350, 350);
    }
    
    
    private void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
    }
}
