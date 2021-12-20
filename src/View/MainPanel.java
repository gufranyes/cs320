package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainPanel extends JPanel{
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JTextArea storyText;
    private JTextArea portrait;
    private ButtonGroup buttonGroup;
    private JRadioButton opt1;
    private JRadioButton opt2;
    private JRadioButton opt3;
    private JRadioButton leave;
    private JButton nextButton;

    public MainPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        topPanel = new JPanel();
        bottomPanel = new JPanel();

        topPanel.setLayout(new GridLayout());
        bottomPanel.setLayout(new GridLayout(5,1));

        storyText = new JTextArea("THIS LABEL IS FOR THE STORY THIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORYTHIS LABEL IS FOR THE STORY");
        storyText.setLineWrap(true); // These two lines
        storyText.setWrapStyleWord(true); // extends the text to the next line after the line you're writing on is filled.
        storyText.setBorder(new EmptyBorder(200, 20, 10, 10)); // Padding for the text area

        portrait = new JTextArea("THIS LABEL IS FOR THE PORTRAIT THIS LABEL IS FOR THE PORTRAITTHIS LABEL IS FOR THE PORTRAITTHIS LABEL IS FOR THE PORTRAITTHIS LABEL IS FOR THE PORTRAITTHIS LABEL IS FOR THE PORTRAITTHIS LABEL IS FOR THE PORTRAITTHIS LABEL IS FOR THE PORTRAIT");
        portrait.setLineWrap(true); // These two lines
        portrait.setWrapStyleWord(true); // extends the text to the next line after the line you're writing on is filled.
        portrait.setBorder(new EmptyBorder(10, 100, 10, 20)); // Padding for the text area

        topPanel.add(storyText);
        topPanel.add(portrait);

        opt1 = new JRadioButton("OPTION 1");
        opt2 = new JRadioButton("OPTION 2");
        opt3 = new JRadioButton("OPTION 3");
        leave = new JRadioButton("Leave");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(opt1);
        buttonGroup.add(opt2);
        buttonGroup.add(opt3);
        buttonGroup.add(leave);

        nextButton = new JButton("Next");

        topPanel.add(opt1);
        topPanel.add(opt2);
        topPanel.add(opt3);
        topPanel.add(leave);
        topPanel.add(nextButton);

        this.add(topPanel);
        this.add(bottomPanel);
    }

    public void setTextArea(JTextArea jTextArea, String text) {
        jTextArea.setText(text);
    }

    public void setRadioText(JRadioButton jRadioButton, String text) {
        jRadioButton.setText(text);
    }
}
