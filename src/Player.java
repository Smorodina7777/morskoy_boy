public class Player {
    String name;
    int point;

    public Player(String name) {
        this.name = name;
    }

    public Player(int point) {
        this.point = point;
    }

    public Player(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public void rename(String new_name) {
        name = new_name;
    }

    public String shot(int coord1, int coord2) {
        return ("Игрок " + name + " решил ударить по ячейке " + coord1 + ":" + coord2);
    }

    public void score() {
        point += 1;
        System.out.println("Счет игрока " + name + ": " + point);
    }
}

