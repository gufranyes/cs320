package Controller;

import Model.Actor;
import Model.Item;
import View.TradeScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarterListener implements ActionListener {
    StoryController storyController;
    Actor actor;
    Item item;
    TradeScreen tradeScreen;

    public BarterListener(StoryController storyController, Actor actor, Item item, TradeScreen tradeScreen) {
        this.storyController = storyController;
        this.actor = actor;
        this.item = item;
        this.tradeScreen = tradeScreen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (item.bartered < 2) {
            int playerRoll = storyController.player.trade();
            int traderRoll = actor.trade();

            if (playerRoll > traderRoll) {
                item.setPrice(item.getPrice() / 2);
            }
            else if (traderRoll > playerRoll) {
                item.setPrice(item.getPrice() * 2);
            }
            tradeScreen.getItemPrice().setText("Price: " + item.getPrice());
            item.bartered++;
        }

        if (item.bartered == 2) {
            tradeScreen.getBarter().setEnabled(false);
        }
    }
}
