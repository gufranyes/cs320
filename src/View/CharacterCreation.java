package View;

import javax.swing.*;
import java.awt.*;

public class CharacterCreation extends JPanel {
    private JPanel topPanel;
    private JTextField name;
    private JTextField background;
    private JPanel featPanel;
    private JTextField feat;
    //private JButton add; NOT NEEDED
    private JPanel classPanel;
    private JRadioButton fighter;
    private JRadioButton mage;
    private JRadioButton druid;
    private JRadioButton paladin;
    private JRadioButton ranger;
    private JRadioButton rogue;
    private ButtonGroup classButtons;
    private JPanel racePane;
    private JRadioButton human;
    private JRadioButton elf;
    private JRadioButton dwarf;
    private JRadioButton halfling;
    private ButtonGroup raceButtons;
    private JPanel skillsPane;
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
    private JButton createChar;
    private JTextArea portrait;
    private JPanel strPanel;
    private JPanel dexPanel;
    private JPanel intelPanel;
    private JPanel chaPanel;

    public CharacterCreation() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2,1));

        name = new JTextField("Write your name here.");
        background = new JTextField("Write your background here.");
        topPanel.add(name);
        topPanel.add(background);

        featPanel = new JPanel();
        featPanel.setLayout(new GridLayout());
        feat = new JTextField("Write your feats here. Put a space between feat names.");
        featPanel.add(feat);

        classPanel = new JPanel();
        fighter = new JRadioButton("Fighter");
        mage = new JRadioButton("Mage");
        druid = new JRadioButton("Druid");
        paladin = new JRadioButton("Paladin");
        ranger = new JRadioButton("Ranger");
        rogue = new JRadioButton("Rogue");
        classButtons = new ButtonGroup();

        classButtons.add(fighter);
        classButtons.add(mage);
        classButtons.add(druid);
        classButtons.add(paladin);
        classButtons.add(ranger);
        classButtons.add(rogue);

        classPanel.add(fighter);
        classPanel.add(mage);
        classPanel.add(druid);
        classPanel.add(paladin);
        classPanel.add(ranger);
        classPanel.add(rogue);

        racePane = new JPanel();
        human = new JRadioButton("Human");
        elf = new JRadioButton("Elf");
        dwarf = new JRadioButton("Dwarf");
        halfling = new JRadioButton("Halfling");
        raceButtons = new ButtonGroup();

        raceButtons.add(human);
        raceButtons.add(elf);
        raceButtons.add(dwarf);
        raceButtons.add(halfling);

        racePane.add(human);
        racePane.add(elf);
        racePane.add(dwarf);
        racePane.add(halfling);

        skillsPane = new JPanel();
        skillsPane.setLayout(new GridLayout(4,1));

        strPanel = new JPanel();
        strName = new JLabel("Strength:");
        strMinus = new JButton("-");
        str = new JLabel("0");
        strPlus = new JButton("+");

        dexPanel = new JPanel();
        dexName = new JLabel("Dexterity:");
        dexMinus = new JButton("-");
        dex = new JLabel("0");
        dexPlus = new JButton("+");

        intelPanel = new JPanel();
        intelName = new JLabel("Intelligence:");
        intelMinus = new JButton("-");
        intel = new JLabel("0");
        intelPlus = new JButton("+");

        chaPanel = new JPanel();
        chaName = new JLabel("Charisma:");
        chaMinus = new JButton("-");
        cha = new JLabel("0");
        chaPlus = new JButton("+");

        strPanel.add(strName);
        strPanel.add(strMinus);
        strPanel.add(str);
        strPanel.add(strPlus);
        dexPanel.add(dexName);
        dexPanel.add(dexMinus);
        dexPanel.add(dex);
        dexPanel.add(dexPlus);
        intelPanel.add(intelName);
        intelPanel.add(intelMinus);
        intelPanel.add(intel);
        intelPanel.add(intelPlus);
        chaPanel.add(chaName);
        chaPanel.add(chaMinus);
        chaPanel.add(cha);
        chaPanel.add(chaPlus);
        skillsPane.add(strPanel);
        skillsPane.add(dexPanel);
        skillsPane.add(intelPanel);
        skillsPane.add(chaPanel);

        portrait = new JTextArea("Put your portrait here.");
        createChar = new JButton("Submit");

        this.add(topPanel);
        this.add(featPanel);
        this.add(classPanel);
        this.add(racePane);
        this.add(skillsPane);
        this.add(portrait);
        this.add(createChar);
    }
}
