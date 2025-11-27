import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EventManager {

    private ArrayList<Event> events = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addEvent() {
        System.out.print("Enter Event ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Event Date (DD-MM-YYYY): ");
        String date = sc.nextLine();
        System.out.print("Enter Venue: ");
        String venue = sc.nextLine();
        System.out.print("Enter Organizer: ");
        String organizer = sc.nextLine();

        events.add(new Event(id, name, date, venue, organizer));
        System.out.println("✅ Event added!\n");
    }

    public void viewEvents() {
        if (events.isEmpty()) {
            System.out.println("No events found!\n");
            return;
        }
        System.out.println("\n------ All Events ------");
        for (Event e : events) {
            e.display();
        }
    }

    public void updateEvent() {
        System.out.print("Enter Event ID to update: ");
        int id = sc.nextInt(); sc.nextLine();

        for (Event e : events) {
            if (e.getId() == id) {
                System.out.print("Enter new Name: ");
                e.setName(sc.nextLine());
                System.out.print("Enter new Date: ");
                e.setDate(sc.nextLine());
                System.out.print("Enter new Venue: ");
                e.setVenue(sc.nextLine());
                System.out.print("Enter new Organizer: ");
                e.setOrganizer(sc.nextLine());
                System.out.println("✅ Event updated!\n");
                return;
            }
        }
        System.out.println("❌ Event not found!\n");
    }

    public void deleteEvent() {
        System.out.print("Enter Event ID to delete: ");
        int id = sc.nextInt(); sc.nextLine();

        Iterator<Event> itr = events.iterator();
        while (itr.hasNext()) {
            if (itr.next().getId() == id) {
                itr.remove();
                System.out.println("✅ Event deleted!\n");
                return;
            }
        }
        System.out.println("❌ Event not found!\n");
    }
}
