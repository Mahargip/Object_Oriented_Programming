/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts = new ArrayList<>();
    private int jumlahAccount = 0;
    
    public void registerAccount(String namaAwal, String namaAkhir){
        if (!isAccountExist(namaAwal, namaAkhir)){
            Account account = new Account(namaAwal, namaAkhir);
            accounts.add(account);
            jumlahAccount++;
        }
    }

    public int getJumlahAccount() {
        return jumlahAccount;
    }
    
    public List<Account> getAccountList() {
        return accounts;
    }
    
    public Account getAccounts(int index){
        return this.accounts.get(index);
    }
    
    public int getIndexAccounts(String namaAwal, String namaAkhir) throws Exception {
        int index = 0;
        for (Account accounts : this.accounts){
            if(accounts.getNamaAwal().equals(namaAwal) && accounts.getNamaAkhir().equals(namaAkhir)){
                return index;
            }
            index++;
        }
        throw new Exception(":Not Found");
    }
    
    public boolean login(String namaAwal, String namaAkhir){
        for (Account account : accounts){
            if (account.getNamaAwal().equals(namaAwal) && account.getNamaAkhir().equals(namaAkhir)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isAccountExist(String namaAwal, String namaAkhir){
        for (Account account : accounts){
            if (account.getNamaAwal().equals(namaAwal) && account.getNamaAkhir().equals(namaAkhir)){
                return true;
            }
        }
        return false;
    }
}
