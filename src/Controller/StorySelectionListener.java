package Controller;

import Model.Event;
import Model.Item;
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
            case 1 -> {
                storyController.setStory(new TestStory(storyController.player));

                Event firstEvent = storyController.story.getEvents().get(0);
                storyController.setCurrentEvent(firstEvent);

                storyController.mainPanel.getStoryText().setText(firstEvent.getName());
                storyController.mainPanel.getOpt1().setText(firstEvent.getNextEvent1Str());
                storyController.mainPanel.getOpt2().setText(firstEvent.getNextEvent2Str());
                storyController.mainPanel.getOpt3().setText(firstEvent.getNextEvent3Str());

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
            case 2 -> story = new Story("Dwarven Blood Feud");
            case 3 -> story = new Story("Honor Purelight");
            case 4 -> story = new Story("Necromancer's Tower");
            case 5 -> story = new Story("The Lucky Trader");
            case 6 -> story = new Story("Pheria");
            case 7 -> story = new Story("Orcistan");
            case 8 -> story = new Story("Dawnbringer");
        }

        jFrame.remove(storySelection);
        jFrame.add(jTabbedPane);

        if (type == 9) {
            if (storySelection.isCreatedStory()) {
                story = new Story("Custom");
            } else {
                jFrame.remove(jTabbedPane);
                jFrame.add(storyCreation);
            }
        }

        jFrame.revalidate();
        jFrame.repaint();
    }
}
