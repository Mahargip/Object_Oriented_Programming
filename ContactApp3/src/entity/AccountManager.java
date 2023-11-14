package entity;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    public void registerAccount(String firstName, String lastName) {
        if (!isAccountExist(firstName, lastName)) {
            Account account = new Account(firstName, lastName);
            accounts.add(account);
        }
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public List<Account> getAccountList() {
        return accounts;
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }

    public int getIndexAccount(String firstName, String lastName) throws Exception {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getFirstName().equals(firstName) && account.getLastName().equals(lastName)) {
                return i;
            }
        }
        throw new Exception("Account not found");
    }

    public boolean login(String firstName, String lastName) {
        for (Account account : accounts) {
            if (account.getFirstName().equals(firstName) && account.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAccountExist(String firstName, String lastName) {
        for (Account account : accounts) {
            if (account.getFirstName().equals(firstName) && account.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
