import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EventManager manager = new EventManager();
        int choice;

        do {
            System.out.println("\n==== Event Management System ====");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Update Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> manager.addEvent();
                case 2 -> manager.viewEvents();
                case 3 -> manager.updateEvent();
                case 4 -> manager.deleteEvent();
                case 5 -> System.out.println("Exiting... 👋");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
