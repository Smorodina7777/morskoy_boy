public class Area {
    int[][] field = new int[10][10];
    Player player;
    static int[] rule = new int[]{4, 3, 2, 1}; //правила игры
    Area(Player player) {
        this.player = player;
    }

    //подсчет количества кораблей
   /* static void countShips() {
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < 9 && j < 9 && field[i][j] == 1 && field[i + 1][j] !=1 && field[i][j + 1] !=1) {
                    int cnt = 1;
                    for (int a = i - 1; a > i - 4; a--) {

                        if (a >= 0 && field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j - 1; b > j - 4; b--) {

                        if (b >= 0 && field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }
                }
                if (i == 9 && j < 9 && field[i][j] == 1 && field[i][j + 1] !=1) {
                    int cnt = 1;
                    for (int a = i - 1; a > i - 4; a--) {

                        if (a >= 0 && field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j - 1; b > j - 4; b--) {

                        if (b >= 0 && field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }

                }
                if (i < 9 && j == 9 && field[i][j] == 1 && field[i + 1][j] !=1) {
                    int cnt = 1;
                    for (int a = i - 1; a > i - 4; a--) {

                        if (a >= 0 && field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j - 1; b > j - 4; b--) {

                        if (b >= 0 && field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }
                }
                if (i == 9 && j == 9 && field[i][j] == 1) {
                    int cnt = 1;
                    for (int a = i - 1; a > i - 4; a--) {

                        if (a >= 0 && field[a][j] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    for (int b = j - 1; b > j - 4; b--) {

                        if (b >= 0 && field[i][b] == 1) {
                            cnt += 1;
                        } else {
                            break;
                        }

                    }
                    if (cnt == 4) {
                        cnt4++;
                    } else if (cnt == 3) {
                        cnt3++;
                    } else if (cnt == 2) {
                        cnt2++;
                    } else if (cnt == 1) {
                        cnt1++;
                    }
                }

            }
        }
        System.out.println("Kater - "+cnt1);
        System.out.println("Esminets - "+cnt2);
        System.out.println("Kreyser - "+cnt3);
        System.out.println("Linkor - "+cnt4);

    }
*/
    static int countShip(){
        int result = 0;
        for (int i=0; i<rule.length; i++){
            result+=rule[i];
        }
        return result;
    }
       void occupied(int coord1, int coord2) { //поставить корабль
        field[coord1][coord2] = 1;
    }

    void missed(int coord1, int coord2) {//мимо
        field[coord1][coord2] = 2;
    }

    void got(int coord1, int coord2) {//попал
        field[coord1][coord2] = 3;
    }
    void destroyed(int coord1, int coord2) {//убит
        field[coord1][coord2] = 4;
    }

    void status() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
