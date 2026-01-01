package TicTacToeLLD.models;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;

    // I guess this is how 2d array is referenced in java
    // we use null here as a reference to see if cell occupied or not..
    // better to check the initialization logic in java....
    // see the constructor
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        // seems like this is initialized with all nulls, the matrix..
        this.board = new PlayingPiece[size][size];
    }

    // bool to return flag if added succeeded or not
    public boolean addPiece(int row, int column, PlayingPiece piece) {

        if (board[row][column] != null) {
            return false;
        }

        board[row][column] = piece;

        return true;

    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // if null, then free...
                if (board[i][j] == null) {
                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
                    freeCells.add(rowColumn);
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].symbol + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


}
