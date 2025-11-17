import java.util.*;

class Event {
    private int id;
    private String name;
    private String date;
    private String venue;
    private String organizer;

    public Event(int id, String name, String date, String venue, String organizer) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.venue = venue;
        this.organizer = organizer;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDate() { return date; }
    public String getVenue() { return venue; }
    public String getOrganizer() { return organizer; }

    public void setName(String name) { this.name = name; }
    public void setDate(String date) { this.date = date; }
    public void setVenue(String venue) { this.venue = venue; }
    public void setOrganizer(String organizer) { this.organizer = organizer; }

    public void display() {
        System.out.println("Event ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Venue: " + venue);
        System.out.println("Organizer: " + organizer);
        System.out.println("-----------------------------");
    }
}

class EventManager {
    private ArrayList<Event> events = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addEvent() {
        System.out.print("Enter Event ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Event Date (DD-MM-YYYY): ");
        String date = sc.nextLine();
        System.out.print("Enter Event Venue: ");
        String venue = sc.nextLine();
        System.out.print("Enter Organizer Name: ");
        String organizer = sc.nextLine();

        events.add(new Event(id, name, date, venue, organizer));
        System.out.println("Event added successfully!\n");
    }

    public void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No events available.\n");
            return;
        }
        System.out.println("------ All Events ------");
        for (Event e : events)
            e.display();
    }

    public void updateEvent() {
        System.out.print("Enter Event ID to update: ");
        int id = sc.nextInt(); sc.nextLine();
        for (Event e : events) {
            if (e.getId() == id) {
                System.out.print("Enter new Event Name: ");
                e.setName(sc.nextLine());
                System.out.print("Enter new Date: ");
                e.setDate(sc.nextLine());
                System.out.print("Enter new Venue: ");
                e.setVenue(sc.nextLine());
                System.out.print("Enter new Organizer: ");
                e.setOrganizer(sc.nextLine());
                System.out.println("Event updated successfully!\n");
                return;
            }
        }
        System.out.println("Event not found!\n");
    }

    public void deleteEvent() {
        System.out.print("Enter Event ID to delete: ");
        int id = sc.nextInt(); sc.nextLine();
        Iterator<Event> itr = events.iterator();
        while (itr.hasNext()) {
            Event e = itr.next();
            if (e.getId() == id) {
                itr.remove();
                System.out.println("Event deleted successfully!\n");
                return;
            }
        }
        System.out.println("Event not found!\n");
    }
}

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

            switch (choice) {
                case 1: manager.addEvent(); break;
                case 2: manager.viewEvents(); break;
                case 3: manager.updateEvent(); break;
                case 4: manager.deleteEvent(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
