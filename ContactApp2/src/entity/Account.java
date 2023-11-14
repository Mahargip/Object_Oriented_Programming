package entity;
import java.util.LinkedList;
import java.util.List;

public class Account {
    private String firstName;
    private String lastName;
    private List<Contact> contacts;
    private Profile profile;

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = new LinkedList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addContact(String name, String number, String email) {
        Contact newContact = new Contact(name, number, email);
        contacts.add(newContact);       
    }

    public void removeContact(int index) {
        contacts.remove(index);
    }

    public void updateContact(int index, Contact newContact) {
        contacts.set(index, newContact);
    }

    public int getNumberOfContacts() {
        return contacts.size();
    }
    
    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public boolean hasContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
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

