package View;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JDialog {
    JLabel welcomeText;
    JButton createCharacter;

    public MainScreen() {
        welcomeText = new JLabel("Welcome to Pheria: A Miserable Adventure. Please press the button if you want to proceed.");
        createCharacter = new JButton("Create Character");

        this.setLayout(new GridLayout(2,1));
        this.add(welcomeText);
        this.add(createCharacter);
    }
}
