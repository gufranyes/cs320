package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoBackButtonListener implements ActionListener {
    private StoryController storyController;

    public GoBackButtonListener(StoryController storyController) {
        this.storyController = storyController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        storyController.jFrame.remove(storyController.storyCreation);
        storyController.jFrame.add(storyController.storySelection);
        storyController.storySelection.setCreatedStory(true);

        storyController.jFrame.revalidate();
        storyController.jFrame.repaint();
    }
}
