package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class MainScreenListener implements ActionListener {
    private JDialog currentFrame;
    private JFrame nextFrame;
    private JPanel characterPanel;

    public MainScreenListener(JDialog currentFrame, JFrame nextFrame, JPanel characterPanel) {
        this.currentFrame = currentFrame;
        this.nextFrame = nextFrame;
        this.characterPanel = characterPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nextFrame.add(characterPanel);
        nextFrame.setVisible(true);
        currentFrame.dispatchEvent(new WindowEvent(currentFrame, WindowEvent.WINDOW_CLOSING));
    }
}
