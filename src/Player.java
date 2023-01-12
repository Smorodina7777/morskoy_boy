public class Player {
    String name;
    int point;
    Ship[] shipList;
    Area area;


    public Player(String name) {
        this.name = name;
        shipList = new Ship[Area.countShip()];//массив кораблей
    }

    public Player(int point) {
        this.point = point;
        shipList = new Ship[Area.countShip()];//массив кораблей
    }

    public Player(String name, int point) {
        this.name = name;
        this.point = point;
        shipList = new Ship[Area.countShip()];//массив кораблей
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

    public void setArea(Area area) {
        this.area = area;
    }
}

