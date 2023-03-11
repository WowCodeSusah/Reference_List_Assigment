import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Contact> list = new LinkedList<>();
        int x = 1;
        String insert;
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Contact Book");
        while(x == 1) {
            System.out.println("*************************************************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("*************************************************************");
            System.out.print("Enter a Command : ");
            insert = scan.nextLine();
            if(insert.equals("A") || insert.equals("a")) {
                String name;
                String number;
                String email;
                System.out.println("Adding a Contact....");
                System.out.print("Enter a Name : ");
                name = scan.nextLine();
                System.out.print("Enter a Number : ");
                number = scan.nextLine();
                System.out.print("Enter a Email : ");
                email = scan.nextLine();
                Contact contact = new Contact(name, number, email);
                list.add(contact);
                System.out.println("Added Contact :");
                System.out.println("Name : " + name);
                System.out.println("Email : " + email);
                System.out.println("Number : " + number);
            } else if(insert.equals("D") || insert.equals("d")) {
                String delete;
                System.out.println("Deleting a Contact....");
                System.out.print("Enter contact name to delete : ");
                delete = scan.nextLine();
                int i = 0;
                int kill = 0;
                while(i < list.size()) {
                    if(list.get(i).name.equals(delete)) {
                        System.out.println("Deleted Contact : ");
                        System.out.println("Name : " + list.get(i).name);
                        System.out.println("Email : " + list.get(i).email);
                        System.out.println("Number : " +list.get(i).number);
                        list.remove(i);
                        kill++;
                    }
                    i++;
                }
                if(kill == 0) {
                    System.out.println("Could not find contact!");
                }
            } else if(insert.equals("E") || insert.equals("e")) {
                String search;
                System.out.println("Searching the Database....");
                System.out.print("Enter email to search : ");
                search = scan.nextLine();
                int i = 0;
                int kill = 0;
                while(i < list.size()) {
                    if(list.get(i).email.equals(search)) {
                        System.out.println("----------------");
                        System.out.println("Contact " + (i+1));
                        System.out.println("Name : " + list.get(i).name);
                        System.out.println("Email : " + list.get(i).email);
                        System.out.println("Number : " +list.get(i).number);
                        kill++;
                    }
                    i++;
                }
                if(kill == 0) {
                    System.out.println("Could not find contact!");
                }
            } else if(insert.equals("P") || insert.equals("p")) {
                System.out.println("Printing Database....");
                int j = 0;
                for(int i = 0;i < list.size();i++) {
                    System.out.println("----------------");
                    System.out.println("Contact " + (i+1));
                    System.out.println("Name : " + list.get(i).name);
                    System.out.println("Email : " + list.get(i).email);
                    System.out.println("Number : " +list.get(i).number);
                }
                if(j == list.size()) {
                    System.out.println("Nothing to print :(");
                }
            } else if(insert.equals("S") || insert.equals("s")) {
                String search_name;
                System.out.println("Searching the Database....");
                System.out.print("Enter contact name to search : ");
                search_name = scan.nextLine();
                int i = 0;
                int kill = 0;
                while(i < list.size()) {
                    if(list.get(i).name.equals(search_name)) {
                        System.out.println("----------------");
                        System.out.println("Contact " + (i+1));
                        System.out.println("Name : " + list.get(i).name);
                        System.out.println("Email : " + list.get(i).email);
                        System.out.println("Number : " +list.get(i).number);
                        kill++;
                    }
                    i++;
                }
                if(kill == 0) {
                    System.out.println("Could not find contact!");
                }
            } else if(insert.equals("Q") || insert.equals("q")) {
                System.out.println("Ending Program...");
                System.out.println("Thank you");
                x++;
            } else {
                System.out.println("Command not Recognize!");
            }
        }
    }
}