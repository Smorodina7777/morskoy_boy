public class Ship {
    byte shipSize;
    String shipTitle;

    public Ship(byte shipSize) {
        this.shipSize = shipSize;
    }

    public Ship(String shipTitle) {
        this.shipTitle = shipTitle;
    }

    public Ship(byte shipSize, String shipTitle) {
        this.shipSize = shipSize;
        this.shipTitle = shipTitle;
    }

    public String getTitle() {
        return shipTitle;
    }

    public byte getSize() {
        return shipSize;
    }
}
