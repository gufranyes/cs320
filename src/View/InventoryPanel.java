package View;

import Model.Item;
import Model.Player;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InventoryPanel extends JPanel {
    private JTextArea inventoryArea;

    public void getItems(Player player) {
        ArrayList<Item> inventory = player.getInventory();
        inventoryArea.setText("");

        for (Item i : inventory) {
            inventoryArea.append(i.getName() + "\n");
        }
    }

    public InventoryPanel() {
        inventoryArea = new JTextArea("test\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\n");
        this.setLayout(new GridLayout());
        this.add(inventoryArea);
    }
}
