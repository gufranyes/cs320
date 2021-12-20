package View;

import javax.swing.*;
import java.awt.*;

public class StorySelection extends JLabel{
    private JButton sto1;
    private JLabel sto1txt;
    private JPanel sto1Panel;

    private JButton sto2;
    private JLabel sto2txt;
    private JPanel sto2Panel;

    private JButton sto3;
    private JLabel sto3txt;
    private JPanel sto3Panel;

    private JButton sto4;
    private JLabel sto4txt;
    private JPanel sto4Panel;

    private JButton sto5;
    private JLabel sto5txt;
    private JPanel sto5Panel;

    private JButton sto6;
    private JLabel sto6txt;
    private JPanel sto6Panel;

    private JButton sto7;
    private JLabel sto7txt;
    private JPanel sto7Panel;

    private JButton sto8;
    private JLabel sto8txt;
    private JPanel sto8Panel;

    private JButton sto9;
    private JLabel sto9txt;
    private JPanel sto9Panel;

    public StorySelection() {
        this.setLayout(new GridLayout(3,3));

        sto1 = new JButton("Illegal Arena");
        sto2 = new JButton("Dwarven Blood Feud");
        sto3 = new JButton("Honor Purelight");
        sto4 = new JButton("Necromancer's Tower");
        sto5 = new JButton("The Lucky Trader");
        sto6 = new JButton("Pheria");
        sto7 = new JButton("Orcistan");
        sto8 = new JButton("Dawnbringer");
        sto9 = new JButton("Custom");

        sto1txt = new JLabel("PLACEHOLDER");
        sto2txt = new JLabel("PLACEHOLDER");
        sto3txt = new JLabel("PLACEHOLDER");
        sto4txt = new JLabel("PLACEHOLDER");
        sto5txt = new JLabel("PLACEHOLDER");
        sto6txt = new JLabel("PLACEHOLDER");
        sto7txt = new JLabel("PLACEHOLDER");
        sto8txt = new JLabel("PLACEHOLDER");
        sto9txt = new JLabel("Your Custom Story");

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
}
