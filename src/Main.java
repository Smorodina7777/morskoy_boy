public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Lena");
        Player player2 = new Player("Anna");
        player1.point = 0;
        player2.point = 0;

        Ship ship1 = new Ship("Esminets");
        Ship ship2 = new Ship("Kater");
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

    }
}