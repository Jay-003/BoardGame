import java.sql.Array;
import java.util.ArrayList;

public class Board {

    //game board of type piece.
    private Piece[][] gameBoard = new Piece[8][8];

    //Constructor
    public Board() {
    }

    /**
     * Method: newPiece(piece: Piece)
     *
     * adds a new piece to the game board.
     *
     * @param piece piece to be added to the board.
     */
    public void newPiece(Piece piece) {

        int x = piece.getPosition()[0];
        int y = piece.getPosition()[1];

        if(gameBoard[x][y] == null) {
            gameBoard[x][y] = piece;
        }
        else {
            System.out.println("There's already a piece there");
        }
    }

    /**
     * Method: move(pos: int[], direction: String, n: int)
     *
     * moves the piece by n steps in any direction.
     *
     * @param position inputs the position of piece to be moved.
     * @param direction inputs direction in which the piece is asked to move.
     * @param n number of steps by which th piece has to be moved.
     *
     */
    public void move (int[] position, String direction, int n) {
        int x = position[0];
        int y = position[1];

        if(gameBoard[x][y] != null) {
            if ((x > 0 && y > 0) && (x<8 && y<8)) {
                System.out.println("Piece at " + "(" + x + "," + y + ") moved " + direction + " by " + n + " spaces");
                if (direction.equals("right")) {
                    if (x + n < 8) {
                        x = x + n;
                    }

                }
                if (direction.equals("left")) {
                    if (x - n >= 0) {
                        x = x - n;
                    }
                }
                if (direction.equals("up")) {
                    if (y - n >= 0) {
                        y = y - n;
                    }
                }
                if (direction.equals("down")) {
                    if (y + n < 8) {
                        y = y + n;
                    }
                }
                gameBoard[x][y] = gameBoard[position[0]][position[1]];
                gameBoard[position[0]][position[1]] = null;
                gameBoard[x][y].setPosition(new int[]{x,y});

            } else {
                System.out.println("Piece can't be moved");
            }
        }

        else {
            System.out.println("Error: no piece at " + "(" + x + "," + y + ")");
        }

    }

    public void display() {

        for(int i=0; i< gameBoard.length; i++) {
            for (Piece[] pieces : gameBoard) {
                if (pieces[i] == null) {
                    System.out.print("  -   ");
                } else {
                    System.out.print(pieces[i].toString());
                }
            }
            System.out.println();
        }
    }
}
