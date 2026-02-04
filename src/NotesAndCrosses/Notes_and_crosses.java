package NotesAndCrosses;
// sess 1:
/*
PLAN
- have a method that prints out the notes and crosses grid with a parameter of what square
  is chosen and what player for
- another class for checking if there is a valid winning result

1. print grid
2. randomly allocate which player gets to go first
3. when a player has entered a VALID command (cannot be a value which is already set)
4. swap to the second player
5. end the game once, there is a winner
----- later -- 6. give option to save result to a text file, and read result from that text file
7. give option to ask if to restart game/ play another

extra for fun:
    STATS:
        - fastest time for a win
        - most wins from a player
        - longest game
        - leaderboard

 */

public class Notes_and_crosses {
    public static void main(String [] args) {
       Table table = new Table();
       table.startGame();
       boolean gameWon = false;
       while (!gameWon) {
            table.drawTable();
            table.setPlayerTurn();

       }
//       table.setPosition(0, 0, true);
//       table.setPosition(1,4, false);
//       table.setPosition(1, 1, false);

    }

}
