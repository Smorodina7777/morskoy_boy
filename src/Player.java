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
        int[][]shipTitleCnt = {{Ship.kater, 4}, {Ship.esminets, 3}, {Ship.kreyser, 2}, {Ship.linkor, 1}};//массив кораблей
    }

    public void rename(String newName) {
        name = newName;
    }

    public String shot(int coord1, int coord2) {
        return ("Игрок " + name + " решил ударить по ячейке " + coord1 + ":" + coord2);
    }

    public void score() {
        point += 1;
        System.out.println("Счет игрока " + name + ": " + point);
    }
}

