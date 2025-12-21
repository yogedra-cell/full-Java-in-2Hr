import java.util.Scanner;

public class TicTacToe {

    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        int move;

        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + " turn. Enter position (1-9): ");
            move = sc.nextInt() - 1;

            if (move >= 0 && move < 9 && board[move] == ' ') {
                board[move] = currentPlayer;
            } else {
                System.out.println("Invalid move, try again!");
                continue;
            }

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " WINS!");
                break;
            }

            if (isDraw()) {
                printBoard();
                System.out.println("It's a DRAW!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        sc.close();
    }

    public static void printBoard() {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
    }

    public static boolean checkWin(char player) {
        int[][] winPatterns = {
                {0,1,2},{3,4,5},{6,7,8},  // rows
                {0,3,6},{1,4,7},{2,5,8},  // cols
                {0,4,8},{2,4,6}           // diagonals
        };
        for (int[] pattern : winPatterns) {
            if (board[pattern[0]] == player &&
                board[pattern[1]] == player &&
                board[pattern[2]] == player) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDraw() {
        for (char c : board) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }
}
