package Controller;

import View.CharacterCreation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinusButtonListener implements ActionListener {
    private CharacterCreation characterCreation;
    private int type;

    public MinusButtonListener(CharacterCreation characterCreation, int type) {
        this.characterCreation = characterCreation;
        this.type = type;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (type == 1 && characterCreation.getStrPoints() > 0) {
            characterCreation.setStrPoints(characterCreation.getStrPoints() - 1);
            characterCreation.setSkillPoints(characterCreation.getSkillPoints() + 1);
            characterCreation.getStr().setText("" + characterCreation.getStrPoints());
            characterCreation.getSkillPointsLabel().setText("Skill Points: " + characterCreation.getSkillPoints());
        }
        else if (type == 2 && characterCreation.getDexPoints() > 0) {
            characterCreation.setDexPoints(characterCreation.getDexPoints() - 1);
            characterCreation.setSkillPoints(characterCreation.getSkillPoints() + 1);
            characterCreation.getDex().setText("" + characterCreation.getDexPoints());
            characterCreation.getSkillPointsLabel().setText("Skill Points: " + characterCreation.getSkillPoints());
        }
        else if (type == 3 && characterCreation.getIntelPoints() > 0) {
            characterCreation.setIntelPoints(characterCreation.getIntelPoints() - 1);
            characterCreation.setSkillPoints(characterCreation.getSkillPoints() + 1);
            characterCreation.getIntel().setText("" + characterCreation.getIntelPoints());
            characterCreation.getSkillPointsLabel().setText("Skill Points: " + characterCreation.getSkillPoints());
        }
        else if (type == 4 && characterCreation.getChaPoints() > 0) {
            characterCreation.setChaPoints(characterCreation.getChaPoints() - 1);
            characterCreation.setSkillPoints(characterCreation.getSkillPoints() + 1);
            characterCreation.getCha().setText("" + characterCreation.getChaPoints());
            characterCreation.getSkillPointsLabel().setText("Skill Points: " + characterCreation.getSkillPoints());
        }
    }
}
