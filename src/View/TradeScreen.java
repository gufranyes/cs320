package View;

import Controller.BarterListener;
import Controller.BuyListener;
import Controller.StoryController;
import Model.Actor;
import Model.Item;

import javax.swing.*;
import java.awt.*;

public class TradeScreen extends JDialog {
    private Item item;
    private JLabel itemName;
    private JLabel itemType;
    private JLabel itemModifier;
    private JLabel itemSpecial;
    private JLabel itemPrice;
    private JPanel itemPanel;
    private JPanel buttonPanel;
    private JButton barter;
    private JButton buy;
    private StoryController storyController;

    public TradeScreen(Item item, StoryController storyController, Actor actor) {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(350, 350); //Default size, it is too big for small laptops
        this.setMinimumSize(new Dimension(350, 350));
        this.setLayout(new GridLayout(2, 1));

        itemName = new JLabel();
        itemType = new JLabel();
        itemModifier = new JLabel();
        itemSpecial = new JLabel();
        itemPrice = new JLabel();

        this.storyController = storyController;
        this.item = item;

        this.itemPanel = new JPanel();
        this.buttonPanel = new JPanel();

        this.itemName.setText("Item name: " + item.getName());
        this.itemType.setText("Item type: " + item.getType());
        if (item.getType().equals("Armor")) {
            itemModifier.setText("Armor Modifier: " + item.getArmor());
        }
        else if (item.getType().equals("Weapon")) {
            itemModifier.setText("Weapon Damage: " + item.getDamage());
        }
        this.itemSpecial.setText("Special: " + item.getSpecial());
        this.itemPrice.setText("Price: " + item.getPrice());

        this.barter = new JButton("Barter");
        barter.addActionListener(new BarterListener(storyController, actor, item, this));
        this.buy = new JButton("Buy");
        buy.addActionListener(new BuyListener(storyController, item, this));

        itemPanel.setLayout(new GridLayout(0, 1));
        itemPanel.add(itemName);
        itemPanel.add(itemType);
        itemPanel.add(itemModifier);
        itemPanel.add(itemSpecial);
        itemPanel.add(itemPrice);

        buttonPanel.add(barter);
        buttonPanel.add(buy);

        this.add(itemPanel);
        this.add(buttonPanel);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public JLabel getItemPrice() {
        return itemPrice;
    }

    public JButton getBarter() {
        return barter;
    }
}
