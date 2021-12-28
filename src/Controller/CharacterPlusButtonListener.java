package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterPlusButtonListener implements ActionListener {
    private StoryController storyController;
    private int type;

    public CharacterPlusButtonListener(StoryController storyController, int type) {
        this.storyController = storyController;
        this.type = type;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (storyController.player.getSkillPoints() > 0) {
            switch (type) {
                case 1:
                    storyController.player.setSTR(storyController.player.getSTR() + 1);
                    storyController.characterPanel.getStr().setText("" + storyController.player.getSTR());
                    break;
                case 2:
                    storyController.player.setDEX(storyController.player.getDEX() + 1);
                    storyController.characterPanel.getDex().setText("" + storyController.player.getDEX());
                    break;
                case 3:
                    storyController.player.setINT(storyController.player.getINT() + 1);
                    storyController.characterPanel.getIntel().setText("" + storyController.player.getINT());
                    break;
                case 4:
                    storyController.player.setCHA(storyController.player.getCHA() + 1);
                    storyController.characterPanel.getCha().setText("" + storyController.player.getCHA());
                    break;
            }
            storyController.player.setSkillPoints(storyController.player.getSkillPoints() - 1);
            storyController.characterPanel.getSkillPoints().setText("Skill Points: " + storyController.player.getSkillPoints());
        }
    }
}
