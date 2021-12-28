package Controller;

import Model.Event;
import Model.Player;
import Model.Story;
import View.*;

import javax.swing.*;

public class StoryController {
    public JFrame jFrame;
    public Story story;
    public Player player;
    public MainPanel mainPanel;
    public CharacterPanel characterPanel;
    public InventoryPanel inventoryPanel;
    public StorySelection storySelection;
    public StoryCreation storyCreation;
    public Event currentEvent;

    public StoryController(JFrame jFrame, Story story, Player player, MainPanel mainPanel, CharacterPanel characterPanel, InventoryPanel inventoryPanel, StorySelection storySelection, StoryCreation storyCreation) {
        this.jFrame = jFrame;
        this.story = story;
        this.player = player;
        this.mainPanel = mainPanel;
        this.characterPanel = characterPanel;
        this.inventoryPanel = inventoryPanel;
        this.currentEvent = new Event();
        this.storySelection = storySelection;
        this.storyCreation = storyCreation;
    }

    public void setCurrentEvent(Event currentEvent) {
        this.currentEvent = currentEvent;
    }

    public void setStory(Story story) {
        this.story = story;
    }
}
