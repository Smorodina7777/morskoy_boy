public class Ship {
    byte shipSize;
    String shipTitle;
    // размеры кораблей
    static int esminets = 2;
    static int kater = 1;
    static int linkor = 4;
    static int kreyser = 3;
    private Player name;

    public Ship(byte shipSize, Player name) {
        this.shipSize = shipSize;
        this.name = name;
    }


    public Ship(String shipTitle, Player name) {
        this.shipTitle = shipTitle;
        this.name = name;
    }

    public Ship(byte shipSize, String shipTitle, Player name) {
        this.shipSize = shipSize;
        this.shipTitle = shipTitle;
        this.name = name;
    }

    public String getTitle() {
        return shipTitle;
    }

    public byte getSize() {
        return shipSize;
    }

    public Player getName() {
        return name;
    }

    public void setName(Player name) {
        this.name = name;
    }

}
