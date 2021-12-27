package Model.Stories;

import Model.*;

public class TestStory extends Story {
    public TestStory(Player player) {
        super("Test");
        Event event1 = new Event("This should be the text", 1, 2, 3, 4, player, new Actor(), "Choose this for next", "Choose this for end", "Guaranteed Fight Loss");
        Event event2 = new Event("This should be the text for event 2", 2, 1, 3, 5, player, new Actor(), "Choose this for start", "Choose this for end", "Probable Fight Win");
        Event event3 = new Event("This should be the final event", 3, -100, -100, -100, player, new Actor(), "NULL", "NULL", "NULL");
        Event guaranteedFightLoss = new Event("The player is supposed to die here.", 4, -50, -50, -50, -50, player, new Actor(), "You", "Are", "Dead", "DEAD", false ,true);
        Actor loser = new Actor(5);
        Event probableFightWin = new Event("The player is supposed to win here.", 5, 1, 2, 3, 6, player, loser, "Go back to event 1", "Go back to event 2", "Go to the end", "TradeTest", false, true);
        Event tradeTest = new Event("The player should see the trade screen here.", 6, 1, 2, 3, 4, player, new Item(), "Go back to event 1", "Go back to event 2", "Go back to event 3", "Guaranteed Fight Loss", true, false);
        this.addEvent(event1);
        this.addEvent(event2);
        this.addEvent(event3);
        this.addEvent(guaranteedFightLoss);
        this.addEvent(probableFightWin);
        this.addEvent(tradeTest);
    }
}
