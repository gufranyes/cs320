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

    public void fight(Actor actor) {
        Random rng = new Random();
        int weaponDamage = 0;
        for (Item i : inventory) {
            if (i.getType().equals("Weapon")) weaponDamage = i.getDamage();
        }

        int enemyArmor = 0;
        for (Item i : actor.inventory) {
            if (i.getType().equals("Armor")) enemyArmor = i.getArmor();
        }

        int bonus = this.getSTR();

        if (this.getDEX() > bonus) bonus = this.getDEX();
        if (this.getINT() > bonus) bonus = this.getINT();
        bonus = bonus / 4;

        int damage = (rng.nextInt(20) + 1) + bonus + weaponDamage - enemyArmor;

        actor.setHealth(actor.getHealth() - damage);
    }


    // I'm not sure about what to do here
    public void trade(Actor actor, Item item) {
        Random rng = new Random();


    }
}


