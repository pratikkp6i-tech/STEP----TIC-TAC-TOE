import java.util.Scanner;

public class TicTacToe3{
    
    // Static scanner to be used throughout the program
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Example of calling the method
        int slot = getPlayerInput();
        System.out.println("User selected slot: " + slot);
    }

    /**
     * UC3: Reads an integer input from the user.
     * Note: Validation (checking if 1-9 or if occupied) is usually 
     * handled in a separate Use Case.
     */
    public static int getPlayerInput() {
        System.out.print("Enter a slot (1-9) to place your move: ");
        
        // Read the integer from console
        int input = sc.nextInt();
        
        return input;
    }
}