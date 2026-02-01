package NotesAndCrosses;

import java.util.Arrays;

public class Table {
    /*
    |  x  |  x  |  o  |
    ------+-----+------
    |  o  |  o  |  x  |
    ------+-----+------
    |  o  |  x  |  x  |
     */
    // player 1 is true
    // player 2 is false

    final String PLAYER1 = "x";
    final String PLAYER2 = "o";

    String[] values = new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public void setPositionForPlayer1(int p) {
        values[p] = PLAYER1;
    }
    public void setPositionForPlayer2(int p) {
        values[p] = PLAYER2;
    }

    public void drawTable() {
        System.out.println();
        for (int i = 0; i < 3; i++ ) {
            System.out.println("  "+ values[i*3] +"  |  "+ values[i*3+1] +"  |  "+ values[i*3+2]);
            if (i < 2) {  System.out.println("-----+-----+-----"); }
        }
    }
}
