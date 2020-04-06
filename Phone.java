package ro.siit;

public interface Phone {
    void addContact(int number, String phoneNumber, String firstName, String lastName);
    void seeContact();
    void sendMessage(String message);
    void seeMessage();
    void makeACall();
    void seeAllCallsHistory();
    void listContacts();
    void listMessages();
    void call(String phoneNumber);
    void viewHistory();

}
