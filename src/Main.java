import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Main myContact = new Main();
        myContact.run();
    }

    public void run() {
        final int EXIT = 0;
        final int SHOW = 1;
        final int ADD = 2;
        final int DELETE = 3;
        System.out.println("######### My Contact #########");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Press 0 to exit.");
            System.out.println("1. Show | 2. Add | 3. Delete");
            int input = scan.nextInt();
            if (input == EXIT) {
                break;
            }
            switch (input) {
                case SHOW: {
                    show();
                    break;
                }
                case ADD: {
                    add();
                    break;
                }
                case DELETE: {
                    delete();
                    break;
                }
                default: {

                }
            }
        }
    }

    private void show() {
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.name + " Email: " + contact.email + " Phone: " + contact.phoneNumber);
        }
    }

    private void add() {
        Scanner scan = new Scanner(System.in);
        String name;
        String email;
        String phone;
        System.out.print(" Name: ");
        name = scan.next();
        System.out.print(" Email: ");
        email = scan.next();
        System.out.print(" Phone: ");
        phone = scan.next();

        Contact contact = new Contact();
        contact.name = name;
        contact.email = email;
        contact.phoneNumber = phone;
        contacts.add(contact);
    }

    private void delete() {
        show();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the phone number to delete : ");
        String phone = scan.next();
        Contact c = null;
        for (Contact contact : contacts) {
            if (contact.phoneNumber.equalsIgnoreCase(phone)) {
                c = contact;
            }
        }
        if (c != null) {
            contacts.remove(c);
            System.out.println("Removed " + c.name);
        }
    }
}
