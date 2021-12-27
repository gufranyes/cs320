package Controller;

import Model.Event;
import Model.Stories.CustomStory;
import Model.Actor;
import View.StoryCreation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitButtonListener implements ActionListener {
    private StoryController storyController;
    private StoryCreation storyCreation;

    public SubmitButtonListener(StoryController storyController, StoryCreation storyCreation) {
        this.storyController = storyController;
        this.storyCreation = storyCreation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!storyController.story.getName().equals("Custom")) {
            storyController.story = new CustomStory(storyController.player);
        }

        int eventID = Integer.parseInt(storyCreation.getEventIDfield().getText());
        int op1ID = Integer.parseInt(storyCreation.getOpt1IDfield().getText());
        int op2ID = Integer.parseInt(storyCreation.getOpt2IDfield().getText());
        int op3ID = Integer.parseInt(storyCreation.getOpt3IDfield().getText());

        storyController.story.addEvent(new Event(
                storyCreation.getEventText().getText(), eventID, op1ID, op2ID, op3ID,
                storyController.player, new Actor(),
                storyCreation.getOpt1().getText(),
                storyCreation.getOpt2().getText(),
                storyCreation.getOpt3().getText()));

        storyCreation.getEventText().setText("You can write your event text here.");
        storyCreation.getEventIDfield().setText("You can write the ID of the event here.");

        storyCreation.getOpt1().setText("You can write the text for option 1 here.");
        storyCreation.getOpt1IDfield().setText("You can write the ID of option 1 here.");

        storyCreation.getOpt2().setText("You can write the text for option 2 here.");
        storyCreation.getOpt2IDfield().setText("You can write the ID of option 2 here.");

        storyCreation.getOpt3().setText("You can write the text for option 3 here.");
        storyCreation.getOpt3IDfield().setText("You can write the ID of option 3 here.");
    }
}
