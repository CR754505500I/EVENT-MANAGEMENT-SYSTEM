public class Event {
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
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Event ID: " + id +
                ", Name: " + name +
                ", Date: " + date +
                ", Venue: " + venue +
                ", Organizer: " + organizer +
                "\n-----------------------------";
    }
}
