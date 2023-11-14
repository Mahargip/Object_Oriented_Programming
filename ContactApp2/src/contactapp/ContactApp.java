package contactapp;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import view.*;
import entity.*;

public class ContactApp {
    private JFrame app;
    private AccountManager accountManager;
    public int currentUser = -1; 
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatNordIJTheme());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        SwingUtilities.invokeLater(() -> {
            ContactApp app = new ContactApp();
            app.showLoginView();
        });
    }

    public ContactApp() {
        this.app = new JFrame("Contact");
        this.accountManager = new AccountManager();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 470);
        app.setVisible(true);
        app.setLocationRelativeTo(null);
    }

    public AccountManager getAccountManager() {
        return accountManager;
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
        app.setSize(400, 200);
    }

    public void showContactView() {
        changeView(new ContactView(this));
        app.setSize(450, 500);
    }

    public void showDisplayView(Contact contact) {
        changeView(new DisplayView(this, contact));
        app.setSize(350, 400);
    }

    public void showAddContactView() {
        changeView(new AddContact(this));
        app.setSize(450, 300);
    }

    public void showMyDetailView() {
        changeView(new MyDetail(this));
        app.setSize(400, 300);
    }

    private void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
    }

    public Account getCurrentAccount() {
        if (currentUser != -1) {
            return accountManager.getAccount(currentUser);
        }
        return null;
    }

    public void setCurrentUser(int index) {
        currentUser = index;
    }

    public int getCurrentUser() {
        return currentUser;
    }

    public boolean login(String firstName, String lastName) {
        try {
            int index = accountManager.getIndexAccount(firstName, lastName);
            currentUser = index;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void register(String firstName, String lastName) {
        accountManager.registerAccount(firstName, lastName);
    }
}
