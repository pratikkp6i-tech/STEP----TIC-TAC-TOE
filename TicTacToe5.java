public class TicTacToe5 {

    /**
     * UC5: Validates if the move is within bounds and the cell is empty.
     * Returns true if the move is valid, false otherwise.
     */
    public static boolean isValidMove(char[][] board, int row, int col) {
        
        // 1. Boundary Checking
        // Ensure row and col are between 0 and 2
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid input: Move is out of board bounds.");
            return false;
        }

        // 2. Cell Occupancy Check
        // Check if the cell contains the initialization character '-'
        if (board[row][col] != '-') {
            System.out.println("Invalid move: This slot is already occupied.");
            return false;
        }

        // If both checks pass, the move is valid
        return true;
    }

    public static void main(String[] args) {
        // Example setup
        char[][] board = {
            {'-', 'X', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        // Testing an occupied cell (Row 0, Col 1)
        System.out.println("Move (0,1) valid? " + isValidMove(board, 0, 1)); 

        // Testing a valid empty cell (Row 0, Col 0)
        System.out.println("Move (0,0) valid? " + isValidMove(board, 0, 0));
    }
}