package TicTacToeLLD;

import TicTacToeLLD.models.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


// I guess the "orchestrator class"...
public class TicTacToeGame {

    // deque will be useful to maintain turns
    // P1(when done remove and put at end) , P2 (next), P1 (end)
    Deque<Player> players;
    Board gameBoard;


    public void initializeGame() {

        // Creating 2 Players

        // TODO() check if this is doubly LL or what..(for our deque)
        //  else not very efficient I'd say
        //  according to the video source it can perform as deque
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO circlePiece = new PlayingPieceO();
        Player player2 = new Player("Player2", circlePiece);

        // player 1 starts the game ... 1st turn to him/her thus...
        players.add(player1);
        players.add(player2);

        // Initialize Board of size 3
        gameBoard = new Board(3);

    }

    // the main orchestrator method I guess
    public String startGame() {

        boolean noWinner = true;

        // the game loop
        while (noWinner) {

            // Remove the player whose turn is and also put the player in the list back
            Player currentPlayer = players.removeFirst();

            // Get the free space from the board
            // if no free spaces, then game is already tied
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }


            // Read the user input, maybe later check validations
            System.out.print("Player: " + currentPlayer.name + " - Please enter [row, column]: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputColumn = Integer.parseInt(values[1]);

            // Place the piece in the board
            boolean validMove = gameBoard.addPiece(inputRow, inputColumn, currentPlayer.playingPiece);
            if (!validMove) {
                // Invalid Move: Player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again!");
                players.addFirst(currentPlayer); // Add the player back to the queue(in the front)
                continue;
            }

            players.addLast(currentPlayer); // Add the player to the end of the queue

            // Check if the valid move is a winning move or not
            boolean isWinner = checkForWinner(inputRow, inputColumn, currentPlayer.playingPiece.symbol);
            if (isWinner) {
                gameBoard.printBoard();
                return currentPlayer.name;
            }
        }

        return "Tie";
    }

    public boolean checkForWinner(int row, int column, PieceSymbol pieceSymbol) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check Row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].symbol != pieceSymbol) {
                rowMatch = false;
                break;
            }
        }

        // Check Column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].symbol != pieceSymbol) {
                columnMatch = false;
                break;
            }
        }

        // Check Diagonally
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].symbol != pieceSymbol) {
                diagonalMatch = false;
                break;
            }
        }

        // Check Anti-Diagonally
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].symbol != pieceSymbol) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}