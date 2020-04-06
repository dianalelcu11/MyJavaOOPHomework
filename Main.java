package ro.siit;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {

            Phone phone = new Samsung8("red", "plastic", "02727cs");

             phone.addContact(1, "2626262672", "Adam", "Bils");
             phone.addContact(2, "7272727222", "Bob", "Core");
             phone.listContacts();

             phone.sendMessage("Hi, Adam");
             phone.listMessages();

             phone.call("2626262672");
             phone.viewHistory();
    }
}
