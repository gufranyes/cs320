package Controller;

import Model.Event;
import Model.Stories.CustomStory;
import Model.Actor;
import View.StoryCreation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitButtonListener implements ActionListener {
    private StoryController storyController;

    public SubmitButtonListener(StoryController storyController) {
        this.storyController = storyController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!storyController.story.getName().equals("Custom")) {
            //storyController.story = new CustomStory(storyController.player);
            storyController.setStory(new CustomStory(storyController.player));
        }

        int eventID = Integer.parseInt(storyController.storyCreation.getEventIDfield().getText());
        int op1ID = Integer.parseInt(storyController.storyCreation.getOpt1IDfield().getText());
        int op2ID = Integer.parseInt(storyController.storyCreation.getOpt2IDfield().getText());
        int op3ID = Integer.parseInt(storyController.storyCreation.getOpt3IDfield().getText());

        storyController.story.addEvent(new Event(
                storyController.storyCreation.getEventText().getText(), eventID, op1ID, op2ID, op3ID,
                storyController.player, new Actor(),
                storyController.storyCreation.getOpt1().getText(),
                storyController.storyCreation.getOpt2().getText(),
                storyController.storyCreation.getOpt3().getText()));

        storyController.storyCreation.getEventText().setText("You can write your event text here.");
        storyController.storyCreation.getEventIDfield().setText("You can write the ID of the event here.");

        storyController.storyCreation.getOpt1().setText("You can write the text for option 1 here.");
        storyController.storyCreation.getOpt1IDfield().setText("You can write the ID of option 1 here.");

        storyController.storyCreation.getOpt2().setText("You can write the text for option 2 here.");
        storyController.storyCreation.getOpt2IDfield().setText("You can write the ID of option 2 here.");

        storyController.storyCreation.getOpt3().setText("You can write the text for option 3 here.");
        storyController.storyCreation.getOpt3IDfield().setText("You can write the ID of option 3 here.");
    }
}
