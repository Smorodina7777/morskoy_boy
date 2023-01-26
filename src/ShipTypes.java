public enum ShipTypes {
    KATER("Катер", "описание1", 1, 4),
    ESMINETS("Эсминец", "описание2", 2, 3),
    KREYSER("Крейсер", "описание3", 3, 2),
    LINKOR("Линкор", "описание4", 4, 1);
    String title;
    String disc;
    int size;
    int count;
    ShipTypes(String title, String disc,  int size, int count) {
        this.title=title;
        this.disc=disc;
        this.size=size;
        this.count=count;
    }

    public String getTitle() {
        return title;
    }

    public String getDisc() {
        return disc;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

}
