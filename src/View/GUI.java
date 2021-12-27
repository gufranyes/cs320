package View;

import Controller.*;
import Model.Item;
import Model.Player;
import Model.Story;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        PlayerController playerController = new PlayerController(new Player());
        Story story = new Story();

        JFrame jFrame = new JFrame("Pheria: A Miserable Adventure");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(750, 900); //Default size, it is too big for small laptops
        jFrame.setMinimumSize(new Dimension(750, 900));
        //jFrame.setResizable(false);

        jFrame.pack();
        jFrame.setLocationRelativeTo(null);

        MainScreen mainScreen = new MainScreen();
        CharacterCreation characterCreation = new CharacterCreation();
        StoryCreation storyCreation = new StoryCreation();
        StorySelection storySelection = new StorySelection();

        JTabbedPane jTabbedPane = new JTabbedPane();

        MainPanel mainPanel = new MainPanel();
        CharacterPanel characterPanel = new CharacterPanel();
        InventoryPanel inventoryPanel = new InventoryPanel();

        jTabbedPane.add("Main", mainPanel);
        jTabbedPane.add("Character", characterPanel);
        jTabbedPane.add("Inventory", inventoryPanel);

        StoryController storyController = new StoryController(jFrame, story, playerController.player, mainPanel, characterPanel, inventoryPanel, storySelection, storyCreation);


        mainScreen.getCreateCharacter().addActionListener(new MainScreenListener(mainScreen, jFrame, characterCreation));

        characterCreation.getStrMinus().addActionListener(new MinusButtonListener(characterCreation, 1));
        characterCreation.getStrPlus().addActionListener(new PlusButtonListener(characterCreation, 1));
        characterCreation.getDexMinus().addActionListener(new MinusButtonListener(characterCreation, 2));
        characterCreation.getDexPlus().addActionListener(new PlusButtonListener(characterCreation, 2));
        characterCreation.getIntelMinus().addActionListener(new MinusButtonListener(characterCreation, 3));
        characterCreation.getIntelPlus().addActionListener(new PlusButtonListener(characterCreation, 3));
        characterCreation.getChaMinus().addActionListener(new MinusButtonListener(characterCreation, 4));
        characterCreation.getChaPlus().addActionListener(new PlusButtonListener(characterCreation, 4));
        characterCreation.getCreateChar().addActionListener(new CreateCharacterListener(storyController, jFrame, characterCreation, storySelection));

        storySelection.getSto1().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 1, story, storyCreation, storyController));
        storySelection.getSto2().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 2, story, storyCreation, storyController));
        storySelection.getSto3().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 3, story, storyCreation, storyController));
        storySelection.getSto4().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 4, story, storyCreation, storyController));
        storySelection.getSto5().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 5, story, storyCreation, storyController));
        storySelection.getSto6().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 6, story, storyCreation, storyController));
        storySelection.getSto7().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 7, story, storyCreation, storyController));
        storySelection.getSto8().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 8, story, storyCreation, storyController));
        storySelection.getSto9().addActionListener(new StorySelectionListener(storySelection, jFrame, jTabbedPane, 9, story, storyCreation, storyController));

        mainPanel.getNextButton().addActionListener(new NextButtonListener(storyController));

        characterPanel.getStrPlus().addActionListener(new CharacterPlusButtonListener(storyController, 1));
        characterPanel.getDexPlus().addActionListener(new CharacterPlusButtonListener(storyController, 2));
        characterPanel.getIntelPlus().addActionListener(new CharacterPlusButtonListener(storyController, 3));
        characterPanel.getChaPlus().addActionListener(new CharacterPlusButtonListener(storyController, 4));

        storyCreation.getGoBack().addActionListener(new GoBackButtonListener(storyController));
        storyCreation.getEventSubmit().addActionListener(new SubmitButtonListener(storyController, storyCreation));
    }
}
