package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StorySelection extends JLabel{
    private JButton sto1;
    private JTextArea sto1txt;
    private JPanel sto1Panel;

    private JButton sto2;
    private JTextArea sto2txt;
    private JPanel sto2Panel;

    private JButton sto3;
    private JTextArea sto3txt;
    private JPanel sto3Panel;

    private JButton sto4;
    private JTextArea sto4txt;
    private JPanel sto4Panel;

    private JButton sto5;
    private JTextArea sto5txt;
    private JPanel sto5Panel;

    private JButton sto6;
    private JTextArea sto6txt;
    private JPanel sto6Panel;

    private JButton sto7;
    private JTextArea sto7txt;
    private JPanel sto7Panel;

    private JButton sto8;
    private JTextArea sto8txt;
    private JPanel sto8Panel;

    private JButton sto9;
    private JTextArea sto9txt;
    private JPanel sto9Panel;

    private boolean createdStory = false;

    public StorySelection() {
        this.setLayout(new GridLayout(3,3));

        sto1 = new JButton("TEST");
        sto2 = new JButton("Dwarven Blood Feud");
        sto3 = new JButton("Illegal Arena");
        sto4 = new JButton("Necromancer's Tower");
        sto5 = new JButton("The Lucky Trader");
        sto6 = new JButton("Pheria");
        sto7 = new JButton("Orcistan");
        sto8 = new JButton("Dawnbringer");
        sto9 = new JButton("Custom");

        sto1txt = new JTextArea("Choose this story to test all the functionalities.");
        sto2txt = new JTextArea("The story of a dwarf who brings his vendetta to the council of clans for his relative, whose beard was trimmed by another clan.");
        sto3txt = new JTextArea("The story of a gladiator whose only cousin remained in his life, dives into troubles because of Saint Lightning and his match-fixing.");
        sto4txt = new JTextArea("The story of a young mage who is sent to the tower from college for a research mission. But no one knows whether he will survive or not.");
        sto5txt = new JTextArea("The story of a poor but cunning merchant's struggle to make the right decisions and become a great emperor.");
        sto6txt = new JTextArea("The story of Pheria, who worked hard for her poor family and won a scholarship from the Trader School, and fell in love with Aemir.");
        sto7txt = new JTextArea("The war story of the commander who became Gro-Bakr's right-hand man after Chief Gro-bakr, the sole ruler of Orcistan, declared war on the Eastern kingdoms.");
        sto8txt = new JTextArea("The story of Mario's search for castles after Commander Khan orders the plumber Mario with the task of rescuing Elanor.");
        sto9txt = new JTextArea("Your Custom Story");

        sto1txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto2txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto3txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto4txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto5txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto6txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto7txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto8txt.setBorder(new EmptyBorder(10, 10, 10, 10));
        sto9txt.setBorder(new EmptyBorder(10, 10, 10, 10));

        sto1txt.setLineWrap(true);
        sto2txt.setLineWrap(true);
        sto3txt.setLineWrap(true);
        sto4txt.setLineWrap(true);
        sto5txt.setLineWrap(true);
        sto6txt.setLineWrap(true);
        sto7txt.setLineWrap(true);
        sto8txt.setLineWrap(true);
        sto9txt.setLineWrap(true);

        sto1Panel = new JPanel();
        sto1Panel.setLayout(new GridLayout(2,1));
        sto2Panel = new JPanel();
        sto2Panel.setLayout(new GridLayout(2,1));
        sto3Panel = new JPanel();
        sto3Panel.setLayout(new GridLayout(2,1));
        sto4Panel = new JPanel();
        sto4Panel.setLayout(new GridLayout(2,1));
        sto5Panel = new JPanel();
        sto5Panel.setLayout(new GridLayout(2,1));
        sto6Panel = new JPanel();
        sto6Panel.setLayout(new GridLayout(2,1));
        sto7Panel = new JPanel();
        sto7Panel.setLayout(new GridLayout(2,1));
        sto8Panel = new JPanel();
        sto8Panel.setLayout(new GridLayout(2,1));
        sto9Panel = new JPanel();
        sto9Panel.setLayout(new GridLayout(2,1));

        sto1Panel.add(sto1txt);
        sto1Panel.add(sto1);
        this.add(sto1Panel);

        sto2Panel.add(sto2txt);
        sto2Panel.add(sto2);
        this.add(sto2Panel);

        sto3Panel.add(sto3txt);
        sto3Panel.add(sto3);
        this.add(sto3Panel);

        sto4Panel.add(sto4txt);
        sto4Panel.add(sto4);
        this.add(sto4Panel);

        sto5Panel.add(sto5txt);
        sto5Panel.add(sto5);
        this.add(sto5Panel);

        sto6Panel.add(sto6txt);
        sto6Panel.add(sto6);
        this.add(sto6Panel);

        sto7Panel.add(sto7txt);
        sto7Panel.add(sto7);
        this.add(sto7Panel);

        sto8Panel.add(sto8txt);
        sto8Panel.add(sto8);
        this.add(sto8Panel);

        sto9Panel.add(sto9txt);
        sto9Panel.add(sto9);
        this.add(sto9Panel);
    }

    public boolean isCreatedStory() {
        return createdStory;
    }

    public void setCreatedStory(boolean createdStory) {
        this.createdStory = createdStory;
    }

    public JButton getSto1() {
        return sto1;
    }

    public JButton getSto2() {
        return sto2;
    }

    public JButton getSto3() {
        return sto3;
    }

    public JButton getSto4() {
        return sto4;
    }

    public JButton getSto5() {
        return sto5;
    }

    public JButton getSto6() {
        return sto6;
    }

    public JButton getSto7() {
        return sto7;
    }

    public JButton getSto8() {
        return sto8;
    }

    public JButton getSto9() {
        return sto9;
    }
}
