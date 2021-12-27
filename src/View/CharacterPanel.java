package View;

import javax.swing.*;
import java.awt.*;

public class CharacterPanel extends JPanel {
    private JPanel doublePanel;
    private JPanel statsPanel;
    private JLabel stats;
    private JLabel strName;
    private JButton strMinus;
    private JLabel str;
    private JButton strPlus;
    private JLabel dexName;
    private JButton dexMinus;
    private JLabel dex;
    private JButton dexPlus;
    private JLabel intelName;
    private JButton intelMinus;
    private JLabel intel;
    private JButton intelPlus;
    private JLabel chaName;
    private JButton chaMinus;
    private JLabel cha;
    private JButton chaPlus;
    private JPanel portraitPanel;
    private JTextArea portrait;
    private JPanel otherPanel;
    private JLabel skillPoints;
    private JLabel classLabel;
    private JLabel raceLabel;
    private JLabel bgLabel;
    private JLabel features;
    private JLabel health;
    private JLabel money;
    private JTextArea featArea;
    private JPanel statsLabelPanel;
    private JPanel strPanel;
    private JPanel dexPanel;
    private JPanel intelPanel;
    private JPanel chaPanel;

    public CharacterPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        doublePanel = new JPanel();
        statsPanel = new JPanel();
        statsLabelPanel = new JPanel();
        stats = new JLabel("Stats");
        statsPanel.setLayout(new GridLayout(4, 1));

        strPanel = new JPanel();
        strName = new JLabel("Strength:");
        // strMinus = new JButton("-");
        str = new JLabel("0");
        strPlus = new JButton("+");

        dexPanel = new JPanel();
        dexName = new JLabel("Dexterity:");
        // dexMinus = new JButton("-");
        dex = new JLabel("0");
        dexPlus = new JButton("+");

        intelPanel = new JPanel();
        intelName = new JLabel("Intelligence:");
        // intelMinus = new JButton("-");
        intel = new JLabel("0");
        intelPlus = new JButton("+");

        chaPanel = new JPanel();
        chaName = new JLabel("Charisma:");
        // chaMinus = new JButton("-");
        cha = new JLabel("0");
        chaPlus = new JButton("+");

        portraitPanel = new JPanel();
        portrait = new JTextArea("portrait");
        otherPanel = new JPanel();
        otherPanel.setLayout(new BoxLayout(otherPanel, BoxLayout.Y_AXIS));
        skillPoints = new JLabel("Skill Points:");
        classLabel = new JLabel("Class:");
        raceLabel = new JLabel("Race:");
        bgLabel = new JLabel("Background:");
        features = new JLabel("Features:");
        health = new JLabel("Health:");
        money = new JLabel("Money:");
        featArea = new JTextArea();
        featArea.setMaximumSize(new Dimension(500, 500));

        statsLabelPanel.add(stats);
        this.add(statsLabelPanel);
        strPanel.add(strName);
        // strPanel.add(strMinus);
        strPanel.add(str);
        strPanel.add(strPlus);
        dexPanel.add(dexName);
        // dexPanel.add(dexMinus);
        dexPanel.add(dex);
        dexPanel.add(dexPlus);
        intelPanel.add(intelName);
        // intelPanel.add(intelMinus);
        intelPanel.add(intel);
        intelPanel.add(intelPlus);
        chaPanel.add(chaName);
        // chaPanel.add(chaMinus);
        chaPanel.add(cha);
        chaPanel.add(chaPlus);
        statsPanel.add(strPanel);
        statsPanel.add(dexPanel);
        statsPanel.add(intelPanel);
        statsPanel.add(chaPanel);
        doublePanel.add(statsPanel);

        portraitPanel.add(portrait);
        doublePanel.add(portraitPanel);

        this.add(doublePanel);

        otherPanel.add(health);
        otherPanel.add(money);
        otherPanel.add(skillPoints);
        otherPanel.add(classLabel);
        otherPanel.add(raceLabel);
        otherPanel.add(bgLabel);
        otherPanel.add(features);
        otherPanel.add(featArea);
        this.add(otherPanel);
    }

    public JLabel getStr() {
        return str;
    }

    public JButton getStrPlus() {
        return strPlus;
    }

    public JButton getStrMinus() {
        return strMinus;
    }

    public JLabel getDex() {
        return dex;
    }

    public JButton getDexPlus() {
        return dexPlus;
    }

    public JButton getDexMinus() {
        return dexMinus;
    }

    public JLabel getIntel() {
        return intel;
    }

    public JButton getIntelPlus() {
        return intelPlus;
    }

    public JButton getIntelMinus() {
        return intelMinus;
    }

    public JLabel getCha() {
        return cha;
    }

    public JButton getChaPlus() {
        return chaPlus;
    }

    public JButton getChaMinus() {
        return chaMinus;
    }

    public JLabel getSkillPoints() {
        return skillPoints;
    }

    public JLabel getClassLabel() {
        return classLabel;
    }

    public JLabel getRaceLabel() {
        return raceLabel;
    }

    public JLabel getBgLabel() {
        return bgLabel;
    }

    public JLabel getFeatures() {
        return features;
    }

    public JTextArea getPortrait() {
        return portrait;
    }

    public JLabel getHealth() {
        return health;
    }

    public JLabel getMoney() {
        return money;
    }
}
