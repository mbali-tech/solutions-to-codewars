/* Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!" */

public class Rps {
  public static String rps(String p1, String p2) {
    // your code here
     if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("rock") && p2.equals("scissors") ||
                   p1.equals("paper") && p2.equals("rock") ||
                   p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
  }