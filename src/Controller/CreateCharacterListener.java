package Controller;

import Model.Player;
import View.CharacterCreation;
import View.StorySelection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;

public class CreateCharacterListener implements ActionListener {
    private StoryController storyController;
    private JFrame jFrame;
    private CharacterCreation currentPanel;
    private StorySelection nextPanel;

    public CreateCharacterListener(StoryController storyController, JFrame jFrame, CharacterCreation currentPanel, StorySelection nextPanel) {
        this.storyController = storyController;
        this.jFrame = jFrame;
        this.currentPanel = currentPanel;
        this.nextPanel = nextPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedRace = getSelectedButton(currentPanel.getRaceButtons());
        String selectedClass = getSelectedButton(currentPanel.getClassButtons());

        String feats = currentPanel.getFeats();
        String[] split = feats.split("\\s+");

        ArrayList<String> chosenFeats = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            chosenFeats.add(split[i]);
        }

        storyController.player = new Player(currentPanel.getCharacterName(), 100, currentPanel.getCharacterBackground(),
                currentPanel.getStrPoints(), currentPanel.getDexPoints(), currentPanel.getIntelPoints(), currentPanel.getChaPoints(),
                selectedRace, 0, new ArrayList<>(), 0, chosenFeats, selectedClass);



        jFrame.remove(currentPanel);
        jFrame.add(nextPanel);
        jFrame.revalidate();
        jFrame.repaint();
    }

    private String getSelectedButton(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) return button.getText();
        }
        return null;
    }
}
