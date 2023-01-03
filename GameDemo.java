import java.util.Scanner;

//Demo Class
public class GameDemo {
    public static void main(String[] args) {

        //Board object
        Board gameBoard = new Board();
        Piece piece = new Piece();

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a command (type help for details): ");

        String input = kb.nextLine();

        //while loop to play the game until user inputs exit.
        while(!input.equals("exit")) {
            String[] inSplit = input.split(" ");

            if (inSplit[0].equals("help")) {
                System.out.println("Possible commands are as follows:");
                System.out.println("create location [fast][flexible]: Creates a new piece.");
                System.out.println("move location direction [spaces]: Moves a piece.");
                System.out.println("print: Displays the board.");
                System.out.println("help: Displays help.");
                System.out.println("exit: Exits the program.");
                System.out.println();
                System.out.println("Enter a command (type help for details): ");
            }

            if (inSplit[0].equals("print")) {
                gameBoard.display();
                System.out.println();
                System.out.println("Enter a command (type help for details): ");
            }

            if (inSplit[0].equals("create")) {
                System.out.println("Input a name for the new piece: ");
                String name = kb.next();
                System.out.println("Input a color for the new piece: ");
                String color = kb.next();
                int[] position = {Integer.parseInt((inSplit[1])), Integer.parseInt(inSplit[2])};
                if (inSplit.length == 3) {
                    piece = new SlowPiece(name, color, position);
                    gameBoard.newPiece(piece);
                } else if (inSplit.length == 4) {
                    if (inSplit[3].equals("fast")) {
                        piece = new FastPiece(name, color, position);
                        gameBoard.newPiece(piece);
                    } else {
                        piece = new SlowFlexible(name, color, position);
                        gameBoard.newPiece(piece);
                    }
                } else {
                    piece = new FastFlexible(name, color, position);
                    gameBoard.newPiece(piece);
                }
                System.out.println();
                System.out.println("Enter a command (type help for details): ");

            }

            if (inSplit[0].equals("move")) {
                int x = Integer.parseInt((inSplit[1]));
                int y = Integer.parseInt(inSplit[2]);
                int[] position = {x, y};
                if (inSplit.length == 3 && position != piece.getPosition()) {
                    System.out.println("Error: no piece at " + "(" + x + "," + y + ")");
                }
                else if (inSplit.length == 4) {
                    gameBoard.move(position, inSplit[3], 1);
                } else if (inSplit.length == 5) {
                    gameBoard.move(position, inSplit[3], Integer.parseInt(inSplit[4]));
                }
                System.out.println();
                System.out.println("Enter a command (type help for details): ");
            }
            input = kb.nextLine();
        }

        System.out.println("Done.");

    }
}
