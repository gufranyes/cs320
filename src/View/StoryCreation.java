package View;

import Controller.StoryController;
import Model.Story;

import javax.swing.*;
import java.awt.*;

public class StoryCreation extends JPanel {
    private JTextArea eventText;
    private JTextField eventIDfield;
    private JTextField opt1;
    private JTextField opt1IDfield;

    private JTextField opt2;
    private JTextField opt2IDfield;

    private JTextField opt3;
    private JTextField opt3IDfield;

    private JButton eventSubmit;
    private JButton goBack;

    public StoryCreation() {
        this.setLayout(new GridLayout(0,1));

        eventText = new JTextArea("You can write your event text here.");
        eventIDfield = new JTextField("You can write the ID of the event here.");

        opt1 = new JTextField("You can write the text for option 1 here.");
        opt1IDfield = new JTextField("You can write the ID of option 1 here.");

        opt2 = new JTextField("You can write the text for option 2 here.");
        opt2IDfield = new JTextField("You can write the ID of option 2 here.");

        opt3 = new JTextField("You can write the text for option 3 here.");
        opt3IDfield = new JTextField("You can write the ID of option 3 here.");

        eventSubmit = new JButton("Submit");
        goBack = new JButton("Finish Writing");

        this.add(eventText);
        this.add(eventIDfield);
        this.add(opt1);
        this.add(opt1IDfield);
        this.add(opt2);
        this.add(opt2IDfield);
        this.add(opt3);
        this.add(opt3IDfield);
        this.add(eventSubmit);
        this.add(goBack);
    }

    public JButton getGoBack() {
        return goBack;
    }

    public JButton getEventSubmit() {
        return eventSubmit;
    }

    public JTextArea getEventText() {
        return eventText;
    }

    public JTextField getEventIDfield() {
        return eventIDfield;
    }

    public JTextField getOpt1() {
        return opt1;
    }

    public JTextField getOpt1IDfield() {
        return opt1IDfield;
    }

    public JTextField getOpt2() {
        return opt2;
    }

    public JTextField getOpt2IDfield() {
        return opt2IDfield;
    }

    public JTextField getOpt3() {
        return opt3;
    }

    public JTextField getOpt3IDfield() {
        return opt3IDfield;
    }
}
