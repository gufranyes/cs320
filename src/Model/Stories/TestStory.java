package Model.Stories;

import Model.Actor;
import Model.Event;
import Model.Player;
import Model.Story;

public class TestStory extends Story {
    public TestStory(Player player) {
        super("Test");
        Event event1 = new Event("This should be the text", 1, 2, 3, 4, player, new Actor(), "Choose this for next", "Choose this for end", "DON'T CHOOSE");
        Event event2 = new Event("This should be the text for event 2", 2, 1, 3, 7, player, new Actor(), "Choose this for start", "Choose this for end", "DON'T CHOOSE");
        Event event3 = new Event("This should be the final event", 3, -100, -100, -100, player, new Actor(), "NULL", "NULL", "NULL");
        this.addEvent(event1);
        this.addEvent(event2);
        this.addEvent(event3);
    }
}
