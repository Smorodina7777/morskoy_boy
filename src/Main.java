public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Lena", 0);
        Player player2 = new Player("Anna", 0);

        Area field1 = new Area(player1);
        Area field2 = new Area(player2);


        Ship ship1 = new Ship("Esminets", player1);
        Ship ship2 = new Ship("Kater", player1);
        ship2.shipSize = 2;
        ship1.shipSize = 1;


        player1.rename("Olya");
        player2.rename("Sveta");
        player1.score();
        player2.score();

        String shot1 = player1.shot(1, 3);
        System.out.println(shot1);
        String shot2 = player2.shot(5, 8);
        System.out.println(shot2);

        System.out.println(ship1.getTitle() + " " + ship1.getSize());
        System.out.println(ship2.getTitle() + " " + ship2.getSize());

        Area.missed(2, 4);
        Area.destroyed(1, 2);
        Area.got(8, 5);
        Area.occupied(10, 10);
        Area.status();


    }
}