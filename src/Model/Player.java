package Model;

import java.util.ArrayList;


public class Player extends Actor{
    private int skillPoints;
    private String Class;

    public Player(String name, int health, String background, int strength, int dexterity, int intelligence, int charisma, String race, int money, ArrayList<Item> inventory, int skillPoints, ArrayList<String> feats, String Class) {
        super(name, health, background, strength, dexterity, intelligence, charisma, race, money, inventory, feats);
        this.skillPoints = skillPoints;
        this.Class = Class;
    }

    public Player(String name, int health, String background, int strength, int dexterity, int intelligence, int charisma, String race, String Class) {
        super(name, health, background, strength, dexterity, intelligence, charisma, race);
        this.Class = Class;
        this.skillPoints = 25;
    }

    public Player() {
        super();
        this.skillPoints = 25;
        this.Class = "Fighter";
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public String getCharacterClass() {
        return Class;
    }
}
