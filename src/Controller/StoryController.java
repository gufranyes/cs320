package Controller;

import Model.Event;
import Model.Player;
import Model.Story;
import View.CharacterPanel;
import View.InventoryPanel;
import View.MainPanel;

public class StoryController {
    public Story story;
    public Player player;
    public MainPanel mainPanel;
    public CharacterPanel characterPanel;
    public InventoryPanel inventoryPanel;
    public Event currentEvent;

    public StoryController(Story story, Player player, MainPanel mainPanel, CharacterPanel characterPanel, InventoryPanel inventoryPanel) {
        this.story = story;
        this.player = player;
        this.mainPanel = mainPanel;
        this.characterPanel = characterPanel;
        this.inventoryPanel = inventoryPanel;
        this.currentEvent = new Event();
    }

    public void setCurrentEvent(Event currentEvent) {
        this.currentEvent = currentEvent;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}
