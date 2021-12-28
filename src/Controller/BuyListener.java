package Controller;


import Model.Item;
import View.TradeScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuyListener implements ActionListener {
    StoryController storyController;
    Item item;
    TradeScreen tradeScreen;

    public BuyListener(StoryController storyController, Item item, TradeScreen tradeScreen) {
        this.storyController = storyController;
        this.item = item;
        this.tradeScreen = tradeScreen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (storyController.player.getMoney() >= item.getPrice()) {
            for (Item i : storyController.player.getInventory()) {
                if (item.getType().equals(i.getType())) {
                    storyController.player.getInventory().remove(i);
                }
            }

            storyController.player.setMoney(storyController.player.getMoney() - item.getPrice());
            storyController.player.getInventory().add(item);
        } else {
            JFrame warning = new JFrame();
            JOptionPane.showMessageDialog(warning, "You don't have enough money!");
        }

        tradeScreen.dispose();
    }
}
