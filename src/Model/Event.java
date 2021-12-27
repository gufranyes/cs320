package Model;

public class Event {
    private String name;
    private int id;
    private int nextEvent1id;
    private int nextEvent2id;
    private int nextEvent3id;
    private int leaveID = 1;
    private Player player;
    private Actor actor;
    private String nextEvent1Str;
    private String nextEvent2Str;
    private String nextEvent3Str;
    private String leaveStr = "Leave";
    private boolean trade = false;
    private boolean fight = false;
    private Item tradeItem;

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

    public Event(String name, int id, int nextEvent1id, int nextEvent2id, int nextEvent3id, Player player, Actor actor, String nextEvent1Str, String nextEvent2Str, String nextEvent3Str) {
        this.name = name;
        this.id = id;
        this.nextEvent1id = nextEvent1id;
        this.nextEvent2id = nextEvent2id;
        this.nextEvent3id = nextEvent3id;
        this.player = player;
        this.actor = actor;
        this.nextEvent1Str = nextEvent1Str;
        this.nextEvent2Str = nextEvent2Str;
        this.nextEvent3Str = nextEvent3Str;
    }

    public Event(String name, int id, int nextEvent1id, int nextEvent2id, int nextEvent3id, int leaveID, Player player, Actor actor, String nextEvent1Str, String nextEvent2Str, String nextEvent3Str, String leaveStr, boolean trade, boolean fight) {
        this.name = name;
        this.id = id;
        this.nextEvent1id = nextEvent1id;
        this.nextEvent2id = nextEvent2id;
        this.nextEvent3id = nextEvent3id;
        this.leaveID = leaveID;
        this.player = player;
        this.actor = actor;
        this.nextEvent1Str = nextEvent1Str;
        this.nextEvent2Str = nextEvent2Str;
        this.nextEvent3Str = nextEvent3Str;
        this.leaveStr = leaveStr;
        this.fight = fight;
        this.trade = trade;
    }

    public Event(String name, int id, int nextEvent1id, int nextEvent2id, int nextEvent3id, int leaveID, Player player, Item item, String nextEvent1Str, String nextEvent2Str, String nextEvent3Str, String leaveStr, boolean trade, boolean fight) {
        this.name = name;
        this.id = id;
        this.nextEvent1id = nextEvent1id;
        this.nextEvent2id = nextEvent2id;
        this.nextEvent3id = nextEvent3id;
        this.leaveID = leaveID;
        this.player = player;
        this.tradeItem = item;
        this.nextEvent1Str = nextEvent1Str;
        this.nextEvent2Str = nextEvent2Str;
        this.nextEvent3Str = nextEvent3Str;
        this.leaveStr = leaveStr;
        this.fight = fight;
        this.trade = trade;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public String getNextEvent1Str() {
        return nextEvent1Str;
    }

    public String getNextEvent2Str() {
        return nextEvent2Str;
    }

    public String getNextEvent3Str() {
        return nextEvent3Str;
    }

    public String getLeaveStr() {
        return leaveStr;
    }

    public int getNextEvent1id() {
        return nextEvent1id;
    }

    public int getNextEvent2id() {
        return nextEvent2id;
    }

    public int getNextEvent3id() {
        return nextEvent3id;
    }

    public int getLeaveID() {
        return leaveID;
    }

    public boolean isFight() {
        return fight;
    }

    public boolean isTrade() {
        return trade;
    }

    public Actor getActor() {
        return actor;
    }

    public Item getTradeItem() {
        return tradeItem;
    }
}
