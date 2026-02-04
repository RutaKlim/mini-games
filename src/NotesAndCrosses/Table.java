package NotesAndCrosses;

import java.util.Scanner;

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

    final String PLAYER_X = "x";
    final String PLAYER_O = "o";

    boolean player1;
    int playerNum;

    String[][] values = new String[][] {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

//    public void setPosition(int row, int col, boolean player1) throws IllegalArgumentException {
//        if (row > 3 || row < 0 || col < 0 || col > 3) {
//            throw new IllegalArgumentException("You entered row as: "+ row +", and column as: "+ col +", where both have must be 0 to 3.");
//        }
//        if (player1) { values[row][col] = PLAYER1; } else { values[row][col] = PLAYER2; }
//    }

    public void setPlayerTurn() {
        if (player1) { playerNum = 'x'; } else { playerNum = 'o'; }
    }

    // this returns whether a given player has won the game was won
    // false for not won, and true that that player has won
    public boolean gameWon(boolean player1) {
        this.player1 = player1;
        return false;
    }

    public void printGo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player "+ playerNum +"'s go. Enter coordinate (x,y) from top left of position to mark: ");
        String text = sc.nextLine();
        text = text.trim();
        int indexOfComma = text.indexOf(",");
        int row = Integer.parseInt(text.substring(indexOfComma - 1, indexOfComma));
        int col = Integer.parseInt(text.substring(indexOfComma + 1, indexOfComma + 2));
        
    }

    public void startGame() {
        System.out.println("First to have a line of 3 wins. To enter coordinates write \"x,y\"" );

        // set a random player to start
        double rand = Math.random();
        player1 = rand > 0.5;

        setPlayerTurn();
    }

    public void setPosition(int row, int col, boolean player1) {
        this.player1 = player1;
        setPlayerTurn();
        if (row > 3 || row < 0 || col < 0 || col > 3) {  }
        if (player1) { values[row][col] = PLAYER_X; } else { values[row][col] = PLAYER_O; }
    }

    public void drawTable() {
        System.out.println();
        for (int r = 0; r < 3; r++ ) {
                System.out.println("  "+ values[r][0] +"  |  "+ values[r][1] +"  |  "+ values[r][2]);
                if (r < 2) {  System.out.println("-----+-----+-----"); }
        }
    }
}
