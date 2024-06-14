
import java.util.Vector;

class CampingTrips {
    private String name;
    private String location;
    private DateAndTime dateTime;
    private Vector<Budget> budget = new Vector<Budget>();
    private Item items;

    public CampingTrips() {
    };

    public CampingTrips(String name, String location, DateAndTime dateTime, Vector<Budget> tripBudgets) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
        this.budget = tripBudgets;
    };

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public DateAndTime getDateTime() {
        return dateTime;
    }

    public Vector<Budget> getBudgets() {
        return budget;
    }
}
