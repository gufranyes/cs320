package Controller;

import Model.Event;
import Model.Item;
import Model.Stories.IllegalArena;
import Model.Stories.Pheria;
import Model.Stories.TestStory;
import Model.Story;
import View.StoryCreation;
import View.StorySelection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StorySelectionListener implements ActionListener {
    private StorySelection storySelection;
    private JFrame jFrame;
    private JTabbedPane jTabbedPane;
    private int type;
    private Story story;
    private StoryCreation storyCreation;
    private StoryController storyController;

    public StorySelectionListener(StorySelection storySelection, JFrame jFrame, JTabbedPane jTabbedPane, int type, Story story, StoryCreation storyCreation, StoryController storyController) {
        this.storySelection = storySelection;
        this.jFrame = jFrame;
        this.jTabbedPane = jTabbedPane;
        this.type = type;
        this.story = story;
        this.storyCreation = storyCreation;
        this.storyController = storyController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (type) {
            case 1:
                storyController.setStory(new TestStory(storyController.player));
                Event firstEvent = storyController.story.getEvents().get(0);
                storyController.setCurrentEvent(firstEvent);
                operate();

                break;
            case 2:
                story = new Story("Dwarven Blood Feud");
                break;
            case 3:
                storyController.setStory(new IllegalArena(storyController));
                storyController.setCurrentEvent(storyController.story.getEvents().get(0));
                storyController.player.getInventory().add(new Item("Blacksmith's Masterpiece", "Weapon", 3, 0, "", 0));
                operate();
                break;
            case 4:
                story = new Story("Necromancer's Tower");
                break;
            case 5:
                story = new Story("The Lucky Trader");
                break;
            case 6:
                storyController.setStory(new Pheria(storyController));
                storyController.setCurrentEvent(storyController.story.getEvents().get(0));
                operate();
                break;
            case 7:
                story = new Story("Orcistan");
                break;
            case 8:
                story = new Story("Dawnbringer");
                break;
        }

        jFrame.remove(storySelection);
        jFrame.add(jTabbedPane);

        if (type == 9) {
            if (storySelection.isCreatedStory()) {
                storyController.setCurrentEvent(storyController.story.getEvents().get(0));
                operate();
            } else {
                jFrame.remove(jTabbedPane);
                jFrame.add(storyCreation);
            }
        }
        jFrame.revalidate();
        jFrame.repaint();
    }

    public void operate() {
        storyController.mainPanel.getStoryText().setText(storyController.currentEvent.getName());
        storyController.mainPanel.getOpt1().setText(storyController.currentEvent.getNextEvent1Str());
        storyController.mainPanel.getOpt2().setText(storyController.currentEvent.getNextEvent2Str());
        storyController.mainPanel.getOpt3().setText(storyController.currentEvent.getNextEvent3Str());
        storyController.mainPanel.getPortrait().setText(storyController.player.getPortrait());

        storyController.inventoryPanel.getItems(storyController.player);
        storyController.characterPanel.getStr().setText("" + storyController.player.getSTR());
        storyController.characterPanel.getDex().setText("" + storyController.player.getDEX());
        storyController.characterPanel.getIntel().setText("" + storyController.player.getINT());
        storyController.characterPanel.getCha().setText("" + storyController.player.getCHA());
        storyController.characterPanel.getHealth().setText("Health: " + storyController.player.getHealth());
        storyController.characterPanel.getMoney().setText("Money: " + storyController.player.getMoney());
        storyController.characterPanel.getSkillPoints().setText("Skill Points: " + storyController.player.getSkillPoints());
        storyController.characterPanel.getClassLabel().setText("Class: " + storyController.player.getCharacterClass());
        storyController.characterPanel.getRaceLabel().setText("Race: " + storyController.player.getRace());
        storyController.characterPanel.getBgLabel().setText("Background: " + storyController.player.getBackground());
        storyController.characterPanel.getFeatures().setText("Features: " + storyController.player.getFeats());
        storyController.characterPanel.getPortrait().setText(storyController.player.getPortrait());
    }
}
