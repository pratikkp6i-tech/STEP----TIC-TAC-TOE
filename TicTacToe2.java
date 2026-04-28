import java.util.Random;

public class TicTacToe2{
    // Game State Variables
    static String player1Name;
    static char player1Symbol;
    static String player2Name;
    static char player2Symbol;
    static String currentPlayer;

    public static void main(String[] args) {
        performToss();
    }

    /**
     * UC2: Randomly decides who starts and assigns symbols.
     */
    public static void performToss() {
        Random random = new Random();
        
        // Generate 0 or 1 (0 = Human starts, 1 = Computer starts)
        int toss = random.nextInt(2);

        if (toss == 0) {
            // Human starts
            player1Name = "Human";
            player1Symbol = 'X';
            player2Name = "Computer";
            player2Symbol = 'O';
            System.out.println("Toss outcome: Human starts first!");
        } else {
            // Computer starts
            player1Name = "Computer";
            player1Symbol = 'X';
            player2Name = "Human";
            player2Symbol = 'O';
            System.out.println("Toss outcome: Computer starts first!");
        }

        // Store current player information to track whose turn it is
        currentPlayer = player1Name;
        
        System.out.println(player1Name + " is assigned: " + player1Symbol);
        System.out.println(player2Name + " is assigned: " + player2Symbol);
    }
}