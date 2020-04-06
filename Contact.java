package ro.siit;

public class Contact implements Phone {
    public String message;
    public int call;
    public int number;
    public String phoneNumber;
    public String firstName;
    public String lastName;

    public Contact(String message, int call, int number, String phoneNumber, String firstName, String lastName) {
        this.message = message;
        this.call = call;
        this.number = number;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void addContact(int number, String phoneNumber, String firstName, String lastName) {
        return message;
    }

    @Override
    public void seeContact() {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void seeMessage() {

    }

    @Override
    public void makeACall() {

    }

    @Override
    public void seeAllCallsHistory() {

    }
}
