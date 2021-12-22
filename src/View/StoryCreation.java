package View;

import Model.Story;

import javax.swing.*;
import java.awt.*;

public class StoryCreation extends JPanel {
    private Story story;
    private int eventID;
    private JTextArea eventText;
    private JTextField opt1;
    private int opt1ID;
    private JTextField opt2;
    private int opt2ID;
    private JTextField opt3;
    private int opt3ID;
    private JButton eventSubmit;

    public Story getStory() {
        return story;
    }

    public StoryCreation() {
        this.setLayout(new GridLayout(0, 1));
        story = new Story("Custom Story");
        eventID = 1;

        eventText = new JTextArea("You can write your event text here.");
        opt1 = new JTextField("You can write the text for option 1.");
        opt1ID = eventID + 1;
        opt2 = new JTextField("You can write the text for option 2.");
        opt2ID = eventID + 2;
        opt3 = new JTextField("You can write the text for option 3.");
        opt3ID = eventID + 3;

        eventSubmit = new JButton("Submit");

        this.add(eventText);
        this.add(opt1);
        this.add(opt2);
        this.add(opt3);
        this.add(eventSubmit);
    }
}
