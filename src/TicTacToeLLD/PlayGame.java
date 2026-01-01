package TicTacToeLLD;

public class PlayGame {
    public static void main(String[] args) {
        System.out.println("\n===>>> TicTacToe Game\n");
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        game.startGame();

    }
}
