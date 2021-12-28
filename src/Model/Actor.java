package Model;

import java.util.ArrayList;
import java.util.Random;

public class Actor {
    private String name;
    private int health;
    private String background;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int charisma;
    private String race;
    private int money;
    private ArrayList<Item> inventory;
    private ArrayList<String> feats;

    public Actor(String name, int health, String background, int strength, int dexterity, int intelligence, int charisma, String race, int money, ArrayList<Item> inventory, ArrayList<String> feats) {
        this.name = name;
        this.health = health;
        this.background = background;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.race = race;
        this.money = money;
        this.inventory = inventory;
        this.feats = feats;
    }

    public Actor(String name, int health, String background, int strength, int dexterity, int intelligence, int charisma, String race) {
        this.name = name;
        this.health = health;
        this.background = background;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.race = race;

        this.money = 0;
        this.inventory = new ArrayList<>();
        this.feats = new ArrayList<>();
    }

    public Actor() {
        this.name = "Default Name, SHOULD NOT APPEAR";
        this.health = 999999999;
        this.background = "Default Background, SHOULD NOT APPEAR";
        this.strength = 999999999;
        this.dexterity = 999999999;
        this.intelligence = 999999999;
        this.charisma = 999999999;
        this.race = "Default Race, SHOULD NOT APPEAR";
        this.money = 999999999;
        this.inventory = new ArrayList<>();
        this.feats = new ArrayList<>();
    }

    public Actor(int health) {
        this.name = "Default Name, SHOULD NOT APPEAR";
        this.health = health;
        this.background = "Default Background, SHOULD NOT APPEAR";
        this.strength = 0;
        this.dexterity = 0;
        this.intelligence = 0;
        this.charisma = 0;
        this.race = "Default Race, SHOULD NOT APPEAR";
        this.money = 0;
        this.inventory = new ArrayList<>();
        this.feats = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getBackground() {
        return background;
    }

    public int getSTR() {
        return strength;
    }

    public int getDEX() {
        return dexterity;
    }

    public int getINT() {
        return intelligence;
    }

    public int getCHA() {
        return charisma;
    }

    public String getRace() {
        return race;
    }

    public ArrayList<Item> getInventory() {return inventory;}

    public ArrayList<String> getFeats() {
        return feats;
    }

    public void setSTR(int str) {
        this.strength = str;
    }

    public void setDEX(int dex) {
        this.dexterity = dex;
    }

    public void setINT(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setCHA(int cha) {
        this.charisma = cha;
    }

    public void addFeat(String feat) {
        feats.add(feat);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public int fight(Actor actor) {
        Random rng = new Random();

        int bonus = rng.nextInt(20) + 1;

        if (this.getClass().equals("Fighter") || this.getClass().equals("Paladin")) {
            bonus += (this.getSTR() / 4);
        }
        else if (this.getClass().equals("Mage") || this.getClass().equals("Druid")) {
            bonus += (this.getINT() / 4);
        }
        else if (this.getClass().equals("Rogue") || this.getClass().equals("Ranger")) {
            bonus += (this.getDEX() / 4);
        }

        for (Item item : this.getInventory()) {
            if (item.getType().equals("Weapon")) {
                bonus += item.getDamage();
            }
            if (item.getType().equals("Off Hand")) {
                bonus += item.getDamage() / 2;
            }
        }

        for (Item item : actor.getInventory()) {
            if (item.getType().equals("Armor")) {
                bonus -= item.getArmor();
            }
        }

        return bonus;
    }

    public int trade() {
        Random rng = new Random();

        int bonus = rng.nextInt(20) + 1;
        bonus += this.getCHA();

        for (String s : this.getFeats()) {
            if (s.equals("Trader")) bonus += 2;
        }

        return bonus;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}


