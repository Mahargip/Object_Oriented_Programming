/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.LinkedList;
import java.util.List;

public class Account {
    private String namaAwal;
    private String namaAkhir;
    private LinkedList<Contact> contact;
    private Profile profile;
    private int jumlahContact = 0;
    
    public Account(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.contact = new LinkedList<>();
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }
    
    public void addContact(String name, String number, String email) {
        Contact newContact = new Contact(name, number, email);
        contact.add(newContact);
        jumlahContact++;
    }

    public void removeContact(int index){
        this.contact.remove(index);
        this.jumlahContact -= 1;
    }
    
    public void updateContact(int index, Contact newContact){
        this.contact.remove(index);
        this.contact.add(newContact);
    }
    
    public int getJumlahContact(){
        return this.jumlahContact;
    }
    
    public Contact getContact(int index){
        return this.contact.get(index);
    }
    
    public int getIndexContact(String name, String number, String email)throws Exception{
        int index = 0;
        for (Contact contact : this.contact) {
            if (contact.getName().equals(name)) {
                return index;
            }
            index++;
        }
        throw new Exception("Not Found");
    }
    
    public boolean isContactExist(String name){
        for (Contact contact : this.contact) {
            if (contact.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
