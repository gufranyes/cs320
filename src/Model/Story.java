package Model;

import java.util.ArrayList;

public class Story {
    private String name;
    private ArrayList<Event> events;

    public Story() {
        name = "Default Story";
        events = new ArrayList<>();
    }

    public Story(String name) {
        this.name = name;
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void deleteEvent(Event event) {
        for (Event a : events) {
            if (a.getID() == event.getID()) events.remove(a);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }
}
