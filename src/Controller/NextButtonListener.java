package Controller;

import Model.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextButtonListener implements ActionListener {
    private StoryController storyController;

    public NextButtonListener(StoryController storyController) {
        this.storyController = storyController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (storyController.mainPanel.getOpt1().isSelected()) {
            int nextStoryID = storyController.currentEvent.getNextEvent1id();

            for (Event event : storyController.story.getEvents()) {
                if (event.getID() == nextStoryID) {
                    storyController.setCurrentEvent(event);
                }
            }
        }
        else if (storyController.mainPanel.getOpt2().isSelected()) {
            int nextStoryID = storyController.currentEvent.getNextEvent2id();

            for (Event event : storyController.story.getEvents()) {
                if (event.getID() == nextStoryID) {
                    storyController.setCurrentEvent(event);
                }
            }
        }
        else if (storyController.mainPanel.getOpt3().isSelected()) {
            int nextStoryID = storyController.currentEvent.getNextEvent3id();

            for (Event event : storyController.story.getEvents()) {
                if (event.getID() == nextStoryID) {
                    storyController.setCurrentEvent(event);
                }
            }
        }

        storyController.mainPanel.getStoryText().setText(storyController.currentEvent.getName());
        storyController.mainPanel.getOpt1().setText(storyController.currentEvent.getNextEvent1Str());
        storyController.mainPanel.getOpt2().setText(storyController.currentEvent.getNextEvent2Str());
        storyController.mainPanel.getOpt3().setText(storyController.currentEvent.getNextEvent3Str());
        storyController.inventoryPanel.getItems(storyController.player);
        storyController.characterPanel.getStr().setText("" + storyController.player.getSTR());
        storyController.characterPanel.getDex().setText("" + storyController.player.getDEX());
        storyController.characterPanel.getIntel().setText("" + storyController.player.getINT());
        storyController.characterPanel.getCha().setText("" + storyController.player.getCHA());
        storyController.characterPanel.getSkillPoints().setText("Skill Points: " + storyController.player.getSkillPoints());
        storyController.characterPanel.getClassLabel().setText("Class: " + storyController.player.getCharacterClass());
        storyController.characterPanel.getRaceLabel().setText("Race: " + storyController.player.getRace());
        storyController.characterPanel.getBgLabel().setText("Background: " + storyController.player.getBackground());
        storyController.characterPanel.getFeatures().setText("Features: " + storyController.player.getFeats());
    }
}
