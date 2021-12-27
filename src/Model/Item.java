package Model;

public class Item {
    private String name;
    private String type;
    private int damage;
    private int armor;
    private String special;
    private int price;
    public int bartered = 0;

    public Item(String name, String type, int damage, int armor, String special, int price) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.armor = armor;
        this.special = special;
        this.price = price;
    }

    public Item() {
        this.name = "TEST ITEM";
        this.type = "Weapon";
        this.damage = 15;
        this.armor = 0;
        this.special = "";
        this.price = 15;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    public String getSpecial() {
        return special;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
