package Model;

public class Event {
    private String name;
    private int id;
    private int nextEvent1id;
    private int nextEvent2id;
    private int nextEvent3id;
    private Player player;
    private Actor actor;

    public Event() {
        this.name = "Default Event";
        this.id = -1500;
        this.nextEvent1id = -1499;
        this.nextEvent2id = -1498;
        this.nextEvent3id = -1497;
        this.player = new Player();
        this.actor = new Actor();
    }

    public Event(String name, int id, int nextEvent1id, int nextEvent2id, int nextEvent3id, Player player, Actor actor) {
        this.name = name;
        this.id = id;
        this.nextEvent1id = nextEvent1id;
        this.nextEvent2id = nextEvent2id;
        this.nextEvent3id = nextEvent3id;
        this.player = player;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }
}
