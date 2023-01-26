public class Ship {
    byte shipSize;
    String shipTitle;
    // размеры кораблей
    static String esminets2 = ShipTypes.ESMINETS.getTitle();
    static String kater1 = ShipTypes.KATER.getTitle();
    static String linkor4 =ShipTypes.LINKOR.getTitle();
    static String kreyser3 = ShipTypes.KREYSER.getTitle();

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
