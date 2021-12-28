package Controller;

import Model.Actor;
import Model.Event;
import Model.Item;
import Model.Player;
import View.TradeScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
        else if (storyController.mainPanel.getLeave().isSelected()) {
            int nextStoryID = storyController.currentEvent.getLeaveID();

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
        storyController.mainPanel.getLeave().setText(storyController.currentEvent.getLeaveStr());
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

        if (checkForEnd(storyController.currentEvent)) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Congratulations, you've reached the end!");
            System.exit(0);
        }

        if (storyController.currentEvent.isFight()) {
            int playerBonus = storyController.player.fight(storyController.currentEvent.getActor());
            int enemyBonus = storyController.currentEvent.getActor().fight(storyController.player);

            if (enemyBonus > playerBonus) storyController.player.setHealth(0);
        }

        if (storyController.currentEvent.isTrade()) {
            TradeScreen tradeScreen = new TradeScreen(storyController.currentEvent.getTradeItem(), storyController, new Actor(5));
            getItems();
        }

        if (storyController.player.getHealth() <= 0) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "You died!");
            System.exit(0);
        }

    }

    private boolean checkForEnd(Event event) {
        return (event.getNextEvent1id() == -100 && event.getNextEvent2id() == -100 && event.getNextEvent3id() == -100);
    }

    public void getItems() {
        ArrayList<Item> inventory = storyController.player.getInventory();
        storyController.inventoryPanel.getInventoryArea().setText("");

        for (Item i : inventory) {
            storyController.inventoryPanel.getInventoryArea().append(i.getName() + "\n");
        }
    }
}
