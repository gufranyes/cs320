package View;

import Controller.MainScreenListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainScreen extends JDialog {
    JLabel welcomeText;
    JButton createCharacter;
    JPanel topPanel;
    JPanel bottomPanel;

    public MainScreen() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(100, 150);
        this.setMinimumSize(new Dimension(100, 150));
        this.setResizable(false);

        welcomeText = new JLabel("Welcome to Pheria: A Miserable Adventure. Please press the button if you want to proceed.");
        createCharacter = new JButton("Create Character");

        this.topPanel = new JPanel();
        this.bottomPanel = new JPanel();

        topPanel.add(welcomeText);
        bottomPanel.add(createCharacter);

        this.setLayout(new GridLayout(2,1));
        this.add(topPanel);
        this.add(bottomPanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public JButton getCreateCharacter() {
        return createCharacter;
    }
}
