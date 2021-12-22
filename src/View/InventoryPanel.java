package View;

import Model.Item;
import Model.Player;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InventoryPanel extends JPanel {
    private JTextArea inventoryArea;
    private Player player;

    public void getItems() {
        ArrayList<Item> inventory = player.getInventory();
        inventoryArea.setText("");

        for (Item i : inventory) {
            inventoryArea.append(i.getName() + "\n");
        }
    }

    public InventoryPanel(Player player) {
        this.player = player;
        inventoryArea = new JTextArea("test\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\ntest\n");
        this.getItems();
        this.setLayout(new GridLayout());
        this.add(inventoryArea);
    }
}
