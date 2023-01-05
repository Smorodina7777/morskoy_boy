public class Area {
    static int[][] field = new int[10][10];
    Player player;


    Area(Player player) {
        this.player = player;
    }

    static int[] rule = new int[]{4, 3, 2, 1, 0}; //правила игры


    static void occupied(int coord1, int coord2) {
        field[coord1 - 1][coord2 - 1] = 1;
    }

    static void missed(int coord1, int coord2) {
        field[coord1 - 1][coord2 - 1] = 2;
    }

    static void got(int coord1, int coord2) {
        field[coord1 - 1][coord2 - 1] = 3;
    }

    static void destroyed(int coord1, int coord2) {
        field[coord1 - 1][coord2 - 1] = 4;
    }

    static void status() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
