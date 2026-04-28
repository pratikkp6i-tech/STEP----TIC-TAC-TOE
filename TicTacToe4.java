public class TicTacToe4 {

    public static void main(String[] args) {
        int slot = 5; // Example input from UC3
        convertToIndices(slot);
    }

    /**
     * UC4: Converts a 1-9 slot number to row and column indices.
     */
    public static void convertToIndices(int slot) {
        // Adjust to zero-based indexing (1-9 becomes 0-8)
        int adjustedSlot = slot - 1;

        // Calculate row using integer division
        int row = adjustedSlot / 3;

        // Calculate column using modulo (remainder)
        int col = adjustedSlot % 3;

        System.out.println("Slot " + slot + " maps to: Row " + row + ", Column " + col);
    }
}